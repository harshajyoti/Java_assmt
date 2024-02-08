package com.string;

import java.util.Locale;
import java.util.StringTokenizer;

public class Strings_basics {
    public static void main(String[] args) {

        // Different ways to create strings

//        String s = new String("hello world");
//        System.out.println(s);
//
//        String a = "Java is a boring language";
//        System.out.println(a);
//
//        char[] c = {'J', 'A', 'V', 'A'};
//        String sc = new String(c);
//        System.out.println(sc);

        // Different ways to compare strings

        /*
        - To compare references - '=='
        - To compare values - equals()
        - To compare values char by char - compareTo()
        - ignoring case - equalsIgnoreCase()
         */

//        String s1 = new String("Java");
//        String s2 = new String("Java");
//        if (s1 == s2){
//            System.out.println("ref are equal");
//        }
//        else {
//            System.out.println("ref are unequal");
//        }
//        if (s1.equals(s2)){
//            System.out.println("value are equal"); true
//        }
//        else{
//            System.out.println("value are unequal");
//        }

        /*
        - Strings created by using new keyword are stored in non-constant pool (allow duplicate)
        - String created without using new key are stored in constant pool (won't allow duplicates)
         */

//        String s1 = "Java";
//        String s2 = "Java";
//        if (s1 == s2){
//            System.out.println("ref are equal"); // true
//        }
//        else {
//            System.out.println("ref are unequal");
//        }
//        if (s1.equals(s2)){
//            System.out.println("value are equal"); // true
//        }
//        else{
//            System.out.println("value are unequal");
//        }

//        String s1 = "Java";
//        String s2 = new String("Java");
//        if (s1 == s2){
//            System.out.println("ref are equal");
//        }
//        else {
//            System.out.println("ref are unequal"); // true
//        }
//        if (s1.equals(s2)){
//            System.out.println("value are equal"); // true
//        }
//        else{
//            System.out.println("value are unequal");
//        }

//        String s1 = "JAVA";
//        String s2 = "java";
//        System.out.println(s1.equals(s2)); // False
//        System.out.println(s1.equalsIgnoreCase(s2)); // true

        // compareTo()
//        String s1 = "SACHIN";
//        String s2 = "SAVRAM";
//        System.out.println(s1.compareTo(s2)); // -19

//        String s1 = "SACHIN";
//        String s2 = "SACHIN";
//        System.out.println(s1.compareTo(s2)); // 0

//        String s1 = "SACHIN";
//        String s2 = "SAVRAM";
//        System.out.println(s2.compareTo(s1)); // 19

        // String built-in methods
//        String s1 = "Harsha";
//        String s2 = "Pavan";
//        System.out.println(s1.charAt(1)); // a
//        System.out.println(s1.compareTo(s2)); // -8
//        System.out.println(s1.equals(s2)); // false
//        System.out.println(s1.equalsIgnoreCase(s2)); // false
//        System.out.println(s1.concat(s2)); // HarshaPavan
//        System.out.println(s1.toUpperCase()); // Harsha
//        System.out.println(s1.toLowerCase()); // harsha
//        System.out.println(s1.indexOf('a')); // 1
//        System.out.println(s1.lastIndexOf('a')); // 5
//        System.out.println(s1.startsWith("H")); // true
//        System.out.println(s1.endsWith("a")); // true
//        System.out.println(s1.contains("rsh")); // true
//        System.out.println(s1.substring(2)); // rsha
//        System.out.println(s1.substring(2, 5)); // rsh

        // Accessing characters in string using charAt() method
//        String s = new String("Harsha");
//        for (int i = 0; i < s.length(); i++){
//            System.out.println(s.charAt(i));
//        }

        // Mutable strings
        /*
        - String Buffer
        - String Builder
        In Java, both StringBuffer and StringBuilder are mutable classes that can be used to perform operations on strings.
         */

        // String Buffer
//        StringBuffer s = new StringBuffer(); // - New string buffer is created with the length of 16 default
//        System.out.println(s.capacity());
//        s.append("harsha");
//        System.out.println(s);
//        System.out.println(s.append("jyoti"));
//        System.out.println(s.capacity());
//        System.out.println(s.append("how are you"));
//        System.out.println(s.capacity());
//        s.trimToSize();
//        System.out.println(s.capacity());
//        System.out.println(s);
//
//        // To delete in between some characters
//        s.delete(11, s.capacity());
//        System.out.println(s);

        // String Tokenizer
        // used to break a string into tokens
//        String s = "Java Python Js Rust";
//        StringTokenizer st = new StringTokenizer(s);
//        while(st.hasMoreTokens()){
//            System.out.println(st.nextToken());
//        }

        // can separate based upon a particular character
//        String s = "Java Python Js Rust";
//        StringTokenizer st = new StringTokenizer(s, " ");
//        while(st.hasMoreTokens()){
//            System.out.println(st.nextToken());
//        }

    }
}
