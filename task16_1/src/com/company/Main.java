package com.company;

public class Main {

    public static void main(String[] args) {
        Parrot parrot1 = new Parrot();
        Parrot parrot2 = new Parrot();
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Fish fish1 = new Fish();
        Fish fish2 = new Fish();
        parrot1.setName("Кеша");
        parrot1.setAge(2);
        parrot1.setColor("Зеленый");
        parrot1.setType("Ара");
        parrot2.setName("Даша");
        parrot2.setAge(3);
        parrot2.setColor("Белый");
        parrot2.setType("Какаду");
        dog1.setName("Вулкан");
        dog1.setAge(4);
        dog1.setColor("Черный");
        dog1.setType("Доберман");
        dog2.setName("Хатико");
        dog2.setAge(1);
        dog2.setColor("Белый");
        dog2.setType("Бультерьер");
        cat1.setName("Белка");
        cat1.setAge(4);
        cat1.setColor("Оранжевый");
        cat1.setType("Сиамская");
        cat2.setName("Мурка");
        cat2.setAge(4);
        cat2.setColor("Белый");
        cat2.setType("Персидская");
        fish1.setName("Злата");
        fish1.setAge(1);
        fish1.setColor("Оранжевый");
        fish1.setType("Золотая");
        fish2.setName("Кира");
        fish2.setAge(2);
        fish2.setColor("Бело-оранжевый");
        fish2.setType("Клоун оцеллярис");
        System.out.println("Попугай с именем - " + parrot1.getName());
        System.out.println("Его возраст - " + parrot1.getAge());
        System.out.println("Его цвет - " + parrot1.getColor());
        System.out.println("Его вид - " + parrot1.getType());
        System.out.println();
        System.out.println("Попугай с именем - " + parrot2.getName());
        System.out.println("Его возраст - " + parrot2.getAge());
        System.out.println("Его цвет - " + parrot2.getColor());
        System.out.println("Его вид - " + parrot2.getType());
        System.out.println();
        System.out.println("Собака с именем - " + dog1.getName());
        System.out.println("Её возраст - " + dog1.getAge());
        System.out.println("Её цвет - " + dog1.getColor());
        System.out.println("Её порода - " + dog1.getType());
        System.out.println();
        System.out.println("Собака с именем - " + dog2.getName());
        System.out.println("Её возраст - " + dog2.getAge());
        System.out.println("Её цвет - " + dog2.getColor());
        System.out.println("Её порода - " + dog2.getType());
        System.out.println();
        System.out.println("Кошка с именем - " + cat1.getName());
        System.out.println("Её возраст - " + cat1.getAge());
        System.out.println("Её цвет - " + cat1.getColor());
        System.out.println("Её порода - " + cat1.getType());
        System.out.println();
        System.out.println("Кошка с именем - " + cat2.getName());
        System.out.println("Её возраст - " + cat2.getAge());
        System.out.println("Её цвет - " + cat2.getColor());
        System.out.println("Её порода - " + cat2.getType());
        System.out.println();
        System.out.println("Рыбка с именем - " + fish1.getName());
        System.out.println("Её возраст - " + fish1.getAge());
        System.out.println("Её цвет - " + fish1.getColor());
        System.out.println("Её вид - " + fish1.getType());
        System.out.println();
        System.out.println("Рыбка с именем - " + fish2.getName());
        System.out.println("Её возраст - " + fish2.getAge());
        System.out.println("Её цвет - " + fish2.getColor());
        System.out.println("Её вид - " + fish2.getType());
    }
}
