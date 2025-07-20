package OOPS.HW;

public class Q1 {
    public static void main(String[] args) {
        Complex c = new Complex();
        c.sum(2,3,2,3);
        c.diff(2,3,3,4);
        c.mul(1,2,3,4);
    }
}

class Complex {
    void sum(int x1, int y1, int x2, int y2) {
        int real = x1 + x2;
        int img = y1 + y2;
        System.out.println("Sum is: " +real + " " + img + "i");
    }
    void diff(int x1, int y1, int x2, int y2) {
        int real = x1 - x2;
        int img = y1 - y2;
        System.out.println("difference is: " +real + " " + img + "i");
    }
    void mul(int x1, int y1, int x2, int y2) {
        int real = (x1 * x2) - (y1 * y2);
        int img = (x1 * y2) + (x2 * y1);
        System.out.println("Product is: " +real + " " + img + "i");
    }
}
