package OOPS.Practice;

public class Practice3 { // 
    public static void main(String[] args) {
        Vehicle c = new Car();
        c.print(); //output: Derived class(Car)

        Vehicle v = new Vehicle();
        v.print(); //output: Base class(Vehicle)
    }
}

class Vehicle {
    void print() {
        System.out.println("Base class(Vehicle)");
    }
}

class Car extends Vehicle { // inheritance car class inherit the properties of class Vehicle
    void print() { // method overriding (polymorphism) - method with same name but different implementation
        System.out.println("Derived class(Car)");
    }
}