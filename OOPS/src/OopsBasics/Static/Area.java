package OopsBasics.Static;

import java.util.Scanner;

public class Area {

    // Calculate area of circle

    private float radius;
    private float area;
    static float pi;

    /*
    for every program if we find any common variable that is used by objects then we must declare that variable as static.
     */

    // static - one copy of var is created at static block, static block is used to initialize the static variables
    static {
        pi = 3.142f;
    }

    public void acceptInput(){
        Scanner scan = new Scanner(System.in);
        radius = scan.nextFloat();
    }

    public void calcArea(){
        area = pi * radius * radius;
    }

    public void displayArea(){
        System.out.println(area);
    }

    public static void main(String[] args) {
        Area a = new Area();
        a.acceptInput();
        a.calcArea();
        a.displayArea();
    }
}
