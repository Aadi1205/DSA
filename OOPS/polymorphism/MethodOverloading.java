package OOPS.polymorphism;

public class MethodOverloading {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.sum(10, 20)); // Output: 30
        System.out.println(calc.sum(4.5f, 6.7f)); // Output: 11.2f // f is necessary for float values
        System.out.println(calc.sum(5,5,5)); // Output: 15
    }
}

class Calculator {
    int sum(int a, int b) {
         return a+b;
    }
    float sum(float a, float b) {
        return a + b;
    }
    int sum(int a, int b, int c) {
        return a + b + c;
    }
}
