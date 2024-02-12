package Inheritance;

class Plane{
    void takeOff(){
        System.out.println("plane is taking off");
    }void fly(){
        System.out.println("plane is flying");
    }void land(){
        System.out.println("plane is landing");
    }
}

class CargoPlane extends Plane{
    void takeOff(){
        System.out.println("cargo plane is taking off");
    }void fly(){
        System.out.println("cargo plane is flying");
    }void land(){
        System.out.println("cargo plane is landing");
    }

}

class PassengerPlane extends Plane{
    void takeOff(){
        System.out.println("passenger plane is taking off");
    }void fly(){
        System.out.println("passenger plane is flying");
    }void land(){
        System.out.println("passenger plane is landing");
    }
}

class FighterPlane extends Plane{
    void takeOff(){
        System.out.println("fighter plane is taking off");
    }void fly(){
        System.out.println("fighter plane is flying");
    }void land(){
        System.out.println("fighter plane is landing");
    }
}

public class Aircraft {
    public static void main(String[] args) {
        CargoPlane cp = new CargoPlane();
        PassengerPlane pp = new PassengerPlane();
        FighterPlane fp = new FighterPlane();

        cp.takeOff();
        cp.fly();
        cp.land();

        pp.takeOff();
        pp.fly();
        pp.land();

        fp.takeOff();
        fp.fly();
        fp.land();
    }
}
