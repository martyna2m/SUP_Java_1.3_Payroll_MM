package org.example;

import java.util.ArrayList;

public class Company {
    private ArrayList<Employee> allEmployees = new ArrayList<>();


    public void addEmployeeToList(Employee employee) {
        allEmployees.add(employee);
    }

    public void printAllEmployees() {
        System.out.println(allEmployees);
    }


    public void printTotalSalary() {
        double sum = 0;
        for (Employee employee : allEmployees) {
            sum += employee.getSalary();
        }
        System.out.println("Total salary of all employees = " + sum);
    }
}

