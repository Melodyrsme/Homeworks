package com.company;

public interface Eatable extends Climbable, Holdable {
    default void eatFruits(){
        System.out.println("Я умею есть съедобные фрукты.");
    }
    @Override
    default void hold(){
        System.out.println("Я умею держать на спине другого карабкающегося зверя.");
    }
}
