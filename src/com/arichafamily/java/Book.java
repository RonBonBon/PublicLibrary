package com.arichafamily.java;

import java.util.ArrayList;
import java.util.Scanner;

public class Book {
    private String bookName;
    private String authorName;
    private double bookPrice;

    Scanner in = new Scanner(System.in);
    ArrayList<Book> bookCollection = new ArrayList<>();

    public Book(String bookName, String authorName, double bookPrice) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.bookPrice = bookPrice;
    }

    public Book() {
        this.bookName = IO.getString("Enter book title:");
        this.authorName = IO.getString("Enter author name:");
        this.bookPrice = IO.getFloat("Enter price");
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(double bookPrice) {
        this.bookPrice = bookPrice;
    }
}
