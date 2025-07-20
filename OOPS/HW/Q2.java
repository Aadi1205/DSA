//What is the output of the following program?
package OOPS.HW;

public class Q2 extends Car {
    @Override
    public final String drive() {
        return "Driving electric car";
    }
    public static void main(String[] args) {
        final Car car = new Q2();
        System.out.print(car.drive());
    }
}

class Automoblie {
    private String drive() {
        return "Driving vehicle";
    }
}

class Car extends Automoblie {
    protected String drive() {
        return "Driving car";
    }
}

//output is: Driving Electric car

