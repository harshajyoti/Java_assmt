package com.basics;

public class While_loops {

    public static void main(String[] args) {
        // While loop
//        int i = 0;
//        while (i < 5){
//            System.out.println(i);
//            i += 1;
//        }

//        while(true){
//            System.out.println("while");
//        }

//        boolean flag1 = true;
//        while(flag1){
//            System.out.println("inside loop");
//            flag1 = false;
//        }

        // wap to calculate sum of nums from 1 to 10
//        int a = 10;
//        int sum = 0;
//        int i = 1;
//        while(i <= a){
//            sum += i;
//            System.out.println(i + " " + sum);
//            i += 1;
//        }
//        System.out.println(sum);

        // Fibonacci series using while
        int first = 0;
        int second = 1;
        int a = 10;
        int i = 1;
        while (i <= a){
            System.out.println(first);
            int c = first + second;
            first = second;
            second = c;
            i += 1;
        }

    }

}

