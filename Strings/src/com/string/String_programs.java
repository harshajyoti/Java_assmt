package com.string;

import jdk.management.resource.internal.inst.FileOutputStreamRMHooks;

public class String_programs {

    // Count the number of spaces
    static int spaceCount(String s){
        int count = 0;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == ' '){
                count ++;
            }
        }
        return count;
    }

    static int countVowels(String s){
        int count = 0;
        System.out.println(s);
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (c == 'a' | c == 'e' |c == 'i' |c == 'o' |c == 'u' |c == 'A' |c == 'E' |c == 'I' |c == 'O' |c == 'U'){
                count ++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        // 1. Count the number of spaces
//        String s = "hello how are you";
//        System.out.println(spaceCount(s));
//
//        // Count the vowels in a given string
//        System.out.println(countVowels(s));

        // 2. get the index of a particular character
//        String c = "Harsha";
//        char a = 'a';
//        for (int i = 0; i< c.length(); i++){
////            System.out.println(c.charAt(i));
//            if(c.charAt(i) == a){
//                System.out.println(i);
//            }
//        }

        // 3. count the occurrence of a given character
//        String c = "Harsha";
//        char a = 'a';
//        int count = 0;
//        for (int i = 0; i< c.length(); i++){
////            System.out.println(c.charAt(i));
//            if(c.charAt(i) == a){
//                count++;
//            }
//        }
//        System.out.println("character " + a +" occurred " + count + " times!");

        // 4. String reverse

//        String s = "harsha";
//        String rev = "";
//        for (int i = s.length() - 1; i >= 0; i--){
//            rev += s.charAt(i);
//        }
//        System.out.println("reverse of " + s + " is: " + rev);

        // 5. Print the number of words in a given string

//        String s = "";
//        int count = 0;
//        if (s.length() > 0){
//            for (int i = 0; i < s.length(); i++){
//                if (s.charAt(i) == ' '){
//                    count++;
//                }
//            }
//            System.out.println("Number of words in " + "'" + s + "'" + " is: " + (count + 1));
//        } else{
//            System.out.println("No words in the given String!!");
//        }

        // 6. Palindrome

//        String s = "gadag";
//        boolean flag = false;
//        for (int i = 0; i < s.length(); i++){
//            if (s.charAt(i) == s.charAt(s.length() - i - 1)){
//                flag = true;
//            }
//        }
//        if (flag){
//            System.out.println("yes");
//        } else{
//            System.out.println("no");
//        }

        // 7. Print substring of length 3

//        int n = 3;
//        String s = "hello";
//        for (int i = 0; i <= (s.length() - n); i++){
//            for (int j = i; j <= (i + n) - 1; j++){
//                System.out.print(s.charAt(j));
//            }
//            System.out.println();
//        }

        // 8. print the length of the string

//        String s = "harsha";
//        int count = 0;
//        for (int i = 0; i < s.length(); i++){
//            count++;
//        }
//        System.out.println(count);


    }
}
