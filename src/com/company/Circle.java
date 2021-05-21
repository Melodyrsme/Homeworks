package com.company;

public class Circle {
    private int radius;
    private double area;
    final double PI = 3.14;
    static int counter;

    public double getArea(){
        this.area = this.PI * this.radius * this.radius;
        if(this.area % 3 == 0)
            counter++;
        return area;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public static int getCounter() {
        return counter;
    }
}
