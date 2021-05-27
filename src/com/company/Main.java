package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        AbstractLocality[] locality = new AbstractLocality[5];
        locality[0] = new City("Бишкек", "Асанов", new String[]{"Ленинский", "Первомайский"});
        locality[1] = new City("Ош", "Элмирова", new String[]{"Октябрьский", "Ленинский"});
        locality[2] = new City("Баткен", "Нурдинов", new String[]{"Октябрьский, Свердловский"});
        locality[3] = new Village("Новопокровка", "Арсенов");
        locality[4] = new Village("Царское", "Жусупов");

        System.out.println("Введите имя руководителя:");
        String name = in.nextLine();
        searchLeader(name, locality);
    }

    public static String searchLeader(String name, AbstractLocality[] localities){
        for (int i = 0; i < localities.length; i++) {
            if(name.equals(localities[i].getTheLeader())){
                System.out.println("Есть такой руководитель!");
                return localities[i].getTheLeader();
            }
        }
        System.out.println("Такого руководителя нет!");
        return null;
    }
}
