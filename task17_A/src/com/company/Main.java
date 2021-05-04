package com.company;

public class Main {

    public static void main(String[] args) {
        Display display = new Display(19, "Lenovo", "IPS");
        SSD ssd = new SSD(256, 2);
        Ram ram = new Ram(8, "HyperX");
        Usb[] usb = new Usb[3];
        usb[0] = new Usb("2.0", 1);
        usb[1] = new Usb("2.0", 2);
        usb[2] = new Usb("2.0", 3);
        String[] layouts = new String[2];
        layouts[0] = "Russian";
        layouts[1] = "English";
        Keyboard keyboard = new Keyboard(layouts, true, true);
        Computer computer = new Computer(display, "Lenovo", "Grey", ssd, ram,
                "NVIDIA GeForce MX110", usb, keyboard);
        System.out.println("Марка компьютера - " + computer.getMark());
        System.out.println("Цвет компьютера - " + computer.getColor());
        System.out.println("Объем оперативной памяти - " + computer.getRam().getVolume());
        System.out.println("Производитель опертивной памяти - " + computer.getRam().getManufacturer());
        System.out.println("Видео-карта компьютера - " + computer.getGraphicsCard());
        System.out.println("Диагональ дисплея - " + computer.getDisplay().getDiagonal());
        System.out.println("Производитель дисплея - " + computer.getDisplay().getManufacturer());
        System.out.println("Тип матрицы - " + computer.getDisplay().getMatrixType());
        System.out.println("Объём жёсткого диска - " + computer.getSsd().getMemorySize());
        System.out.println("Количество дисков - " + computer.getSsd().getNumberOfDisks());
        System.out.println("Количество USB портов - " + usb.length);
        for (int i = 0; i < usb.length; i++) {
            System.out.println((i + 1) + " порт:");
            System.out.println("Тип порта - " + computer.getUsbs()[i].getTypeOfPort());
            System.out.println("ID порта - " + computer.getUsbs()[i].getId());
            System.out.println();
        }
        System.out.println("Раскладки клавиатуры: " + computer.getKeyboard().getKeyboardLayouts()[0] + ", "
                + computer.getKeyboard().getKeyboardLayouts()[1]);
        if (computer.getKeyboard().isBacklight()) {
            System.out.println("Клавиатура с подсветкой");
        } else {
            System.out.println("Клавиатура без подсветки");
        }
        if (computer.getKeyboard().isAdditionalNumbers()) {
            System.out.println("Клавиатура с дополнительными цифрами справа");
        } else {
            System.out.println("Клавиатура без дополнительных цифр справа");
        }
    }
}
