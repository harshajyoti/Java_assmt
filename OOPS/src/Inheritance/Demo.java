package Inheritance;

class Demo1 {

    int a = 10;
    int b = 20;
}

class Demo2 extends Demo1 {

    void viewDetails(){
        System.out.println(a);
        System.out.println(b);
    }

    public Demo2(int x, int y){
        a = x;
        b = y;
    }
}
public class Demo {
    public static void main(String[] args) {
        Demo2 d2 = new Demo2(20, 40);
        d2.viewDetails();
    }
}
