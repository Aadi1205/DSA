// What is the output of the following program? TOUGH
package OOPS.HW;

public class Q4 extends car{
    {
        System.out.print("4");
    }

    public Q4() {
        super("blue");
        System.out.println("5");
    }
    public static void main(String[] args) {
        new Q4();
    } 
}

abstract class car {
    static {
        System.out.print("1");
    }

    public car(String name) {
        super();
        System.out.print("2");
    }

    {
        System.out.print("3");
    }
}

// Output: 13245

//Static blocks (Superclass → Subclass) → runs once when class loads

//Instance blocks & variables (Superclass → Subclass) → runs before constructor

//Constructors (Superclass → Subclass)