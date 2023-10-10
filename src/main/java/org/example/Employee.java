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
        Program.printInitialQuestion();
        Scanner scan = new Scanner(System.in);

        int numberOfEmployees = scan.nextInt();
        for (int i = 0; i < numberOfEmployees; i++) {
            Program.printInstruction(i + 1);
            String firstName = scan.next();
            String lastName = scan.next();
            double salary = scan.nextDouble();
            Program.printSuccessInfo(i + 1);
            new Employee(firstName, lastName, salary);
        }

    }

    public static void addSingleEmployee() {
        Scanner scan = new Scanner(System.in);
        Program.printSingleInstruction();
        String firstName = scan.next();
        String lastName = scan.next();
        double salary = scan.nextDouble();
        Program.printSingleSuccessInfo();
        new Employee(firstName, lastName, salary);

    }


}

