package com.company;

public class Client extends Human {
    private boolean isConstant;
    private double averageCheck;
    private boolean isFaceControl;

    public Client(){
    }

    public Client(String name, int age, String address, String gender,
                  boolean isConstant, double averageCheck, boolean isFaceControl) {
        super(name, age, address, gender);
        this.isConstant = isConstant;
        this.averageCheck = averageCheck;
        this.isFaceControl = isFaceControl;
    }

    @Override
    public String toString(){
        String message = "Клиет:" + "\n" + super.toString() + "\nПостоянный - " + this.isConstant + "\nСредний чек заказа - " + this.averageCheck
                + "\nПройдёт фейс контроль - " + this.isFaceControl;
        return message;
    }

    public void toOrder(){
        System.out.println("Заказать.");
    }

    public void toPay(){
        System.out.println("Заплатить.");
    }

    public void toCallWaiter(){
        System.out.println("Позвать официанта.");
    }

    public boolean isConstant(){
        return isConstant;
    }

    public void setConstant(boolean constant) {
        isConstant = constant;
    }

    public double getAverageCheck() {
        return averageCheck;
    }

    public void setAverageCheck(double averageCheck) {
        this.averageCheck = averageCheck;
    }

    public boolean isFaceControl() {
        return isFaceControl;
    }

    public void setFaceControl(boolean faceControl) {
        isFaceControl = faceControl;
    }
}
