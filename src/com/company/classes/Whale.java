package com.company.classes;

import com.company.interfaces.Swimmable;

public class Whale extends AbstractClass implements Swimmable {
    public Whale() {
    }

    public Whale(String name) {
        super(name);
    }

    @Override
    public void swimm() {
        System.out.println("умею плавать.");
    }
}
