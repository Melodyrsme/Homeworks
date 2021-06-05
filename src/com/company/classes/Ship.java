package com.company.classes;

import com.company.interfaces.Runable;

public class Ship extends AbstractClass implements Runable {
    public Ship() {
    }

    public Ship(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("умею бегать.");
    }
}
