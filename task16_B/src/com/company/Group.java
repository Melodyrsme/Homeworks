package com.company;

public class Group {
    Student[] students = new Student[3];
    Course[] courses = new Course[1];
    String startDate;
    int durationInMonth;
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }
    public void setDurationInMonth(int durationInMonth) {
        this.durationInMonth = durationInMonth;
    }
    public String getStartDate() {
        return startDate;
    }
    public int getDurationInMonth() {
        return durationInMonth;
    }
}
