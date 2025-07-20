package Recursion;

public class Fibonacci {
    public static int fibonacci(int n) {
        if(n == 0 || n == 1) {
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
    public static void main(String[] args) {
        System.out.println(fibonacci(5));
        // print fibonacci sequence
        for(int i=0; i<10; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
