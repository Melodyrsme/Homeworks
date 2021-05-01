package com.company;

public class Course {
    String nameOfCourse;
    String dateOfCreation;
    String id;
    String fullName;
    public Course(String nameOfCourse, String dateOfCreation, String id, String fullName){
        this.nameOfCourse = nameOfCourse;
        this.dateOfCreation = dateOfCreation;
        this.id = id;
        this.fullName = fullName;
    }
    public Course(){
    }
    public void setNameOfCourse(String nameOfCourse){
        this.nameOfCourse = nameOfCourse;
    }
    public void setDateOfCreation(String dateOfCreation){
        this.dateOfCreation = dateOfCreation;
    }
    public void setId(String id){
        this.id = id;
    }
    public void setFullName(String fullName){
        this.fullName = fullName;
    }
    public String getNameOfCourse(){
        return nameOfCourse;
    }
    public String getDateOfCreation(){
        return dateOfCreation;
    }
    public String getId(){
        return id;
    }
    public String getFullName(){
        return fullName;
    }
}
