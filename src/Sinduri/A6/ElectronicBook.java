package Sinduri.A6;

public class ElectronicBook extends Book {
    private String bookURL;

    public String getBookURL() {
        return bookURL;
    }

    public void setBookURL(String bookURL) {
        this.bookURL = bookURL;
    }

    @Override
    public String toString() {
        return "\nBook Name: " + getProductName() +
                "\nBook Description: " + getProductDescription() +
                "\nBook Price: " + getProductPrice() +
                "$\nBook Author: " + getBookAuthor() +
                "\nBook Publisher: " + getBookPublisher() +
                "\nBook URL: " + getBookURL();
    }
}
