package com.company;

public class Book extends AbstractFlat{
    private String name = "Book";
    @Override
    public String toString() {
        return "Book{}";
    }
    public String getName() {
        return name;
    }
}
