package AssmtPrograms;

import java.util.Scanner;

public class LoginCredentials {

    static final String userName = "user";
    static final String password = "password";
    static int maxLoginAttempts = 3;
    static int loginAttempts = 0;
    static boolean accountLocked = false;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while(true){
            if (accountLocked){
                System.out.println("Account has been Locked. Please contact support!");
                System.exit(0);
            }
            System.out.print("Enter user name: ");
            String username = scan.next();

            System.out.print("Enter password: ");
            String userPassword = scan.next();

            if ((username.equals(userName)) && (userPassword.equals(password))){
                System.out.println("Login Successful! ");
                System.exit(0);
            } else{
                loginAttempts++;
                if (loginAttempts >= maxLoginAttempts){
                    System.out.println("Maximum login attempts reached. Your account is now locked.");
                    accountLocked = true;
                } else{
                    System.out.println("Invalid Credentials! Try again.");
                }
            }
        }
    }

}
