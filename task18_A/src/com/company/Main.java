package com.company;

public class Main {

    public static void main(String[] args) {
        Farm[] farm = new Farm[2];
        Sheep[] sheep1 = new Sheep[3];
        Cow[] cow1 = new Cow[5];
        Horse[] horse1 = new Horse[2];
        sheep1[0] = new Sheep(70, 3, "м", "Евгений");
        sheep1[1] = new Sheep(60, 2, "ж", "Марина");
        sheep1[2] = new Sheep(53, 1, "ж", "Лиза");
        cow1[0] = new Cow(130, 5, "м", "Артём");
        cow1[1] = new Cow(115, 3, "м", "Максим");
        cow1[2] = new Cow(140, 6, "ж", "Саша");
        cow1[3] = new Cow(107, 2, "м", "Алекс");
        cow1[4] = new Cow(154, 7, "м", "Рамон");
        horse1[0] = new Horse(117, 3, "м", "Джордж", "Черный");
        horse1[1] = new Horse(107, 2, "ж", "Лимона", "Белый");
        farm[0] = new Farm("Жукеева-Пудовкина, 135", cow1, sheep1, horse1, "Бернард");
        Sheep[] sheep2 = new Sheep[1];
        Cow[] cow2 = new Cow[1];
        Horse[] horse2 = new Horse[1];
        sheep2[0] = new Sheep(79, 5, "м", "Валерий");
        cow2[0] = new Cow(163, 6, "ж", "Луна");
        horse2[0] = new Horse(138, 4, "м", "Молния", "Черно-Белый");
        farm[1] = new Farm("Советская/Чуй", cow2, sheep2, horse2, "Леонардо");
        System.out.println("Ферма №1:");
        farm[0].outputFarm();
        System.out.println("Ферма №2:");
        farm[1].outputFarm();
    }
}