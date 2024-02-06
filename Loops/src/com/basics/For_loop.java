package com.basics;

import java.util.Scanner;

public class For_loop {
    public static void main(String[] args) {
//        for(int i = 0; i < 5; i++){
//            System.out.println("index: " + i);
//        }

        // wap to print sum of given range
//        Scanner input = new Scanner(System.in);
//        int sum = 0;
//        System.out.print("enter a num: ");
//        int a = input.nextInt();
//        for(int i = 0; i < a; i++){
//            sum += i;
//        }
//        System.out.println(sum);

        // wap to write a math table
//        int x = 5;
//        for(int i = 1; i <= 10; i++){
//            System.out.println(x + " * " + i + " = " + x * i);
//        }

        // Fibonacci series
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int first = 0, second = 1;
        if(n < 0){
            System.out.println("not a valid num");
        }
        else if (n == 0){
            System.out.println(0);
        }
        else{
            for(int i = 2; i <= n; i++){
//            System.out.println(second);
                int c = first + second;
                first = second;
                second = c;
            }
            System.out.println(second);
        }
    }
}
