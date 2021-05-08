package com.company;

public class Lessons extends Course {
    private String lessonDate;
    private int attendingStudents;
    private String startTime;
    private boolean isHomework;
    private boolean isExam;

    public Lessons(){
    }

    public Lessons(String lessonDate, int attendingStudents, String startTime, boolean isHomework, boolean isExam) {
        this.lessonDate = lessonDate;
        this.attendingStudents = attendingStudents;
        this.startTime = startTime;
        this.isHomework = isHomework;
        this.isExam = isExam;
    }
    @Override
    public String toString(){
        String message = "Дата проведения урока - " + this.lessonDate + "\nВремя начала - " + this.startTime
                + "\nПрисутствующие студенты - " + this.attendingStudents;
        if(isHomework){
            message += "\nБыло ли домашнее задание - было";
        }
        else{
            message += "\nБыло ли домашнее задание - не было";
        }
        if(isExam){
            message += "\nБыл ли экзамен - был";
        }
        else{
            message += "\nБыл ли экзамен - не был";
        }
        return message;
    }
    public String getLessonDate() {
        return lessonDate;
    }

    public void setLessonDate(String lessonDate) {
        this.lessonDate = lessonDate;
    }

    public int getAttendingStudents() {
        return attendingStudents;
    }

    public void setAttendingStudents(int attendingStudents) {
        this.attendingStudents = attendingStudents;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public boolean isHomework() {
        return isHomework;
    }

    public void setHomework(boolean homework) {
        isHomework = homework;
    }

    public boolean isExam() {
        return isExam;
    }

    public void setExam(boolean exam) {
        isExam = exam;
    }
}
