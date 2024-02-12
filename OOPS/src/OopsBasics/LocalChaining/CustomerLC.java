package OopsBasics.LocalChaining;

public class CustomerLC {

    private int cID;
    private String cName;
    private long cNum;

    public CustomerLC() {
        cID = 1;
        cName = "Arun";
        cNum = 907108535;
    }

    public CustomerLC(int cID, String cName, long cNum) {
        this();
        this.cID = cID;
        this.cName = cName;
        this.cNum = cNum;
    }

    public int getID() {
        return cID;
    }

    public String getcName() {
        return cName;
    }

    public long getcNum() {
        return cNum;
    }

    public static void main(String[] args) {

        // calling parameterized constructor
        CustomerLC c2 = new CustomerLC(2, "varun", 908012773);
        System.out.println(c2.getID());
        System.out.println(c2.getcName());
        System.out.println(c2.getcNum());

        /*
        when we call the above CustomerLC method with parameterized constructor then it will go to the second constructor, the first line in that method is this() method, it is called. it will take control to the above constructor with zero parameterized constructor, then execute those lines(like assign all the defined values to the variables and control will come back to the constructor where it got called and will execute the lined of code by using parameters passed while obj creation.
         */

        /*
        within the class : if constructor belongs to the same class we use this() method;
        from base class : if the constructor belongs to parent class then we use super() method;
         */
    }
}
