package com.company;

import com.company.classes.*;
import com.company.interfaces.Flyable;
import com.company.interfaces.Runable;
import com.company.interfaces.Swimmable;

public class Main {

    public static void main(String[] args) {
        Swimmable[] swimmables = new Swimmable[4];
        Runable[] runables = new Runable[5];
        Flyable[] flyables = new Flyable[3];

        swimmables[0] = new Duck("Альберт");
        swimmables[1] = new Human("Бертольд");
        swimmables[2] = new Shark("Сабзи");
        swimmables[3] = new Whale("Монька");

        System.out.println(((Duck)swimmables[0]).getName()); //проверял кастинг

        runables[0] = new Human("Энтони");
        runables[1] = new Duck("Анна");
        runables[2] = new Cat("Зорро");
        runables[3] = new Parrot("Кевин");
        runables[4] = new Ship("Мира");

        flyables[0] = new Duck("Лиза");
        flyables[1] = new Plane("Боинг 747");
        flyables[2] = new Parrot("Кеша");

        System.out.println("Все плавающие:");
        for (Swimmable swimmable: swimmables) {
            System.out.println(swimmable.toString());
            swimmable.swimm();
        }
        System.out.println();
        System.out.println("Все бегающие:");
        for(Runable runable : runables){
            System.out.println(runable.toString());
            runable.run();
        }
        System.out.println();
        System.out.println("Все летающие:");
        for(Flyable flyable : flyables){
            System.out.println(flyable.toString());
            flyable.fly();
        }
    }
}
