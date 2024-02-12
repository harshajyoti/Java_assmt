package com.arrays;
import java.util.Scanner;

public class Array_basics {
    public static void main(String[] args) {
        // Array : array is an object which contains elements of similar datatype type
        /*
        - Array is an object in java.
        - It is indexed, we can access the element s by using index.
        - Dimensionality - 1D, 2D, 3D.
        - can store homogeneous and heterogeneous data.
        - Regular and Jagged data.
         */

        // Create an array and print it

//        int[] a = {1, 2, 3, 4, 5};
//        for (int i = 0; i < a.length; i++){
//            System.out.println(a[i]);
//        }
//        // To check the type of variable a
//        System.out.println(a.getClass().getSimpleName()); // output : int[]
//        System.out.println((a instanceof int[])); // output : true

        // Create an array and store some values to it

//        int[] arr = new int[5];
//        for (int i = 0; i < 5; i++){
//            arr[i] = i + 1;
//        }
//        for (int i = 0; i < arr.length; i++){
//            System.out.println(arr[i]);
//        }

        // Create an array to store the ages of 5 students by using user input

        Scanner scan = new Scanner(System.in);
//        int[] a = new int[5];
//        for (int i = 0; i < 5; i++){
//            System.out.print("Enter the age of the student " + (i + 1) + " : ");
//            a[i] = scan.nextInt();
//        }
//        for (int i = 0; i < a.length; i++){
//            System.out.println(a[i]);
//        }

        // 2D Array

        /*
        - 2D Array
        - Homogeneous Data
        - Regular - both dimensions have same size
             j

             |
            ----------------
        i-- |10|20|20|22|23|   - This row represents class 1
            ----------------
            |14|12|10|20|13|   - This row represents class 2
            ----------------
         */

        // Create an array to store the ages of students belonging to 2 classrooms with 5 students each

//        int class_rooms = 2;
//        int students_per_class = 5;
//        int[][] a = new int[class_rooms][students_per_class];
//        for (int i = 0; i < class_rooms; i++){
//            for (int j = 0; j < students_per_class; j++){
//                System.out.print("Enter the age of student " + (j + 1) + " from class " + (i + 1) +" : ");
//                a[i][j] = scan.nextInt();
//            }
//            System.out.println("-----------------------------");
//        }
//        for (int i = 0; i < a.length; i++){
//            for (int j = 0; j < a[i].length; j++){
//                System.out.println("The age of student " + (j + 1) + " from class " + (i + 1) +" is: " + a[i][j]);
//            }
//            System.out.println("-----------------------------");
//        }

        // Storing Heterogeneous(Different type) data in an 1D array

//        Object[] a = new Object[5];
//        for (int i = 0; i < 5; i++){
//            System.out.print("Enter the Input: ");
//            a[i] = scan.next(); // Read input as string
//        }
//        for (int i = 0; i < 5; i++){
//            System.out.println(a[i]);
//        }
//        // checking the type of the element inside an array
//        for (int i = 0; i < 5; i++){
//            System.out.println(a[i].getClass().getSimpleName());
//        }

        // Create an array to store the ages of students belonging to 2 school having 3 classrooms with 5 students each in a classroom

//        int schools = 2;
//        int classrooms = 3;
//        int students_per_class = 5;
//        int[][][] a = new int[schools][classrooms][students_per_class];
//        for (int i = 0; i < schools; i++){
//            for(int j = 0; j < classrooms; j++){
//                for (int k = 0; k < students_per_class; k++){
//                    System.out.print("Enter the age of student " + (k + 1) + " from class " + (j + 1) + " in school " + (i + 1) + " : ");
//                    a[i][j][k] = scan.nextInt();
//                }
//                System.out.println("------------------------------------------------");
//            }
//            System.out.println("------------------------------------------------");
//        }
//        for (int i = 0; i < a.length; i++){
//            for(int j = 0; j < a[i].length; j++){
//                for (int k = 0; k < a[i][j].length; k++){
//                    System.out.println("The age of student " + (k + 1) + " from class " + (j + 1) + " in school " + (i + 1) + " is - " + a[i][j][k]);
//                }
//                System.out.println("------------------------------------------------");
//            }
//            System.out.println("------------------------------------------------");
//        }

        // Jagged Array
        /*
        - Creates an array to store the ages of students belonging to 2 classrooms where first classroom has 3 students and second has 5 students
        - 2D and 3D
        - Homogeneous
        - jagged
         */

        // Create an array to store the ages of students belonging to 2 classrooms, where first classroom has 3 students and second classroom have 5 students

//        int class_rooms = 2;
//        int students_in_firstClass = 3;
//        int students_in_secondClass = 5;
//
//        int[][] a = new int[class_rooms][];
//        a[0] = new int[students_in_firstClass];
//        a[1] = new int[students_in_secondClass];
//        for (int i = 0; i < a.length; i++){
//            for (int j = 0; j < a[i].length; j++){
//                System.out.print("Enter the age of student " + (j + 1) + " from class " + (i + 1) +" : ");
//                a[i][j] = scan.nextInt();
//            }
//            System.out.println("-----------------------------");
//        }
//        for (int i = 0; i < a.length; i++){
//            for (int j = 0; j < a[i].length; j++){
//                System.out.println("The age of student " + (j + 1) + " from class " + (i + 1) +" is: " + a[i][j]);
//            }
//            System.out.println("-----------------------------");
//        }

        // Create an array to store the ages of students belonging to 2 schools where, first school has 2 classrooms where first classroom has 3 students and second classroom has 5 students and second school contains 3 classrooms where, first classroom has 2 students, second classroom has 3 students and third classroom has 5 students
        /*
        school 1 -
            classroom 1 - 3
            classroom 2 - 5
        school 2 -
            classroom 1 - 2
            classroom 2 - 3
            classroom 3 - 5

         */

//        int schools = 2;
//        int school1_class_rooms = 2;
//        int school1_class1_students_in_firstClass = 3;
//        int school1_class2_students_in_secondClass = 5;
//
//        int school2_class_rooms = 3;
//        int school2_class1_students_in_firstClass = 2;
//        int school2_class2_students_in_secondClass = 3;
//        int school2_class3_students_in_secondClass = 5;
//
//        int[][][] a = new int[schools][][];
//        a[0] = new int[school1_class_rooms][];
//        a[1] = new int[school2_class_rooms][];
//        a[0][0] = new int[school1_class1_students_in_firstClass];
//        a[0][1] = new int[school1_class2_students_in_secondClass];
//        a[1][0] = new int[school2_class1_students_in_firstClass];
//        a[1][1] = new int[school2_class2_students_in_secondClass];
//        a[1][2] = new int[school2_class3_students_in_secondClass];
//        for (int i = 0; i < a.length; i++){
//            for(int j = 0; j < a[i].length; j++){
//                for (int k = 0; k < a[i][j].length; k++){
//                    System.out.print("Enter the age of student " + (k + 1) + " from class " + (j + 1) + " in school " + (i + 1) + " : ");
//                    a[i][j][k] = scan.nextInt();
//                }
//                System.out.println("------------------------------- -----------------");
//            }
//            System.out.println("------------------------------------------------");
//        }
//        for (int i = 0; i < a.length; i++){
//            for(int j = 0; j < a[i].length; j++){
//                for (int k = 0; k < a[i][j].length; k++){
//                    System.out.println("The age of student " + (k + 1) + " from class " + (j + 1) + " in school " + (i + 1) + " is - " + a[i][j][k]);
//                }
//                System.out.println("------------------------------------------------");
//            }
//            System.out.println("------------------------------------------------");
//        }
    }
}
