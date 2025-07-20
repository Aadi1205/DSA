package OOPS;

class Demo {
    // Non-parameterized constructor
    Demo() {
        System.out.println("Constructor is called");
    }
    
    void show() {
        System.out.println("Hello from show method");
    }
}

public class Constructor {
    public static void main(String[] args) {
        Demo obj = new Demo(); // Constructor is called
        obj.show();            // Hello from show method
    }
}
