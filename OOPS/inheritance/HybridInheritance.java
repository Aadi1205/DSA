package OOPS.inheritance;

interface Vehicle {
    void move();
}

interface Machine {
    void start();
}

class Car implements Vehicle, Machine {
    public void move() {
        System.out.println("Car moves on road");
    }

    public void start() {
        System.out.println("Car engine starts");
    }
}

public class HybridInheritance {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start();  // from Machine interface
        myCar.move();   // from Vehicle interface
    }
}
