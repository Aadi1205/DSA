package OOPS.inheritance;

class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();   // inherited from Animal
        dog.bark();

        Cat cat = new Cat();
        cat.eat();   // inherited from Animal
        cat.meow();
    }
}

