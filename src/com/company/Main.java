package com.company;

public class Main {

    public static void main(String[] args) {
        Eatable monkey = new Monkey("Bingo");
        System.out.println(monkey.toString());
        monkey.eatFruits();
        monkey.climb();
        monkey.hold();
    }
}
