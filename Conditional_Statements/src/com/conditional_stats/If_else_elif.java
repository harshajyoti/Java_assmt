package com.conditional_stats;
import java.util.Scanner;

public class If_else_elif {
    public static void main(String[] args) {
//        Even or Odd
        int a = 10;
        if (a % 2 == 0){
            System.out.println(a + " is even");
        } else{
            System.out.println(a + " is odd");
        }

//        Grade Evaluation
        Scanner scan = new Scanner(System.in);
        int score = scan.nextInt();
        if (score > 90){
            System.out.println("Grade A");
        } else if (score >= 80){
            System.out.println("Grade B");
        } else if (score >= 70){
            System.out.println("Grade C");
        } else if (score >= 60){
            System.out.println("Grade D");
        } else {
            System.out.println("Grade F");
        }

//        max of three num
        int x = 10, y =20, z = 30;
        if ((x > y) && (x > z)){
            System.out.println(x + " is greater");
        } else if ((y > x) && (y > z)){
            System.out.println(y + " is greater");
        } else{
            System.out.println(z + " is greater");
        }
    }
}
