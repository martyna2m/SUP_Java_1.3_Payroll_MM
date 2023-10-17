package org.example;

public class Main {
    public static void main(String[] args) {

        Company company = new Company();
        UserInputHelper userInputHelper = new UserInputHelper();

        int numberOfEmployees = 5;

        for (int i = 0; i < numberOfEmployees; i++) {
            MenuHelper.printEmployeeIndex(i + 1);
            company.addEmployeeToList(EmployeeProvider.addEmployee());
            MenuHelper.printSuccessInfo(i + 1);
        }


        while (true) {
            MenuHelper.displayMenu();
            int option = userInputHelper.getIntFromUser();
            switch (option) {
                case 1 -> company.printTotalSalary();
                case 2 -> company.printAllEmployees();
                case 3 -> {
                    company.addEmployeeToList(EmployeeProvider.addEmployee());
                    MenuHelper.printSingleSuccessInfo();
                }
                case 4 -> {
                    MenuHelper.printClosingInfo();
                    System.exit(0);
                }
                default -> MenuHelper.printAlert();
            }
        }

    }

}


