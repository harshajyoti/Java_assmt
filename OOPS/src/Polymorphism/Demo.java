package Polymorphism;

// Polymorphism - An object showing different behaviours at different stages of life cycle.

class Plane{
    void takeOff(){
        System.out.println("plane is taking off");
    }void fly(){
        System.out.println("plane is flying");
    }void land(){
        System.out.println("plane is landing");
    }
}

class CargoPlane extends Plane {
    void takeOff(){
        System.out.println("cargo plane is taking off");
    }void fly(){
        System.out.println("cargo plane is flying");
    }void land(){
        System.out.println("cargo plane is landing");
    }

}

class PassengerPlane extends Plane {
    void takeOff(){
        System.out.println("passenger plane is taking off");
    }void fly(){
        System.out.println("passenger plane is flying");
    }void land(){
        System.out.println("passenger plane is landing");
    }
}

class FighterPlane extends Plane {
    void takeOff(){
        System.out.println("fighter plane is taking off");
    }void fly(){
        System.out.println("fighter plane is flying");
    }void land(){
        System.out.println("fighter plane is landing");
    }
}

class Airport{
    static void permit(Plane ref){
        ref.takeOff();
        ref.fly();
        ref.land();
    }
}

public class Demo {
    public static void main(String[] args) {
        CargoPlane cp = new CargoPlane();
        PassengerPlane pp = new PassengerPlane();
        FighterPlane fp = new FighterPlane();

        Airport.permit(cp);
        Airport.permit(pp);
        Airport.permit(fp);
    }
}
