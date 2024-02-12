package Abstraction;

abstract class Bird{
    abstract void fly();
    abstract void eat();
}

abstract class Eagle extends Bird{
    void fly(){
        System.out.println("eagle is flying");
    }
}

class SerpantEagle extends Eagle{
    void eat(){
        System.out.println("serpant eagle is eating");
    }
}

class GoldenEagle extends Eagle{
    void eat(){
        System.out.println("golden eagle is eating");
    }
}

class Birds1{
    static void permit(Bird ref){
        ref.eat();
        ref.fly();
    }
}

class AbstractionDemo{
    public static void main(String[] args) {
        SerpantEagle se = new SerpantEagle();
        GoldenEagle ge = new GoldenEagle();

        Birds1.permit(se);
        Birds1.permit((ge));
    }
}