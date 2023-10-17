package org.example;

public class MenuHelper {


    public static void displayMenu() {
        System.out.println("""

                What do you want to do? Choose an option from 1 to 4:
                1 – Print sum of all employees salary
                2 – Display all employees data
                3 – Add new employee
                4 – End program""");
    }


    public static void printAlert() {
        System.out.println("You can only choose a number from 1 to 4 as an option.");
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
        System.out.println("Put SALARY of an employee, e.g. 2500");
    }


    public static void printSingleSuccessInfo() {
        System.out.println("Employee added successfully.");
    }


    public static void printClosingInfo() {
        System.out.println("Program closed.");
    }

}


