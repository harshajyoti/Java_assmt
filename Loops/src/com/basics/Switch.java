package com.basics;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        /*
        switch(expression) {
            case x:
                // code block
                break;
            case y:
                // code block
                break;
            default:
                // code block
         }
         */

        // wap to build a simple calculator using switch
        Scanner scan = new Scanner(System.in);
//        int a = scan.nextInt();
//        int b = scan.nextInt();
//        char op;
//        op = scan.next().charAt(0);
//
//        switch (op){
//            case '+':
//                System.out.println(a + b);
//                break;
//            case '-':
//                System.out.println(a - b);
//                break;
//            case '*':
//                System.out.println(a * b);
//                break;
//            case '/':
//                if(b != 0) {
//                    System.out.println(a / b);
//                }else{
//                    System.out.println("can't divide by zero");
//                }
//                break;
//            default:
//                System.out.println("invalid operator");
//        }
//        scan.close();

//        Days in a Month

        int month, year;
        System.out.println("enter the month (1-12) :");
        month = scan.nextInt();

        System.out.println("enter the year");
        year = scan.nextInt();

        int daysInMonth;
        switch(month){
            case 1:
                daysInMonth = 31;
                break;
            case 3:
                daysInMonth = 31;
                break;
            case 5:
                daysInMonth = 31;
                break;
            case 7:
                daysInMonth = 31;
                break;
            case 8:
                daysInMonth = 31;
                break;
            case 10:
                daysInMonth = 31;
                break;
            case 12:
                daysInMonth = 31;
                break;
            case 4:
                daysInMonth = 30;
                break;
            case 6:
                daysInMonth = 30;
                break;
            case 9:
                daysInMonth = 30;
                break;
            case 11:
                daysInMonth = 30;
                break;
            case 2:
                if ((year % 4 == 0) && (year % 100 == 0) || year % 400 == 0) {
                    daysInMonth = 29;
                    break;
                } else{
                    daysInMonth = 28;
                    break;
                }
            default:
                System.out.println("invalid Month");
                scan.close();
                return;
        }
        System.out.println("num of days in month " + month + " in year " + year + "is: " + daysInMonth);
        scan.close();
    }
}
