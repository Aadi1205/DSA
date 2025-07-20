package OOPS;

class Student {
    String name;
    int age;
    int[] marks;

    // Parameterized constructor
    Student(String name, int age, int[] marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    // Lazy copy on modify
    void updateMark(int index, int newMark) {
        // Make a copy only when modifying
        marks = marks.clone(); // deep copy
        marks[index] = newMark;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.print("Marks: ");
        for (int m : marks) {
            System.out.print(m + " ");
        }
        System.out.println("\n");
    }
}

public class LazyCons {
    public static void main(String[] args) {
        int[] commonMarks = {80, 85, 90};

        Student s1 = new Student("Adi", 20, commonMarks);
        Student s2 = new Student("Raj", 21, commonMarks);

        s2.updateMark(1, 95); // Lazy copy happens here

        s1.display();
        s2.display();
    }
}

