package com.company;

public interface Climbable {
    default void climb(){
        System.out.println("Я умею карабкаться.");
    }
}
