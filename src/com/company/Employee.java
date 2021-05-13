package com.company;

import java.sql.SQLOutput;

public class Employee extends Human {
    private String position;
    private int salary;
    private int premium;
    private int fine;
    private int experience;
    private int numberOfVacationDays;

    public Employee() {
    }

    public Employee(String name, int age, String address, String gender, String position,
                    int salary, int premium, int fine, int experience, int numberOfVacationDays) {
        super(name, age, address, gender);
        this.position = position;
        this.salary = salary;
        this.premium = premium;
        this.fine = fine;
        this.experience = experience;
        this.numberOfVacationDays = numberOfVacationDays;
    }

    @Override
    public String toString(){
        String message = "Сотрудник:" + "\n" + super.toString() + "\nЕго позиция - " + this.position + "\nЕго зарплата - " + this.salary
                + "\nПремия - " + this.premium + "\nШтраф - " + this.fine + "\nСтаж - " + this.experience
                + "\nКоличество дней отпуска - " + this.numberOfVacationDays;
        return message;
    }

    public void goToWork(){
        System.out.println("Выходить на работу.");
    }

    public void goToVacation(){
        System.out.println("Уходить в отпуск.");
    }

    public void toLate(){
        System.out.println("Опоздать на работу.");
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getPremium() {
        return premium;
    }

    public void setPremium(int premium) {
        this.premium = premium;
    }

    public int getFine() {
        return fine;
    }

    public void setFine(int fine) {
        this.fine = fine;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getNumberOfVacationDays() {
        return numberOfVacationDays;
    }

    public void setNumberOfVacationDays(int numberOfVacationDays) {
        this.numberOfVacationDays = numberOfVacationDays;
    }
}
