package com.company;

public class Monkey implements Eatable {
    private String name;

    public Monkey(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return String.
                format("Я %s.\nМои способности:\n", this.name);
    }
}
