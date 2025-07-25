package OOPS.polymorphism;

public class SuperKeyword {
    public static void main(String[] args) {
        Horse h = new Horse();
        System.out.println(h.color);
    }
}

class Animal {
    String color;
    Animal() {
        System.out.println("Animal constructor is called");
    }
}

class Horse extends Animal {
    Horse() {
// using super() we can call Animal constructor java by default call the super() keyword for constructor not necessary to write
        super(); 

        super.color = "Brown";
        System.out.println("Horse constructor is called");
    }
}