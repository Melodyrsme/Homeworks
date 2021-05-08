package com.company;

public class Lepeshka extends Bread {
    double radius;

    public Lepeshka(){
    }

    public Lepeshka(int weight, int price, String nameFacture, double radius) {
        super(weight, price, nameFacture);
        this.radius = radius;
    }
    @Override
    public String toString(){
        String message = "Наименование фирмы - " + this.getNameFacture() + "\nВес лепешки - " + this.getWeight() + "\nЦена лепешки - " + this.getPrice();
        return message;
    }
    public void drawPrints(){
        System.out.println("Нанесли узоры");
    }
    public void varnish(){
        System.out.println("Лакировали");
    }
    public void bake(){
        System.out.println("Испекли");
    }
}
