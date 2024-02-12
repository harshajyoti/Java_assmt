package EmployeeWage;

import java.util.Scanner;

abstract class Employee{
    String name;
    int wagePerHour, workingHoursPerDay, workingDaysPerMonth ;

    public Employee(String name, int wagePerHour, int workingHoursPerDay, int workingDaysPerMonth){
        this.name = name;
        this.wagePerHour = wagePerHour;
        this.workingHoursPerDay = workingHoursPerDay;
        this.workingDaysPerMonth = workingDaysPerMonth;
    }

    abstract public int calculateDailyWage();

    abstract public int calculateMonthlyWage();

    public String getName() {
        return name;
    }

    public int getWagePerHour() {
        return wagePerHour;
    }

    public int getWorkingHoursPerDay() {
        return workingHoursPerDay;
    }

    public int getWorkingDaysPerMonth() {
        return workingDaysPerMonth;
    }
}

class FullTimeEmp extends Employee{

    public FullTimeEmp(String name, int wagePerHour, int workingHoursPerDay,int workingDaysPerMonth ) {
        super(name, wagePerHour, workingHoursPerDay, workingDaysPerMonth);
    }

    public int calculateDailyWage() {
        return wagePerHour * workingHoursPerDay;
    }

    public int calculateMonthlyWage() {
        return (wagePerHour * workingHoursPerDay) * workingDaysPerMonth;
    }
}

class PartTimeEmp extends Employee{

    public PartTimeEmp(String name, int wagePerHour, int workingHoursPerDay, int workingDaysPerMonth) {
        super(name, wagePerHour, workingHoursPerDay, workingDaysPerMonth);
    }

    public int calculateDailyWage() {
        return wagePerHour * workingHoursPerDay;
    }

    public int calculateMonthlyWage() {
        return (wagePerHour * workingHoursPerDay) * workingDaysPerMonth;
    }
}

public class Wage {

//    String companyName;
//    String empName;
//    int wagePerHour;
//    int workingHoursPerDay;
//    int workingDaysPerMonth;

    static Scanner scan = new Scanner(System.in);

    static String acceptCompanyName() {
        System.out.print("Enter the company name: ");
        String companyName = scan.next();
        return companyName;
    }

    static String acceptEmpName() {
        System.out.print("Enter employee name: ");
        String empName = scan.next();
        return empName;
    }

    static int[] acceptUserInput() {
        int[] inputs = new int[3];
        for (int i = 0; i < inputs.length; i++){
            if (i == 0){
                System.out.print("Enter Wage per hour: ");
            } else if (i == 1){
                System.out.print("Enter Working hours per day: ");
            } else{
                System.out.print("Enter Working days per month: ");
            }
            inputs[i] = scan.nextInt();
        }
        return inputs;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int choice;
        String compName;
        String empName;
        String compAndEmpName;
        String empType;
        int[] ui;

        do {
            System.out.println("--------------------------------");
            System.out.println("Welcome to Wage Computation Program! ");
            System.out.println("0. Exit");
            System.out.println("1. Calculate Daily Wage");
            System.out.println("2. Calculate Monthly Wage");
            System.out.print("Choose an operation(1 or 2): ");
            choice = scan.nextInt();
            switch (choice){
                case 1:
                    System.out.println("a. Full Time");
                    System.out.println("b. Part Time");
                    System.out.print("Enter type of Employment(choose a or b): ");
                    empType = scan.next();
                    switch (empType){
                        case "a":
                            compName = acceptCompanyName();
                            empName = acceptEmpName();
                            ui = acceptUserInput();
                            compAndEmpName = compName + empName;
                            FullTimeEmp fullTimeDayWage = new FullTimeEmp(empName, ui[0], ui[1], ui[2]);
                            System.out.println(compName + "company's Full Time Employee daily wage is: " + fullTimeDayWage.calculateDailyWage());
                            break;
                        case "b":
                            compName = acceptCompanyName();
                            empName = acceptEmpName();
                            ui = acceptUserInput();
                            compAndEmpName = compName + empName;
                            FullTimeEmp partTimeDayWage = new FullTimeEmp(empName, ui[0], ui[1], ui[2]);
                            System.out.println(compName + "company's part Time Employee daily wage is: " + partTimeDayWage.calculateDailyWage());
                            break;
                    }
                    break;
                case 2:
                    System.out.println("a. Full Time");
                    System.out.println("b. Part Time");
                    System.out.print("Enter type of Employment(choose a or b): ");
                    empType = scan.next();
                    switch (empType){
                        case "a":
                            compName = acceptCompanyName();
                            empName = acceptEmpName();
                            ui = acceptUserInput();
                            compAndEmpName = compName + empName;
                            FullTimeEmp fullTimeMonthlyWage = new FullTimeEmp(empName, ui[0], ui[1], ui[2]);
                            System.out.println(compName + "company's Full Time Employee Monthly wage is: " + fullTimeMonthlyWage.calculateMonthlyWage());
                            break;
                        case "b":
                            compName = acceptCompanyName();
                            empName = acceptEmpName();
                            ui = acceptUserInput();
                            compAndEmpName = compName + empName;
                            FullTimeEmp partTimeMonthlyWage = new FullTimeEmp(empName, ui[0], ui[1], ui[2]);
                            System.out.println(compName + "company's part Time Employee Monthly wage is: " + partTimeMonthlyWage.calculateMonthlyWage());
                            break;
                    }
                    break;
                case 0 :
                    System.out.println("-----------------------------------------------");
                    System.out.println("Thank you for using Wage Computation Program!");
                    System.out.println("-----------------------------------------------");
                    System.exit(3);
                default:
                    System.out.println("Invalid !");
            }
        }
        while (choice != 0);
    }
}
