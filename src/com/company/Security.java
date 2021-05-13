package com.company;

public class Security extends Employee {
    private boolean isArmed;
    private String typeOfWeapon;

    public Security(){
    }

    public Security(String name, int age, String address, String gender, String position,
                    int salary, int premium, int fine, int experience, int numberOfVacationDays, boolean isArmed, String typeOfWeapon) {
        super(name, age, address, gender, position, salary, premium, fine, experience, numberOfVacationDays);
        this.isArmed = isArmed;
        this.typeOfWeapon = typeOfWeapon;
    }

    @Override
    public void toLate(){
        System.out.println(super.getPosition() + " опоздал на " + super.getFine() + " сом.");
    }

    public boolean isFaceControl(Client client){
        return client.isFaceControl();
    }

    public void kickPeopleOut(){
        System.out.println("Выгнать человека, если не прошёл фейс контроль.");
    }
    public boolean isArmed(){
        return isArmed;
    }

    public void setArmed(boolean armed) {
        isArmed = armed;
    }

    public String getTypeOfWeapon() {
        return typeOfWeapon;
    }

    public void setTypeOfWeapon(String typeOfWeapon) {
        this.typeOfWeapon = typeOfWeapon;
    }
}
