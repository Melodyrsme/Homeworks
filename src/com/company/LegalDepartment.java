package com.company;

import java.util.Arrays;

public class LegalDepartment extends Department {
    public LegalDepartment(){
    }

    public LegalDepartment(Book[] books) {
        super(books);
    }

    @Override
    public String toString(){
        return "Юридический отдел:\n" + "Количество книг: " + getCountBooks();
    }

    public void getInfo(){
        System.out.println(toString());
        getAllBooks();
    }

    public void getAllBooks(){
        System.out.println("Юридические книги:\n" + Arrays.toString(getBooks()));
    }

    public int getCountBooks(){
        return getBooks().length;
    }
}
