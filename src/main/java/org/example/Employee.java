package org.example;

import java.util.Scanner;

public class Employee extends Company {

    private String firstName;
    private String lastName;
    private double salary;


    public Employee(String firstName, String lastName, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        allEmployees.add(this);
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee: " +
                "First Name = '" + firstName + '\'' +
                ", Last Name = '" + lastName + '\'' +
                ", Salary = " + salary + '\n'
                ;
    }

    public static void addEmployees() {
        printInitialQuestion();
        Scanner scan = new Scanner(System.in);

        int numberOfEmployees = scan.nextInt();
        for (int i = 0; i < numberOfEmployees; i++) {
            printInstruction(i + 1);
            String firstName = scan.next();
            String lastName = scan.next();
            double salary = scan.nextDouble();
            printSuccessInfo(i + 1);
            new Employee(firstName, lastName, salary);
        }

    }

    public static void addNewEmployee() {
        Scanner scan = new Scanner(System.in);
        printSingleInstruction();
        String firstName = scan.next();
        String lastName = scan.next();
        double salary = scan.nextDouble();
        printSingleSuccessInfo();
        new Employee(firstName, lastName, salary);

    }


    public static void printInitialQuestion() {
        System.out.println("How many employees do you want to add at the start? E.g. 5");
    }

    public static void printInstruction(int employeeIndex) {
        System.out.println("Put First Name, Last Name, and Salary($) of an employee nr " + employeeIndex + " , e.g. John Smith 6500");
    }


    public static void printSuccessInfo(int employeeIndex) {
        System.out.println("Employee nr " + employeeIndex + " added successfully");
    }


    public static void printSingleInstruction() {
        System.out.println("Put First Name, Last Name, and Salary($) of an employee, e.g. John Smith 6500");
    }


    public static void printSingleSuccessInfo() {
        System.out.println("Employee added successfully");
    }
}

