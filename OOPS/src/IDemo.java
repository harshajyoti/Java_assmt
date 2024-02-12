public interface IDemo {
    public void demo();
    public void demo1();

    default void defaultmethod(){
        int a=10,b=10;
        int res = a+b;
        System.out.println(res);
    }
}
interface IDemo1{
    public void demo2();
}
class C implements IDemo,IDemo1 {


    public void demo() {
        System.out.println("demo method");
    }


    public void demo1() {
        System.out.println("demo1 method");
    }

    @Override
    public void demo2() {
        System.out.println("IDemo1 demo method");
    }
}

class Main1{
    public static void main(String[] args) {
        C c = new C();
        c.defaultmethod();
        c.demo();
        c.demo1();
    }
}

