package Main;

import ChristianA1.Employee;
import ChristianA2.Dog;
import ChristianA3.Student;

import java.util.ArrayList;

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


        Student student2 = new Student();

        student2.setName("Markus");
        student2.setSurname("Markl");
        student2.setBorn(2002);
        student2.setSchoolClass("6c");

        Student student3 = new Student();

        student3.setName("Maria");
        student3.setSurname("Huber");
        student3.setBorn(2002);
        student3.setSchoolClass("6a");

        Student student4 = new Student();

        student4.setName("Stefanie");
        student4.setSurname("Stankovic");
        student4.setBorn(2006);
        student4.setSchoolClass("2e");

        ArrayList<Student> studentArray = new ArrayList<>();

        studentArray.add(student1);
        studentArray.add(student2);
        studentArray.add(student3);
        studentArray.add(student4);


        for(Student student : studentArray) {
            student.displayStudent();
        }


    }
}
