package com.company.classes;

import com.company.interfaces.Swimmable;

public class Shark extends AbstractClass implements Swimmable {
    public Shark() {
    }

    public Shark(String name) {
        super(name);
    }

    @Override
    public void swimm() {
        System.out.println("умею плавать.");
    }
}
