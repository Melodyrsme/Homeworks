package com.company;

public class Main {

    public static void main(String[] args) {
        Circle[] circles = new Circle[5];
        for (int i = 0; i < circles.length; i++) {
            circles[i] = new Circle();
            circles[i].setRadius(1 + (int)(Math.random() * 10));
        }
        for (int i = 0; i < circles.length; i++) {
            System.out.println("Радиус " + (i + 1)  + " круга = " + circles[i].getRadius());
            System.out.println("Его площадь = " + circles[i].getArea());
            System.out.println();
        }
        System.out.println("Количество кругов, у которых площадь кратна 3 - " + Circle.getCounter());
    }
}
