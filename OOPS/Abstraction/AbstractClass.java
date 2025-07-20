package OOPS.Abstraction;

public class AbstractClass {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();
        h.changeColor();
        System.out.println(h.color);

        Chicken c = new Chicken();
        c.eat();
        c.walk();
        System.out.println(c.color);

        // Animal a = new Animal();  // we can't create object of abstract class
    }
}
abstract class Animal {

    String color;

    Animal() {
        color = "Brown";
    }

    void eat() {
        System.out.println("Eating");   
    }

    abstract void walk();
}

class Horse extends Animal {
    void changeColor() {
        color = "Dark Brown";
    }

    void walk() {
        System.out.println("Walks on 4 legs");
    }
}

class Chicken extends Animal {
    Chicken() {
        color = "Yellow";
    }
    void walk() {
        System.out.println("Walks on 2 legs");
    }
}