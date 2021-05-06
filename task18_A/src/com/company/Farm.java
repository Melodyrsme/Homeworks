package com.company;

public class Farm {
    private String farmAddress;
    private Cow[] cow;
    private Sheep[] sheep;
    private Horse[] horses;
    private String nameOfOwner;

    public Farm(){

    }

    public Farm(String farmAddress, Cow[] cow, Sheep[] sheep, Horse[] horses, String nameOfOwner) {
        this.farmAddress = farmAddress;
        this.cow = cow;
        this.sheep = sheep;
        this.horses = horses;
        this.nameOfOwner = nameOfOwner;
    }

    public String getFarmAddress() {
        return farmAddress;
    }

    public void setFarmAddress(String farmAddress) {
        this.farmAddress = farmAddress;
    }

    public Cow[] getCow() {
        return cow;
    }

    public void setCow(Cow[] cow) {
        this.cow = cow;
    }

    public Sheep[] getSheep() {
        return sheep;
    }

    public void setSheep(Sheep[] sheep) {
        this.sheep = sheep;
    }

    public Horse[] getHorses() {
        return horses;
    }

    public void setHorses(Horse[] horses) {
        this.horses = horses;
    }

    public String getNameOfOwner() {
        return nameOfOwner;
    }

    public void setNameOfOwner(String nameOfOwner) {
        this.nameOfOwner = nameOfOwner;
    }
    public void outputFarm(){
        System.out.println("Хозяин фермы - " + this.nameOfOwner);
        System.out.println("Адрес фермы - " + this.farmAddress);
        System.out.println("Информация о коровах:");
        for (int i = 0; i < cow.length; i++) {
            System.out.println("Корова #" + (i + 1) + ":");
            System.out.println("Кличка коровы - " + cow[i].getNickname());
            System.out.println("Возраст коровы - " + cow[i].getAge());
            System.out.println("Вес коровы - " + cow[i].getWeight());
            System.out.println("Пол коровы - " + cow[i].getGender());
            System.out.println();
        }
        for (int i = 0; i < sheep.length; i++) {
            System.out.println("Овца #" + (i + 1) + ":");
            System.out.println("Кличка овцы - " + sheep[i].getNickname());
            System.out.println("Возраст овцы - " + sheep[i].getAge());
            System.out.println("Вес овцы - " + sheep[i].getWeight());
            System.out.println("Пол овцы - " + sheep[i].getGender());
            System.out.println();
        }
        for (int i = 0; i < horses.length; i++) {
            System.out.println("Лошадь #" + (i + 1) + ":");
            System.out.println("Кличка лошади - " + horses[i].getNickname());
            System.out.println("Возраст лошади - " + horses[i].getAge());
            System.out.println("Цвет лошади - " + horses[i].getColor());
            System.out.println("Вес лошади - " + horses[i].getWeight());
            System.out.println("Пол лошади - " + horses[i].getGender());
            System.out.println();
        }
    }
}
