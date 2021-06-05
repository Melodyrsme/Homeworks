package com.company;

public class Merchant extends AbstractEmployee{
    public Merchant() {
    }

    public Merchant(String name, int age, int salary, int experience) {
        super(name, age, salary, experience);
    }
    @Override
    public int compareTo(Object o) {
        Merchant merchant = (Merchant) o;
        if (this.getSalary() > merchant.getSalary()){
            return 1;
        }else if(this.getSalary() < merchant.getSalary()){
            return -1;
        }else {
            return 0;
        }
    }
}
