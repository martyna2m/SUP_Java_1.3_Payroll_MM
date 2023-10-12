package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Employee extends Company {
    private String firstName;
    private String lastName;
    private double salary;

    public Employee() {
        allEmployees.add(this);
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Salary for " + firstName + " " + lastName + " is " + salary + '\n';
    }

    public static void addEmployees() throws InputMismatchException {
        try {
            Program.printInitialQuestion();
            Scanner scan = new Scanner(System.in);
            int numberOfEmployees = scan.nextInt();

            for (int i = 0; i < numberOfEmployees; i++) {
                Program.printEmployeeIndex(i + 1);
                addSingleEmployee();
                Program.printSuccessInfo(i + 1);
            }
        } catch (Exception e) {
            System.out.println("You can only choose a number as an option. Please start again or use options from the menu.");
        }
    }


    public static void addSingleEmployee() throws InputMismatchException {
        Scanner scan = new Scanner(System.in);
        Employee employee = new Employee();

        Program.printNameInstruction();
        String firstName = scan.nextLine();
        while (firstName.isEmpty()) {
            System.out.println("The value cannot be null.");
            firstName = scan.nextLine();
        }
        employee.setFirstName(firstName);

        Program.printLastNameInstruction();
        String lastName = scan.nextLine();
        while (lastName.isEmpty()) {
            System.out.println("The value cannot be null.");
            lastName = scan.nextLine();
        }
        employee.setLastName(lastName);

        Program.printSalaryInstruction();
        double salary = scan.nextDouble();
        while (salary <= 0) {
            System.out.println("Salary must be greater than 0.");
            salary = scan.nextDouble();
        }
        employee.setSalary(salary);

    }


}





