package com.company;

public class Margarita extends Pizza {
    private boolean isMeat;

    public Margarita(){
    }

    public Margarita(int price, double weight, boolean isMeat) {
        super(price, weight);
        this.isMeat = isMeat;
    }

    @Override
    public void cook(){
        super.cook();
        System.out.println("Номер пиццы - " + getIdPizza());
        System.out.println("Готовится пицца - Маргарита");
    }

    @Override
    public void delivery(){
        System.out.println("Доставляется пицца - Маргарита");
        System.out.println("Номер пиццы - " + getIdPizza());
    }

    @Override
    public String toString(){
        String message = "Маргарита:\n";
        if(isMeat){
            message += "С мясом!\n";
        }
        else
        {
            message += "Без мяса\n";
        }
        message += super.toString();
        return message;
    }

    public boolean isMeat() {
        return isMeat;
    }

    public void setMeat(boolean meat) {
        isMeat = meat;
    }
}
