package Main;

import ChristianA1.Employee;
import ChristianA2.Dog;
import ChristianA3.Student;

public class Main {

    public static void main(String[] args) {


//A1
        Employee person1 = new Employee();
        Employee person2 = new Employee();
        Employee person3 = new Employee();

        person1.setName("Sebastian");
        person1.setSurname("Mueller");
        person1.setSalary(2000);
        person1.setYearOfBirth(1990);

        person2.setName("Fritz");
        person2.setSurname("Maier");
        person2.setSalary(1800);
        person2.setYearOfBirth(1980);

        person3.setName("Saskia");
        person3.setSurname("Stemer");
        person3.setSalary(3500);
        person3.setYearOfBirth(1989);

        System.out.println(person1.getName() + " " + person1.getSurname() + " Salary: " + person1.getSalary());


//A2
        Dog Buster = new Dog();

        Buster.setAge(9);
        Buster.doWoof();
        System.out.println("Dogs' age: " + Buster.getAge());


//A3
        Student student1 = new Student();

        student1.setName("Michael");
        student1.setSurname("Mikkels");
        student1.setBorn(2004);
        student1.setSchoolClass("4b");

        student1.displayStudent();

        Student student2 = new Student();

    }
}
