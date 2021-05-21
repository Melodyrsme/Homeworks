package com.company;

import java.util.Arrays;

public class TechnicalDepartment extends Department {
    private boolean isComputer;

    public TechnicalDepartment(){
    }

    public TechnicalDepartment(Book[] books, boolean isComputer) {
        super(books);
        this.isComputer = isComputer;
    }

    @Override
    public String toString(){
        return String.
            format("Технический отдел:\n" + "Количество книг: %s" + "\nНаличие компьютера: %s",
                getCountBooks(), isComputer ? "Есть" : "Нет");
    }

    public void getInfo(){
        System.out.println(toString());
        getAllBooks();
    }

    public void getAllBooks(){
        System.out.println("Технические книги:\n" + Arrays.toString(getBooks()));
    }

    public int getCountBooks(){
        return getBooks().length;
    }

    public boolean isComputer() {
        return isComputer;
    }

    public void setComputer(boolean computer) {
        isComputer = computer;
    }
}
