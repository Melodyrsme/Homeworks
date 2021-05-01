package com.company;

public class Main {

    public static void main(String[] args) {
        Group firstGroup = new Group();
        firstGroup.courses[0] = new Course("Java программирование",
                "18.05.2017",
                "123456789",
                "Шевченко Валентина Николаевна");
        firstGroup.students[0] = new Student("Руслан", "Асанов", "10.09.1997", "мужской", 23);
        firstGroup.students[1] = new Student("Бермет", "Эльмирова", "23.03.2001", "женский", 20);
        firstGroup.students[2] = new Student("Нурдин", "Уланов", "24.12.2001", "мужской", 20);
        System.out.println("Наименование курса - " + firstGroup.courses[0].getNameOfCourse());
        System.out.println("Дата создания курса - " + firstGroup.courses[0].getDateOfCreation());
        System.out.println("ID курса - " + firstGroup.courses[0].getId());
        System.out.println("ФИО преподователя - " + firstGroup.courses[0].getFullName());
        System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.println("Студент №" + (i + 1) + ":");
            System.out.println("Имя - " + firstGroup.students[i].getFirstName());
            System.out.println("Фамилия - " + firstGroup.students[i].getLastName());
            System.out.println("День рождения - " + firstGroup.students[i].getBirthday());
            System.out.println("Пол - " + firstGroup.students[i].getGender());
            System.out.println("Возраст - " + firstGroup.students[i].getAge());
            System.out.println();
        }
    }
}
