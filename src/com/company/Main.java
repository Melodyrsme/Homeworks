package com.company;

import com.company.Course.Course;
import com.company.Group.Group;
import com.company.Lessons.Lessons;
import com.company.Student.Student;

public class Main {

    public static void main(String[] args) {
        Course[] crs = new Course[1];
        crs[0] = new Course("Java программирование",
                "18.05.2017",
                "123456789",
                "Шевченко Валентина Николаевна");
        Student[] std = new Student[3];
        std[0] = new Student("Руслан", "Асанов", "10.09.1997", "мужской", 23);
        std[1] = new Student("Бермет", "Эльмирова", "23.03.2001", "женский", 20);
        std[2] = new Student("Нурдин", "Уланов", "24.12.2001", "мужской", 20);
        Group firstGroup = new Group(std, crs, "1 февраля 2021 год", 9);
        Lessons lessons = new Lessons("1 февраля 2021 год", std, "19:00", false, false);
        firstGroup.setStudents(std);
        firstGroup.setCourses(crs);
        System.out.println(crs[0].toString());
        System.out.println(firstGroup.toString());
        System.out.println();
        System.out.println("Урок по курсу - " + crs[0].getNameOfCourse());
        System.out.println(lessons.toString());
        for (int i = 0; i < 3; i++) {
            System.out.println("Студент №" + (i + 1) + ":");
            System.out.println(std[i].toString());
            System.out.println();
        }
    }
}
