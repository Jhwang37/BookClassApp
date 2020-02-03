package com.company;
public class Book{

    private String bookTitle;
    private String author;
    private String description;
    private double price;
    private String isInStock;

    public Book(){
    }
    public Book(String name, String author, String description){
        System.out.println("Book Title: " + name);
        System.out.println("Author: " + author);
        System.out.println("Description: " + description);
    }


    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getIsInStock() {
        return isInStock;
    }

    public void setIsInStock(String isInStock) {
        this.isInStock = isInStock;
    }
}