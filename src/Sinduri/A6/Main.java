package Sinduri.A6;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>();

        Product product1 = new Product();
        product1.setProductName("Bose QuietComfort 35 (Series II) wireless headphones");
        product1.setProductDescription("Noise canceling, with Alexa voice control, Black");
        product1.setProductPrice(250);
        productList.add(product1);

        PhysicalBook book1 = new PhysicalBook();
        book1.setProductName("Lord of the Rings");
        book1.setBookAuthor("J. R. R. Tolkien");
        book1.setProductDescription("Epic Fantasy Novel");
        book1.setBookPublisher("Allen and Unwin");
        book1.setProductPrice(20);
        book1.setBookWeight(1.2d);
        productList.add(book1);

        ElectronicBook book2 = new ElectronicBook();
        book2.setProductName("Lord of the Rings");
        book2.setBookAuthor("J. R. R. Tolkien");
        book2.setProductDescription("Epic Fantasy Novel");
        book2.setBookPublisher("Allen and Unwin");
        book2.setProductPrice(20);
        book2.setBookURL("https://en.wikipedia.org/wiki/The_Lord_of_the_Rings");
        productList.add(book2);

        Dog dog1 = new Dog();
        dog1.setProductName("Dog");
        dog1.setProductDescription("Just a dog");
        dog1.setProductPrice(150);
        dog1.setPetName("Bobby");
        dog1.setPetBreed("Mixed-Breed");
        dog1.setAge(0.5);
        productList.add(dog1);

        Cat cat1 = new Cat();
        cat1.setProductName("Cat");
        cat1.setProductDescription("Just a cat");
        cat1.setProductPrice(5000);
        cat1.setPetName("Minerva");
        cat1.setPetBreed("Tabby");
        cat1.setAge(1);
        productList.add(cat1);

        for(Product product: productList) {
            System.out.println(product.toString());
        }


    }
}
