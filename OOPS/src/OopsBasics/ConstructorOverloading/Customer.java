package OopsBasics.ConstructorOverloading;

public class Customer {

    // Having multiple constructor with same name within a class is called constructor overloading.
    // Name is same but different parameters.

    /*
    new customer(); - zero parameterized constructor
    new customer(001, "arun", 9071038191); - parameterized constructor
     */

    private int cID;
    private String cName;
    private long cNum;

    public Customer(){
        cID = 001;
        cName = "Arun";
        cNum = 907108535;
    }

    public Customer(int cID, String cName, long cNum){
        this.cID = cID;
        this.cName = "Arun";
        this.cNum = 907108535;
    }

    public int getID(){
        return cID;
    }

    public String getcName(){
        return cName;
    }

    public long getcNum(){
        return cNum;
    }

    public static void main(String[] args) {

        // calling zero parameterized constructor
        Customer c1 = new Customer();
        System.out.println(c1.getID());
        System.out.println(c1.getcName());
        System.out.println(c1.getcNum());

        // calling parameterized constructor
        Customer c2 = new Customer(002, "varun", 908012773);
        System.out.println(c2.getID());
        System.out.println(c2.getcName());
        System.out.println(c2.getcNum());

    }
}
