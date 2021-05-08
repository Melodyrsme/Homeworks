package com.company;

public class Lavash extends Lepeshka {
    private String name;
    public Lavash() {
    }

    public Lavash(int weight, int price, String nameFacture, double radius, String name) {
        super(weight, price, nameFacture, radius);
        this.name = name;
    }

    @Override
    public String toString(){
        String message = "Наименование фирмы - " + this.getNameFacture() + "\nНазвание лаваша - " + this.name;
        return message;
    }

    public void varnish2(){
        bake();
        System.out.println("Я лаваш, меня испекли");
    }

    public void wrap(){
        System.out.println("Завернули");
    }
}
