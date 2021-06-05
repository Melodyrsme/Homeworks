package com.company;

public class Firefighter extends AbstractEmployee{
    public Firefighter() {
    }

    public Firefighter(String name, int age, int salary, int experience) {
        super(name, age, salary, experience);
    }

    @Override
    public int compareTo(Object o) {
        Firefighter firefighter = (Firefighter) o;
        if (this.getExperience() > firefighter.getExperience()){
            return 1;
        }else if(this.getExperience() < firefighter.getExperience()){
            return -1;
        }else {
            return 0;
        }
    }
}
