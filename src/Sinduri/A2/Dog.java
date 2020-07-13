package Sinduri.A2;

public class Dog {

    private String name;
    private int age;
    private int weight;
    private String race;

    public Dog() {

    }

    public void doWoof() {
        System.out.println("Woof!");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }
}
