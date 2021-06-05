package com.company;

public class AbstractEmployee implements Comparable{
    private String name;
    private int age;
    private int salary;
    private int experience;

    public AbstractEmployee(){
    }

    public AbstractEmployee(String name, int age, int salary, int experience) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.experience = experience;
    }

    @Override
    public String toString() {
        return String.format("Я - %s\nМне - %s\nМоя зарплата - %s\nМой стаж работы - %s\n",
                this.name, this.age, this.salary, this.experience);
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
