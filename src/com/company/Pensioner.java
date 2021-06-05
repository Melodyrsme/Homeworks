package com.company;

public class Pensioner extends AbstractEmployee{
    public Pensioner() {
    }

    public Pensioner(String name, int age, int salary, int experience) {
        super(name, age, salary, experience);
    }

    @Override
    public int compareTo(Object o) {
        Pensioner pensioner = (Pensioner) o;
        if (this.getAge() > pensioner.getAge()){
            return 1;
        }else if(this.getAge() < pensioner.getAge()){
            return -1;
        }else {
            return 0;
        }
    }
}
