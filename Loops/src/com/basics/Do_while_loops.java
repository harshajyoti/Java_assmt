package com.basics;
import java.util.Scanner;

public class Do_while_loops {
    public static void main(String[] args) {
        /*
        syntax:
        do
        {
            body of loop
            statements to be executed
            update
        }
        while(condition);
         */

//        int i = 0;
//        do {
//            System.out.println("hello");
//            i++;
//        }
//        while (i < 0);
//
//        // Reading User Input Until a Specific Condition is Met:
        Scanner scan = new Scanner(System.in);
//        int num;
//        do {
//            System.out.print("enter a num: ");
//            num = scan.nextInt();
//        }
//        while (num != 0 && num > 0);
//        System.out.println("you entered 0");
//        scan.close();

//        wap for switch using do while
        int choice;
        do{
            System.out.println("---------------------");
            System.out.println("1. Print Hello");
            System.out.println("2. Print World");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scan.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Hello");
                    break;
                case 2:
                    System.out.println("World");
                    break;
                case 3:
                    System.out.println("exiting the program");
                    break;
                default:
                    System.out.println("invalid choice! try again");
            }
        } while (choice != 3);

        scan.close();
    }
}
