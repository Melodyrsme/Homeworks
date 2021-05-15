package com.company;

public class Credit {
    private int id;
    private double sumOfCredit;
    private String period;
    private double interestRate;

    private static int amountOfCredits;
    private static double totalAmount;

    public Credit(){
    }

    public Credit(int id, double sumOfCredit, String period, double interestRate) {
        this.id = id;
        this.sumOfCredit = sumOfCredit;
        this.period = period;
        this.interestRate = interestRate;
        amountOfCredits++;
        totalAmount += sumOfCredit;
    }
    @Override
    public String toString(){
        return String.
                format("Кредит #%s\nСумма кредита - %s\nПериод - %s\nПроцентная ставка - %s\n",
                        this.id, this.sumOfCredit, this.period, this.interestRate);
    }
    public static int getAmountOfCredits(){
        return amountOfCredits;
    }
    public static double getTotalAmount(){
        return totalAmount;
    }
    public static double getAverageSum(){
        return totalAmount/amountOfCredits;
    }
}
