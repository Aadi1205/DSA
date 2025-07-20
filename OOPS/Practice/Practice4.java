package OOPS.Practice;

public class Practice4 {
    public static void main(String[] args) {
        Vehicle c = new Car();
        c.print();
        // c.print1(); // this gives an error because Car class does not have a method called print1()

        Vehicle v = new Vehicle();
        v.print(); // this works because Vehicle class has a method called print()
    }
}

class Vehicle {
    void print() {
        System.out.println("Vehicle");
    }
}

class Car extends Vehicle {
    void print1() {
        System.out.println("Car");
    }
}
