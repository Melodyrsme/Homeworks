package com.company.classes;

import com.company.interfaces.Flyable;
import com.company.interfaces.Runable;

public class Parrot extends AbstractClass implements Flyable, Runable {
    public Parrot() {
    }

    public Parrot(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("умею бегать.");
    }

    @Override
    public void fly() {
        System.out.println("умею летать.");
    }
}
