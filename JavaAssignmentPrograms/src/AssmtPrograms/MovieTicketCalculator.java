package AssmtPrograms;

import java.util.Scanner;

public class MovieTicketCalculator {

    /*
    Write a Java program that calculates the price of a movie ticket based on the age of the customer and the time of the movie. Implement different pricing rules for children (under 12), adults (12-64), and seniors (65+), and consider matinee discounts.
     */

    int time = 2;
    static int price = 200;

    static float ticketPrice(int age, int time){
        if (age < 12){
            if (time == 2){
                return (price / 2) * 0.90f;
            } else {
                return price / 2;
            }
        } else if (age >= 12 && age <= 65){
            if (time == 2){
                return (price) * 0.90f;
            } else {
                return price;
            }
        }else if(age > 65) {
            if (time == 2){
                return (price / 1.5f) * 0.90f;
            } else {
                return price / 1.5f;
            }
        }else{
            return -1;
        }
    }

    public static void main(String[] args) {

        float price;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Age: ");
        int age = scan.nextInt();
        System.out.print("Enter the Time(11 or 2 or 6 or 9): ");
        int time = scan.nextInt();
        price = ticketPrice(age, time);
        System.out.println(price);
    }
}
