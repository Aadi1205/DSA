package OOPS.polymorphism;

public class MethodOverriding {
    public static void main(String[] args) {
        Deer d = new Deer(); 
        d.eat(); // Output: Deer is eating grass
        // it calls eat() from child class Deer
    }
}
 
class Animal {
    void eat() {
        System.out.println("eats anything");
    }
}

class Deer extends Animal {
    void eat() {
        System.out.println("Eats grass");
    }
}