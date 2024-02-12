package Encapsulation;

public class BankCustomer {

    // Encapsulation

    /*
    - process of wrapping code and data together into a sing unit.
    - providing security to the data members of the class by declaring it as private.

    - using setters and getters we can achieve, java has its own setters and getters
    - setters name should be same name as class name.
    - call the constructor while creating the object.
     */

    private int balance;

    public void setBalance(int bal){
        if (bal > 0){
            balance = bal;
        } else {
            System.out.println("invalid amount");
            System.exit(0);
        }
    }

    public void getBalance(){
        System.out.println(balance);
    }

    public static void main(String[] args) {
        BankCustomer c1 = new BankCustomer();
        c1.setBalance(1000);
        c1.getBalance();

        BankCustomer c2 = new BankCustomer();
        c2.setBalance(-1000);
        c2.getBalance();

    }
}
