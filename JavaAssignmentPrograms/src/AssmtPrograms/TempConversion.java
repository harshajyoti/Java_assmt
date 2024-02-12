package AssmtPrograms;

import java.util.Scanner;

public class TempConversion {

    /*
    Develop a Java program that converts temperatures between Fahrenheit and Celsius based on user input. Use conditional statements to determine the conversion formula based on the user's choice.
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double temp;

        System.out.println("Welcome to Temperature Conversion program!");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.print("Please choose an option(1 or 2): ");
        int option = scan.nextInt();
        if (option == 1){
            System.out.print("Please Enter Temperature in Fahrenheit: ");
            temp = scan.nextDouble();
            System.out.println((temp - 32) * 5 / 9);
        } else if (option == 2){
            System.out.print("Please Enter Temperature in Celsius: ");
            temp = scan.nextDouble();
            System.out.println((temp * 9 / 5) + 32);
        } else {
            System.out.println("Invalid option!!");
            System.exit(0);
        }
    }
}
