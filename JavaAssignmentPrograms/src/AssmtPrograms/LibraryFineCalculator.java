package AssmtPrograms;
import java.util.Scanner;

public class LibraryFineCalculator {

    /*
    Design a Java program that calculates the fine for overdue library books. The program should take the number of days a book is overdue as input and apply different fine rates based on predefined rules (e.g., first 7 days free, after that $0.50 per day).
     */

    private static double calculateFine(int daysOverdue) {
        if (daysOverdue <= 7) {
            return 0;
        } else {
            return (daysOverdue - 7) * 2.5;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of days the book is overdue: ");
        int daysOverdue = scan.nextInt();

        double fine = calculateFine(daysOverdue);

        if (fine == 0) {
            System.out.println("No fine for the first 7 days.");
        } else {
            System.out.println("Fine for overdue book: Rs " + fine);
        }
    }
}

