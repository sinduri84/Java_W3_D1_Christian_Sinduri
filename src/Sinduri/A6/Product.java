package Sinduri.A6;

public class Product {
    private String productName;
    private String productDescription;
    private int productPrice;

    public Product() {
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return "\nProduct Name: " + getProductName() +
                "\nProduct Description: " + getProductDescription() +
                "\nProduct Price: " + getProductPrice() + "$";
    }

}
