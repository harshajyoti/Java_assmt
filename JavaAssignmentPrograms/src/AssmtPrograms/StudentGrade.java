package AssmtPrograms;

import java.util.Scanner;

public class StudentGrade {

    /*
    Write a Java program that takes a student's score as input and classifies it into grades (A, B, C, D, or F) based on the following criteria:

    A: 90-100

    B: 80-89

    C: 70-79

    D: 60-69

    F: 0-59
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your Score: ");
        int marks = scan.nextInt();
        if (marks >= 90 && marks <= 100){
            System.out.println("Grade A");
        } else if (marks >= 80 && marks < 90){
            System.out.println("Grade B");
        } else if (marks >= 70 && marks < 80){
            System.out.println("Grade C");
        } else if (marks >= 60 && marks < 70){
            System.out.println("Grade D");
        } else if (marks >= 0 && marks < 60){
            System.out.println("Grade F");
        } else {
            System.out.println("Invalid marks!");
            System.exit(0);
        }
    }
}
