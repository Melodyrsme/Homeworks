package com.company;

public class Pepperoni extends Pizza {
    private boolean isAcute;

    public Pepperoni(){
    }

    public Pepperoni(int price, double weight, boolean isMeat) {
        super(price, weight);
        this.isAcute = isMeat;
    }

    @Override
    public void cook(){
        super.cook();
        System.out.println("Номер пиццы - " + getIdPizza());
        System.out.println("Готовится пицца - Пепперони");
    }

    @Override
    public void delivery(){
        System.out.println("Доставляется пицца - Пепперони");
        System.out.println("Номер пиццы - " + getIdPizza());
    }

    @Override
    public String toString(){
        String message = "Пепперорни:\n";
        if(isAcute){
            message += "Острая!\n";
        }
        else
        {
            message += "Не острая\n";
        }
        message += super.toString();
        return message;
    }

    public boolean isMeat() {
        return isAcute;
    }

    public void setMeat(boolean meat) {
        isAcute = meat;
    }
}
