package com.company;

public class Cow {
    private int weight;
    private int age;
    private String gender;
    private String nickname;

    public Cow() {
    }

    public Cow(int weight, int age, String gender, String nickname) {
        this.weight = weight;
        this.age = age;
        this.gender = gender;
        this.nickname = nickname;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        if(this.age < 0) {
            System.out.println("Не верный возраст у животного.");
            return -1;
        }
        else {
            return age;
        }
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
