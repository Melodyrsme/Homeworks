package com.company;

public class Baget extends Bread {
    private String name;
    private double length;
    private int countCut;

    public Baget(){
    }

    public Baget(int weight, int price, String nameFacture, String name, double length, int countCut) {
        super(weight, price, nameFacture);
        this.name = name;
        this.length = length;
        this.countCut = countCut;
    }

    public void cut(){
        System.out.println("Зарубцован");
    }
    public void bake(){
        System.out.println("Готов багет");
    }
    public void pack(){
        System.out.println("Упакован только в экологический пакет");
    }
    @Override
    public String toString(){
        String message = "Наименование фирмы - " + this.getNameFacture() + "\nНазвание багета - " + this.name + "\nЕго длина - " + this.length
                + "\nКоличество продольных рубцов - " + this.countCut;
        return message;
    }
}
