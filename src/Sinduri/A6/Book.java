package Sinduri.A6;

public class Book extends Product {
    private String bookAuthor;
    private String bookPublisher;

    public Book() {
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookPublisher() {
        return bookPublisher;
    }

    public void setBookPublisher(String bookPublisher) {
        this.bookPublisher = bookPublisher;
    }

    @Override
    public String toString() {
        return "\nBook Name: " + getProductName() +
                "\nBook Description: " + getProductDescription() +
                "\nBook Price: " + getProductPrice() +
                "$\nBook Author: " + getBookAuthor() +
                "\nBook Publisher: " + getBookPublisher();
    }
}
