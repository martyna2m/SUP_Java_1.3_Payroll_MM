package org.example;

import java.util.Scanner;

public class Program {


    public void startPayrollProgram() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello!");

        for (int i = 0; i < 100; i++) {
            displayMenu();
            int option = scan.nextInt();
            switch (option) {
                case 1 -> System.out.println("Not yet done");
                case 2 -> System.out.println(Company.allEmployees);
                case 3 -> Employee.addNewEmployee();
                default -> System.out.println("All done. Bye");
            }
        }
    }

    public void displayMenu() {
        System.out.println("\n" + "What do you want to do? Choose an option from 1 to 4:\n" +
                "1 – Print sum of all employees salary\n" +
                "2 – Display all employees data\n" +
                "3 – Add new employee\n" +
                "4 – End program");
    }

}

