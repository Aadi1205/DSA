package OOPS;

public class ParameterizedCons {
    public static void main(String[] args) {
        Student s1 = new Student(); // no arguments passed
        s1.display();
    }
}
class Student {
    String name;
    int age;

    // Non-parameterized constructor
    Student() {
        name = "Adi";
        age = 18;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}