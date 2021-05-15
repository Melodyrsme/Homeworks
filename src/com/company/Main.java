package com.company;

public class Main {

    public static void main(String[] args) {
        Credit[] credits = new Credit[3];
        credits[0] = new Credit(1, 35500, "3 месяца", 5);
        credits[1] = new Credit(2, 1000000, "2 года", 2.5);
        credits[2] = new Credit(3, 500000, "1 год", 2.1);
        for (Credit credit : credits) {
            System.out.println(credit.toString());
        }
        System.out.println("Количество выданных кредитов: ");
        System.out.println(Credit.getAmountOfCredits());
        System.out.println("Общая сумма выданных кредитов: ");
        System.out.println(Credit.getTotalAmount());
        System.out.println("Средняя сумма кредитов: ");
        System.out.println(Credit.getAverageSum());
    }
}
