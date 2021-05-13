package com.company;

public class Waiter extends Employee {
    public Waiter(){
    }

    public Waiter(String name, int age, String address, String gender, String position,
                  int salary, int premium, int fine, int experience, int numberOfVacationDays) {
        super(name, age, address, gender, position, salary, premium, fine, experience, numberOfVacationDays);
    }

    @Override
    public void toLate(){
        System.out.println(super.getPosition() + " " + super.getName() + " опоздал на " + super.getFine() + " сом.");
    }

    public void exceptAnOrder(){
        System.out.println("Принимает заазы.");
    }

    public void referAnOrder(){
        System.out.println("Относить заказ.");
    }

    public void calculate(){
        System.out.println("Посчитать.");
    }
}
