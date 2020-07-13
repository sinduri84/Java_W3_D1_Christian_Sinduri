package ChristianA2;

public class Dog {
    public String name;

    private int age;

    public int weight;

    public String race;

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
}
