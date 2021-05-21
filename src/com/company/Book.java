package com.company;

public class Book {
    private String authorOfBook;
    private String nameOfBook;
    private String yearOfIssue;
    private int idBook;
    private static int counter;

    public Book(){
    }

    public Book(String authorOfBook, String nameOfBook, String yearOfIssue) {
        counter++;
        this.idBook = counter;
        this.authorOfBook = authorOfBook;
        this.nameOfBook = nameOfBook;
        this.yearOfIssue = yearOfIssue;
    }

    @Override
    public String toString(){
        String message = "Книга под номером №" + idBook + "\nНазвание книги - " + nameOfBook +
                "\nАвтор книги - " + authorOfBook + "\nГод выпуска - " + yearOfIssue + "\n";
        return message;
    }

    public String getAuthorOfBook() {
        return authorOfBook;
    }

    public void setAuthorOfBook(String authorOfBook) {
        this.authorOfBook = authorOfBook;
    }

    public String getNameOfBook() {
        return nameOfBook;
    }

    public void setNameOfBook(String nameOfBook) {
        this.nameOfBook = nameOfBook;
    }

    public String getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(String yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public int getCounterBook() {
        return idBook;
    }

    public void setCounterBook(int counterBook) {
        this.idBook = counterBook;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Book.counter = counter;
    }
}
