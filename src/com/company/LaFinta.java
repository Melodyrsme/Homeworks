package com.company;

public class LaFinta extends Pizza {
    private boolean isMushrooms;

    public LaFinta(){
    }

    public LaFinta(int price, double weight, boolean isMushrooms) {
        super(price, weight);
        this.isMushrooms = isMushrooms;
    }

    @Override
    public void cook(){
        super.cook();
        System.out.println("Номер пиццы - " + getIdPizza());
        System.out.println("Готовится пицца - La Finta");
    }

    @Override
    public void delivery(){
        System.out.println("Доставляется пицца - La Finta");
        System.out.println("Номер пиццы - " + getIdPizza());
    }

    @Override
    public String toString(){
        String message = "La Finta:\n";
        if(isMushrooms){
            message += "С грибами!\n";
        }
        else
        {
            message += "Без грибов\n";
        }
        message += super.toString();
        return message;
    }

    public boolean isMushrooms() {
        return isMushrooms;
    }

    public void setMushrooms(boolean mushrooms) {
        isMushrooms = mushrooms;
    }
}
