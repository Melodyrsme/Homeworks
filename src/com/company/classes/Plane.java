package com.company.classes;

import com.company.interfaces.Flyable;

public class Plane extends AbstractClass implements Flyable {
    public Plane() {
    }

    public Plane(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("умею летать.");
    }
}
