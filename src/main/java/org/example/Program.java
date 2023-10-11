package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {


    public void startPayrollProgram() throws InputMismatchException {
        try {
            Scanner scan = new Scanner(System.in);

            for (int i = 0; i < 1000000; i++) {
                displayMenu();
                int option = scan.nextInt();
                switch (option) {
                    case 1 -> Employee.sumSalary();
                    case 2 -> Company.printAllEmployees();
                    case 3 -> {
                        Employee.addSingleEmployee();
                        printSingleSuccessInfo();
                    }
                    case 4 -> {
                        printClosingInfo();
                        return;
                    }
                }
            }
        } catch (Exception e) {
            printAlert();

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

    public static void printAlert() {
        System.out.println("You can only choose a number as an option. Program closed, please start again.");
    }

    public static void printInitialQuestion() {
        System.out.println("How many employees do you want to add at the start? E.g. 5");
    }

    public static void printEmployeeIndex(int employeeIndex) {
        System.out.println("Create Employee nr " + employeeIndex);
    }


    public static void printSuccessInfo(int employeeIndex) {
        System.out.println("Employee nr " + employeeIndex + " added successfully" + "\n");
    }


    public static void printNameInstruction() {
        System.out.println("Put FIRST NAME of an employee, e.g. John");
    }

    public static void printLastNameInstruction() {
        System.out.println("Put LAST NAME of an employee, e.g. Smith");
    }

    public static void printSalaryInstruction() {
        System.out.println("Put SALARY ($) of an employee, e.g. 6500");
    }


    public static void printSingleSuccessInfo() {
        System.out.println("Employee added successfully.");
    }


    public void printClosingInfo() {
        System.out.println("Program closed.");
    }

}


