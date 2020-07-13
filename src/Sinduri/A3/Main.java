package Sinduri.A3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        Student student1 =  new Student();
        student1.setsFirstName("Ahalya");
        student1.setsLastName("Gun");
        student1.setsYearOfBirth(2012);
        student1.setsAge(8);
        student1.setsClass("4C");
        studentList.add(student1);

        Student student2 =  new Student();
        student2.setsFirstName("Minerva");
        student2.setsLastName("Flad");
        student2.setsYearOfBirth(2013);
        student2.setsAge(7);
        student2.setsClass("3A");
        studentList.add(student2);

        Student student3 =  new Student();
        student3.setsFirstName("Hella");
        student3.setsLastName("Flad");
        student3.setsYearOfBirth(2016);
        student3.setsAge(4);
        student3.setsClass("1A");
        studentList.add(student3);

        Student student4 =  new Student();
        student4.setsFirstName("Luna");
        student4.setsLastName("Kanch");
        student4.setsYearOfBirth(2013);
        student4.setsAge(7);
        student4.setsClass("3B");
        studentList.add(student4);

        Student student5 =  new Student();
        student5.setsFirstName("Subbu");
        student5.setsLastName("Sin");
        student5.setsYearOfBirth(2014);
        student5.setsAge(6);
        student5.setsClass("2C");
        studentList.add(student5);

        for(Student element: studentList) {
            System.out.printf("%s %s, born in %d, age %d, goes to Class %s. %n", element.getsFirstName(), element.getsLastName(), element.getsYearOfBirth(), element.getsAge(), element.getsClass());
        }




    }
}
