package com.company.classes;

import com.company.interfaces.Flyable;
import com.company.interfaces.Runable;
import com.company.interfaces.Swimmable;

public class Duck extends AbstractClass implements Swimmable, Runable, Flyable {
    public Duck() {
    }

    public Duck(String name) {
        super(name);
    }

    @Override
    public void swimm() {
        System.out.println("умею плавать.");
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
