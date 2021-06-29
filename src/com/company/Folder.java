package com.company;

public class Folder extends AbstractFlat{
    private String name = "Folder";
    @Override
    public String toString() {
        return "Folder{}";
    }
    public String getName() {
        return name;
    }
}
