package com.company;

public class Operators {

    public static void main(String[] args) {

        // Arithmetic operators
        int x = 10;
        int y = 20;

//        System.out.println(x + y);
//        System.out.println(x - y);
//        System.out.println(x * y);
//        System.out.println(y / x);
//        System.out.println(x % y);

        // Assignment operators
        int a, b, c;

        a = 10;
//        a = 10; // Assigning a value to the variable a using '=' operator
//        System.out.println(a);
//        a += 1; // Adding 1 to variable a
//        System.out.println(a);
//        a -= 1; // Subtracting 1 from a
//        System.out.println(a);
//        a *= 4; // Multiplying a by 4
//        System.out.println(a);
//        a /= 2; // Dividing a by 2
//        System.out.println(a);
//        a %= 1; // Check the reminder, when a is divided by 2
//        System.out.println(a);

        // Comparison operator
        b = 20;
        c = 40;

//        System.out.println(b == c);
//        System.out.println(b != c);
//        System.out.println(b < c);
//        System.out.println(b > c);
//        System.out.println(b <= c);
//        System.out.println(b >= c);

        // Logical operators (&&, ||, !, )

//        System.out.println((a < b) && (c > b));
//        System.out.println((c > b) || (a > b));
//        System.out.println(!(a > b));
//
//        boolean flag = true;
//        boolean flag1 = !flag;
//        System.out.println((flag1));

        // Bitwise operators
        
        x = 5;
        y = 3;
        System.out.println(x & y); // Bitwise and operator
        System.out.println(x | y); // Bitwise or operator
        System.out.println(x ^ y); // Bitwise XOR operator
        System.out.println(~y); // Bitwise NOT operator

        System.out.println(x << y); // Bitwise Left Shift operator
        System.out.println(x << y); // Bitwise Right Shift operator

        // Increment and Decrement Operators

        x = 10;
        y = x++;
        int z = ++x;
        System.out.println(y);
        System.out.println(x);
        System.out.println(z);
    }
}
