package com.company;

public class Group {
    private Student[] students;
    private Course[] courses;
    private String startDate;
    private int durationInMonth;

    public Group(){
    }

    public Group(Student[] students, Course[] courses, String startDate, int durationInMonth) {
        this.students = students;
        this.courses = courses;
        this.startDate = startDate;
        this.durationInMonth = durationInMonth;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public void setCourses(Course[] courses) {
        this.courses = courses;
    }

    @Override
    public String toString(){
        String message = "Дата начала курсов - " + this.startDate + "\nДлительность в месяцах - " + this.durationInMonth;
        return message;
    }

    public Student[] getStudents() {
        return students;
    }

    public Course[] getCourses() {
        return courses;
    }

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
