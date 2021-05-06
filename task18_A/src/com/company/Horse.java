package com.company;

public class Horse extends Cow {
    private String color;

    public Horse() {

    }

    public Horse(int weight, int age, String gender, String nickname, String color) {
        super(weight, age, gender, nickname);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
