package Sinduri.A6;

public class Pet extends Product {
    private String petName;
    private String petBreed;
    private double age;

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getPetBreed() {
        return petBreed;
    }

    public void setPetBreed(String petBreed) {
        this.petBreed = petBreed;
    }

    @Override
    public String toString() {
        return "\nProduct Name: " + getProductName() +
                "\nProduct Description: " + getProductDescription() +
                "\nProduct Price: " + getProductPrice() + "$" +
                "\nPet Name: " + getPetName() +
                "\nPet Breed: " + getPetBreed() +
                "\nPet Age: " + getAge() + " years old";
    }
}
