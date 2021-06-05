package com.company.classes;

public abstract class AbstractClass {
    private String name;

    public AbstractClass() {
    }

    public AbstractClass(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return String.format("Я - %s ", name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
