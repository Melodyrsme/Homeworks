package com.company.classes;

import com.company.interfaces.Runable;
import com.company.interfaces.Swimmable;

public class Human extends AbstractClass implements Runable, Swimmable {
    public Human() {
    }

    public Human(String name) {
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
}
