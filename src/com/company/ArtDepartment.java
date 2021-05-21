package com.company;

import java.util.Arrays;

public class ArtDepartment extends Department {
    public ArtDepartment(){
    }

    public ArtDepartment(Book[] books) {
        super(books);
    }

    @Override
    public String toString(){
        return "Художественный отдел:\n" + "Количество книг: " + getCountBooks();
    }

    public void getInfo(){
        System.out.println(toString());
        getAllBooks();
    }

    public void getAllBooks(){
        System.out.println("Художественные книги:\n" + Arrays.toString(getBooks()));
    }

    public int getCountBooks(){
        return getBooks().length;
    }
}
