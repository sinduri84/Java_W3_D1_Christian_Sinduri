package Sinduri.A1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Employee> employeeList= new ArrayList<>();

        Employee employee1 = new Employee();
        employee1.setEmplFirstName("Hans");
        employee1.setEmpLastName("Faldeboe");
        employee1.setEmpYearOfBirth(1982);
        employee1.setEmpSalary(56000);
        employeeList.add(employee1);

        Employee employee2 = new Employee();
        employee2.setEmplFirstName("Hema");
        employee2.setEmpLastName("Rallapalli");
        employee2.setEmpYearOfBirth(1984);
        employee2.setEmpSalary(56000);
        employeeList.add(employee2);

        Employee employee3 = new Employee();
        employee3.setEmplFirstName("Black");
        employee3.setEmpLastName("Widow");
        employee3.setEmpYearOfBirth(1984);
        employee3.setEmpSalary(158000);
        employeeList.add(employee3);

        Employee employee4 = new Employee();
        employee4.setEmplFirstName("Captain");
        employee4.setEmpLastName("America");
        employee4.setEmpYearOfBirth(1918);
        employee4.setEmpSalary(94000);
        employeeList.add(employee4);

        Employee employee5 = new Employee();
        employee5.setEmplFirstName("Bruce");
        employee5.setEmpLastName("Banner");
        employee5.setEmpYearOfBirth(1977);
        employee5.setEmpSalary(116000);
        employeeList.add(employee5);

        boolean morePlayers = true;
        Scanner inputString = new Scanner(System.in);
        Scanner inputInt = new Scanner(System.in);

        while (morePlayers) {
            Employee employee = new Employee();
            System.out.print("Do you want to add a new employee? Yes/No?");
            String selectedOption = inputString.nextLine();
            if(selectedOption.equals("Yes")) {
                System.out.print("Add First Name: ");
                employee.setEmplFirstName(inputString.nextLine());
                System.out.print("Add Last Name: ");
                employee.setEmpLastName(inputString.nextLine());
                System.out.print("Add Year of Birth: ");
                employee.setEmpYearOfBirth(inputInt.nextInt());
                System.out.print("Add Salary: ");
                employee.setEmpSalary(inputInt.nextInt());
                employeeList.add(employee);
            } else {
                morePlayers = false;
            }

        }



        for(Employee element: employeeList) {
            System.out.printf("%-16s %-16s %-4d %-6d$%n", element.getEmplFirstName(), element.getEmpLastName(), element.getEmpYearOfBirth(), element.getEmpSalary());
        }

    }
}
