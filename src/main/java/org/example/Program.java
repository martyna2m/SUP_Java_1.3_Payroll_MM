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
                case 3 -> Employee.addNewEmployee();
                case 4 -> {
                    printClosingInfo();
                    {
                        return;
                    }
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

    public void printClosingInfo() {
        System.out.println("Program closed");
    }

}


