package com.company;

public class Main {

    public static void main(String[] args) {
        Backpack backpack1 = new Backpack();
        for (int i = 0; i < 20; i++) {
            backpack1.addSmtCircle(new Apple());
        }
        backpack1.addSmtFlat(new Book());
        backpack1.addSmtCylindrical(new CocaCola());
        System.out.println(backpack1.checkCircle());


        System.out.println(backpack1.toString());

        Backpack backpack2 = new Backpack();
        for (int i = 0; i < 50; i++) {
            backpack2.addSmtCircle(new TennisBall());
        }
        backpack2.addSmtFlat(new Folder());
        backpack2.addSmtCylindrical(new Bottle());
        checkBackpack(backpack2);

        System.out.println(backpack2.toString());

        Backpack backpack3 = new Backpack();
        for (int i = 0; i < 10; i++) {
            backpack3.addSmtCircle(new Apple());
        }
        for (int i = 0; i < 3; i++) {
            backpack3.addSmtCircle(new TennisBall());
        }
        backpack3.addSmtFlat(new Folder());
        backpack3.addSmtCylindrical(new CocaCola());
        System.out.println(backpack3.checkCircle());
        System.out.println(backpack3.toString());
    }

    public static void checkBackpack(Backpack backpack) {
    }
}
