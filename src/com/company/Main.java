package com.company;

public class Main {

    public static void main(String[] args) {
        Pepperoni pepperoni = new Pepperoni(350, 1.5, true);
        Margarita margarita = new Margarita(425, 1.120, true);
        LaFinta laFinta = new LaFinta(650, 2.3, false);

        pepperoni.cook();
        pepperoni.delivery();
        System.out.println(pepperoni);
        System.out.println();

        margarita.cook();
        margarita.delivery();
        System.out.println(margarita);
        System.out.println();

        laFinta.cook();
        laFinta.delivery();
        System.out.println(laFinta);
        System.out.println();
    }
}
