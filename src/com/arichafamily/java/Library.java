package com.arichafamily.java;

import java.util.ArrayList;

/**
 * Created by Ron on 11/02/2017.
 */
public class Library {

    private ArrayList<Book> bookCollection = new ArrayList<>();
    private Librarian librarianInDuty;

    public Library(){
        this.librarianInDuty = new Librarian();
    }

    public void addBook(Book b){
        bookCollection.add(b);
    }

    public void addBook(){
        Book b = new Book();
        bookCollection.add(b);
    }
}
