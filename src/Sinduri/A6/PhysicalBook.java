package Sinduri.A6;

public class PhysicalBook extends Book {
    private double bookWeight;

    public PhysicalBook() {
    }

    public double getBookWeight() {
        return bookWeight;
    }

    public void setBookWeight(double bookWeight) {
        this.bookWeight = bookWeight;
    }

    @Override
    public String toString() {
        return "\nBook Name: " + getProductName() +
                "\nBook Description: " + getProductDescription() +
                "\nBook Price: " + getProductPrice() +
                "$\nBook Author: " + getBookAuthor() +
                "\nBook Publisher: " + getBookPublisher() +
                "\nBook Weight: " + getBookWeight() + " kgs";
    }
}
