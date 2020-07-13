package Sinduri.A2;

public class Main {
    public static void main(String[] args) {
        Dog dog1 =  new Dog();

        dog1.setName("Bobby");
        dog1.setAge(2);
        dog1.setRace("Mixed-Breed");
        dog1.setWeight(2);

        System.out.printf("%-16s %-16s %-4s %skgs%n", dog1.getName(), dog1.getRace(), dog1.getAge(), dog1.getWeight());
        dog1.doWoof();
    }
}
