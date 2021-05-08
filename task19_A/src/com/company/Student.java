package com.company;

public class Student {
    String firstName;
    String lastName;
    String birthday;
    String gender;
    int age;

    public Student(String firstName, String lastName, String birthday, String gender, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.gender = gender;
        this.age = age;
    }
    public Student(){
    }
    @Override
    public String toString(){
        String message = "Я студент - " + this.firstName + " " + this.lastName + "\nВозраст - " + this.age
            + "\nДень рождения - " + this.birthday + "\nПол - " + this.gender;
        return message;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getBirthday() {
        return birthday;
    }
    public String getGender() {
        return gender;
    }
    public int getAge() {
        if(age <= 0){
            System.out.println("Введен неверный возраст.");
            return 0;
        }
        else
            return age;
    }
}
