package org.example;

import java.util.Scanner;

public class Employee extends Company {

    public String firstName;
    public String lastName;
    public double salary;


    public Employee(String firstName, String lastName, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        allEmployees.add(this);
    }




    @Override
    public String toString() {
        return "Employee: " +
                "First Name = '" + firstName + '\'' +
                ", Last Name = '" + lastName + '\'' +
                ", Salary = " + salary + '\n'
                ;
    }

    public static Employee addNewEmployee() {
        Scanner scan = new Scanner(System.in);
        printInstruction();
        String firstName = scan.next();
        String lastName = scan.next();
        double salary = scan.nextDouble();
        printSuccessInfo();
        return new Employee(firstName, lastName, salary);


    }
    public static void printInstruction(){
        System.out.println("Put First Name, Last Name, and Salary of an employee, eg. John Smith 6500");
    }

    public static void printSuccessInfo(){
        System.out.println("Employee added successfully");
    }
}

