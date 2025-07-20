package OOPS.Interface;

public class MultipleInheritance {
    public static void main(String[] args) {
        Bear b = new Bear();
        b.eatHerbs();
        b.eatMeat();
    }
}

interface Herbivore {
    void eatHerbs();
}

interface Carnivore {
    void eatMeat();
}

class Bear implements Herbivore, Carnivore {
    public void eatHerbs() {
        System.out.println("Herbivorous eats herbs");
    }
    public void eatMeat() {
        System.out.println("Carnivorous eats meat");
    }
}