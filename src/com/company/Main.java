package com.company;

import java.io.File;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        A();
    }

    public static void A(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя файла, который хотите изменить:");
        String nameOfFile = in.nextLine();
        String str = "";
        File file = new File(nameOfFile);
        if(file.isFile()){
            System.out.println("Введите новое расширение для файла:");
            str = in.nextLine();
            if(nameOfFile.indexOf('.') > 0) {
                nameOfFile = nameOfFile.substring(0, nameOfFile.lastIndexOf('.') + 1) + str;
                file.renameTo(new File(nameOfFile));
            }
            else {
                nameOfFile += '.' + str;
                file.renameTo(new File(nameOfFile));
            }
            System.out.println("Файл изменен: " + nameOfFile);
        }
        else{
            System.out.println("Файл не найден.");
        }
    }
}
