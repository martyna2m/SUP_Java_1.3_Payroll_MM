package org.example;

import java.util.ArrayList;

public class Company {
    public static ArrayList<Employee> allEmployees = new ArrayList<>();

    public static void printAllEmployees() {
        System.out.println(Company.allEmployees);
    }

    public static void sumSalary() {
        double sum = 0;
        for (Employee allEmployee : allEmployees) {
            sum += allEmployee.getSalary();
        }
        System.out.println("Total salary of all employees = " + sum);
    }
}



