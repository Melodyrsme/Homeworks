package com.company;

public class Bread {
    private int weight;
    private int price;
    private String nameFacture;

    public Bread(){
    }

    public Bread(int weight, int price, String nameFacture) {
        this.weight = weight;
        this.price = price;
        this.nameFacture = nameFacture;
    }

    @Override
    public String toString() {
        String message = "Наименование фирмы - " + this.nameFacture + "\nВес хлеба - " + this.weight + "\nЦена хлеба - " + this.price;
        return message;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getNameFacture() {
        return nameFacture;
    }

    public void setNameFacture(String nameFacture) {
        this.nameFacture = nameFacture;
    }
}
