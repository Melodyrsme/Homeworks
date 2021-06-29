package com.company;

public class Apple extends AbstractCircle{
    private String name = "Apple";
    @Override
    public String toString() {
        return "Apple";
    }

    public String getName() {
        return name;
    }
}
