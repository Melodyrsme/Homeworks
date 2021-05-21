package com.company;

public class Pizza {
    private int price;
    private double weight;
    private static int idPizza;

    public Pizza(){
    }

    public Pizza(int price, double weight) {
        this.price = price;
        this.weight = weight;
    }

    @Override
    public String toString(){
        return String.
                format("Его цена: %s\nЕго вес: %s\n", price, weight);
    }

    public void cook(){
        idPizza++;
    }

    public void delivery() {
        System.out.println("Доставляется пицца под номером " + idPizza);
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public static int getIdPizza() {
        return idPizza;
    }

    public static void setIdPizza(int idPizza) {
        Pizza.idPizza = idPizza;
    }
}
