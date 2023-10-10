package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {


    public void startPayrollProgram() throws InputMismatchException {
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 1000000; i++) {
            displayMenu();
            int option = scan.nextInt();
            switch (option) {
                case 1 -> Employee.sumSalary();
                case 2 -> Company.printAllEmployees();
                case 3 -> Employee.addSingleEmployee();
                case 4 -> {
                    printClosingInfo();

                    return;
                }
            }
        }
    }


    public void displayMenu() {
        System.out.println("""

                What do you want to do? Choose an option from 1 to 4:
                1 – Print sum of all employees salary
                2 – Display all employees data
                3 – Add new employee
                4 – End program""");
    }


    public static void printInitialQuestion() {
        System.out.println("How many employees do you want to add at the start? E.g. 5");
    }

    public static void printInstruction(int employeeIndex) {
        System.out.println("Put First Name, Last Name, and Salary ($) of an employee nr " + employeeIndex + " , e.g. John Smith 6500");
    }


    public static void printSuccessInfo(int employeeIndex) {
        System.out.println("Employee nr " + employeeIndex + " added successfully");
    }


    public static void printSingleInstruction() {
        System.out.println("Put First Name, Last Name, and Salary ($) of an employee, e.g. John Smith 6500");
    }


    public static void printSingleSuccessInfo() {
        System.out.println("Employee added successfully");
    }


    public void printClosingInfo() {
        System.out.println("Program closed");
    }

}


