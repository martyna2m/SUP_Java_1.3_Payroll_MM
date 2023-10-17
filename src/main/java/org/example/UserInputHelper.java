package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInputHelper {

    Scanner scan = new Scanner(System.in);

    public String getTextFromUser() {
        String textInput = scan.nextLine();
        while (textInput.isEmpty()) {
            System.out.println("The value cannot be null.");
            textInput = scan.nextLine();
        }
        return textInput;
    }

    public double getSalaryFromUser() {
        boolean success = false;
        double salaryInput = 0;

        while (!success)
            try {
                salaryInput = scan.nextDouble();
                while (salaryInput <= 0) {
                    System.out.println("Salary must be greater than 0.");
                    salaryInput = scan.nextDouble();
                }
                success = true;
            } catch (Exception e) {
                System.out.println("Salary must be a number, e.g. 2500");
                scan.nextLine();
            }

        return salaryInput;
    }


    public int getIntFromUser() throws InputMismatchException {
        boolean success = false;
        int intInput = 0;
        while (!success)
            try {
                intInput = scan.nextInt();
                success = true;
            } catch (Exception e) {
                MenuHelper.printAlert();
                scan.nextLine();
            }
        return intInput;
    }
}


