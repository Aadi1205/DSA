package OOPS;

public class OOPS {
    public static void main(String[] args) {
        Pen p1 = new Pen(); // Creating an object of Pen class
        p1.setColor("Red");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());

    }
}

class Pen {
    private String color;
    private int tip;

    String getColor() {
        return this.color;
    }

int getTip() {
    return this.tip;
}

    void setColor(String color) {
        this.color = color;

    }
    void setTip(int tip) {
        this.tip = tip;
    }
}

class Student {
    String name;
    int age;
    float percentage;

    void calcPercentage(int phy, int chem, int maths) {
        percentage = (phy + chem + maths) / 3.0f;
    }
}

