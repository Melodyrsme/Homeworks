package com.company;

public class Bottle extends AbstractCylindrical{
    private String name = "Bottle";
    @Override
    public String toString() {
        return "Bottle{}";
    }
    public String getName() {
        return name;
    }
}
