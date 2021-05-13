package com.company;

public class Cook extends Employee {
    private String food;
    private String speciality;
    private int certificate;

    public Cook(){
    }

    public Cook(String name, int age, String address, String gender,String position, int salary, int premium,
                int fine, int experience, int numberOfVacationDays, String food, String speciality, int certificate) {
        super(name, age, address, gender, position, salary, premium, fine, experience, numberOfVacationDays);
        this.food = food;
        this.speciality = speciality;
        this.certificate = certificate;
    }

    @Override
    public String toString(){
        String message = super.toString() + "\nКакие блюда готовит - " + this.food + "\nСпециальность - " + this.speciality
                + "\nСертификаты - " + this.certificate;
        return message;
    }

    @Override
    public void toLate(){
        System.out.println(super.getPosition() + " опоздал на " + super.getFine() + " сом.");
    }

    public void goToProduct(){
        System.out.println("Ходить за продуктами.");
    }

    public void inventDish(){
        System.out.println("Изобретать блида.");
    }

    public void cookDish(){
        System.out.println("Готовить блюдо.");
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public int getCertificate() {
        return certificate;
    }

    public void setCertificate(int certificate) {
        this.certificate = certificate;
    }
}
