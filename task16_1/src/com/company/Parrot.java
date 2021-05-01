package com.company;

public class Parrot {
    public String name;
    public int age;
    public String color;
    public String type;
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setType(String type){
        this.type = type;
    }
    public String getName(){
        return name;
    }
    public String getColor(){
        return color;
    }
    public String getType(){
        return type;
    }
    public int getAge(){
        if(age <= 0) {
            System.out.println("Задан неверный возраст.");
            return 0;
        }
        else {
            return age;
        }
    }
}
