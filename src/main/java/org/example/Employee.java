package org.example;

public class Employee {

    private String firstName;
    private String lastName;

    private double salary;


    public Employee(String firstName, String lastName, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getAllData() {
        this.getFirstName();
        this.getLastName();
        this.getSalary();
        return "Salary for " + this.firstName + this.lastName + "is " + this.salary;
    }


}

