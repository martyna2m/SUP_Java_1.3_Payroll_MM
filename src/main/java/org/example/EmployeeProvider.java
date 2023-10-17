package org.example;

public class EmployeeProvider {


    public static Employee addEmployee() {
        UserInputHelper userInputHelper = new UserInputHelper();

        MenuHelper.printNameInstruction();
        String firstName = userInputHelper.getTextFromUser();

        MenuHelper.printLastNameInstruction();
        String lastName = userInputHelper.getTextFromUser();

        MenuHelper.printSalaryInstruction();
        double salary = userInputHelper.getSalaryFromUser();

        return new Employee(firstName, lastName, salary);

    }
}
