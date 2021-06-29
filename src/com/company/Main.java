package com.company;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<Person> personLinkedList = new LinkedList<>();
        addPerson(personLinkedList, new Person("Асанов", "Руслан", "Чолпоналиевич"));
        addPerson(personLinkedList, new Person("Каримова", "Айсулу", "Нурдиновна"));
        addPerson(personLinkedList, new Person("Кенжебекова", "Асель", "Тилековна"));
        addPerson(personLinkedList, new Person("Асанов", "Руслан", "Чолпоналиевич"));
        addPerson(personLinkedList, new Person("Каримова", "Айсулу", "Нурдиновна"));
        addPerson(personLinkedList, new Person("Бекжанова", "Бермет", "Тимуровна"));

        System.out.println();
        System.out.println("Список всех людей:");
        System.out.println(personLinkedList);
    }

    public static void addPerson(LinkedList<Person> list, Person person) {
        try{
            for (Person listOfPerson : list) {
                if(listOfPerson.equals(person)){
                    System.out.println(listOfPerson.toString());
                    throw new DublicateException("Такой пользователь уже есть в списке.");
                }
            }
            list.add(person);
        } catch (DublicateException e) {
            System.out.println(e.getMessage());
        }
    }
}
