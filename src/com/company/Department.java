package com.company;

import java.util.Scanner;

public class Department {
    Scanner in = new Scanner(System.in);
    Book[] books = new Book[100];

    public Department(){
        this.books = new Book[100];
    }

    public Department(Book[] books) {
        this.books = books;
    }

    public void pushBook(){
        String nameBook;
        String authorBook;
        String yearBook;
        System.out.println("Введите название книги:");
        nameBook = new String(in.nextLine());
        System.out.println("Введите автора книги:");
        authorBook = new String(in.nextLine());
        System.out.println("Введите год выпуска книги:");
        yearBook = new String(in.nextLine());

        Book book = new Book(authorBook, nameBook, yearBook);
        books[Book.getCounter()] = book;
    }

    private Book search(String author){
        for (Book book:
             books) {
            if(book.getAuthorOfBook().equals(author))
            {
                return book;
            }
        }
        return null;
    }

    public void searchAuthorBook(){
        String authorBook;
        System.out.println("Введите автора книги, которую хотите найти:");
        authorBook = new String(in.nextLine());
        if(search(authorBook) != null){
            System.out.println(search(authorBook));
        }
        else
        {
            System.out.println("Книги с этим автором нет!");
        }
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }
}
