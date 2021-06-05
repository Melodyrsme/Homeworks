package com.company.classes;

import com.company.interfaces.Runable;

public class Cat extends AbstractClass implements Runable {

    public Cat() {
    }

    public Cat(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("умею бегать.");
    }
}
