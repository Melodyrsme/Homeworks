package com.company.Bread;

public class Bread implements Bakeable {
    @Override
    public void bakeBread(){
        System.out.println("Выпекаемый хлеб.");
    }
}
