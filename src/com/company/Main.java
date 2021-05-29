package com.company;

import com.company.Bread.Bakeable;
import com.company.Bread.Bread;
import com.company.Circle.Circle;
import com.company.Circle.Drawable;

public class Main {

    public static void main(String[] args){
        Bakeable bread = new Bread();
        bread.bakeBread();

        Drawable circle = new Circle();
        circle.drawCircle();
    }
}
