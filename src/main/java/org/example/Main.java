package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Program program = new Program();

        program.startPayrollProgram();

        System.out.println(Company.allEmployees);
    }
}


