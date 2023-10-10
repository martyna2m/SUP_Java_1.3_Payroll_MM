package org.example;

public class Main {
    public static void main(String[] args) {


        Program program = new Program();

        try {
            Employee.addEmployees();
        } catch (Exception e) {
            System.out.println("You can only choose an integer as an option. Please start again or use options from the menu.");

        }

        try {
            program.startPayrollProgram();
        } catch (Exception e) {
            System.out.println("You can only choose a number from 1 to 4. Please start again.");


        }
    }
}


