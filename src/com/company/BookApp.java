package com.company;

public class BookApp {

    public static void main(String[] args) {
        Book book = new Book();
        book.setAuthor("John Smith");
        book.setBookTitle("Tom Sawyer");
        book.setDescription("Good Book");

        System.out.println("Title: " + book.getBookTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Description: " + book.getDescription());

        System.out.println();


        System.out.println(new Book("Huck Finn", "Joe Doe", "Good Book"));

    }
}
