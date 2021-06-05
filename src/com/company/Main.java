package com.company;

public class Main {

    public static void main(String[] args) {
        Firefighter[] firefighter = new Firefighter[3];
        Merchant[] merchants = new Merchant[3];
        Pensioner[] pensioners = new Pensioner[3];

        firefighter[0] = new Firefighter("Антон", 25, 29000, 3);
        firefighter[1] = new Firefighter("Дамир", 33, 28000, 4);
        firefighter[2] = new Firefighter("Генадий", 38, 30000, 6);

        merchants[0] = new Merchant("Рабия", 24, 35000, 2);
        merchants[1] = new Merchant("Сания", 27, 39000, 4);
        merchants[2] = new Merchant("Олег", 25, 38000, 3);

        pensioners[0] = new Pensioner("Александр", 59, 6000, 6);
        pensioners[1] = new Pensioner("Александр", 55, 7000, 5);
        pensioners[2] = new Pensioner("Александр", 63, 8000, 8);

        sort(firefighter);
        sort(merchants);
        sort(pensioners);
        System.out.println("Отсортированный список пожарных по полю стаж:");
        for(Firefighter firefighter1 : firefighter){
            System.out.println(firefighter1.toString());
        }
        System.out.println("Отсортированный список коммерсантов по полю зарплата:");
        for(Merchant merchant : merchants){
            System.out.println(merchant.toString());
        }
        System.out.println("Отсортированный список пенсионеров по полю возраст:");
        for(Pensioner pensioner : pensioners){
            System.out.println(pensioner.toString());
        }
    }

    public static Comparable[] sort(Comparable[] comparables) {
        for (int i = 0; i < comparables.length - 1; i++) {
            for (int j = 0; j < comparables.length - 1; j++) {
                if (comparables[j].compareTo(comparables[j + 1]) < 0) {
                    Comparable comparable = comparables[j];
                    comparables[j] = comparables[j + 1];
                    comparables[j + 1] = comparable;
                }
            }
        }
        return comparables;
    }
}