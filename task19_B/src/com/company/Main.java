package com.company;

public class Main {

    public static void main(String[] args) {
        Bread bread = new Bread(35, 70, "Хлебница");
        System.out.println(bread.toString());
        System.out.println();
        Lepeshka lepeshka = new Lepeshka(10, 35, "Лепешница", 14);
        System.out.println("Лепёшка:");
        System.out.println(lepeshka.toString());
        lepeshka.drawPrints();
        lepeshka.varnish();
        System.out.println();
        Lavash lavash = new Lavash(13, 15, "Лавашница", 13, "Элитный лаваш из Дилижана");
        System.out.println(lavash.toString());
        lavash.varnish2();
        lavash.wrap();
        System.out.println();
        Baget baget = new Baget(12, 35, "Багетница", "Провансальский багет", 55, 4);
        System.out.println(baget.toString());
        baget.cut();
        baget.bake();
        baget.pack();
    }
}
