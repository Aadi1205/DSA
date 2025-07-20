package OOPS;

public class CopyConc {
    public static void main(String[] args) {
        // Student constructor
        Student s1 = new Student();
        s1.name = "Aditya";
        s1.roll = 243;
        s1.password = "abc";
    
        s1.marks[0] = 100; // assigning marks for s1
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Student s2 = new Student(s1); //copy s1 in s2
        s2.password = "xyz";

        // after coping changing marks 
        s1.marks[2] = 100;
        //but changes made after coping are effecting both s1 and s2 because of reference of array is pass
        for(int i=0; i<3; i++) {
            System.out.println(s2.marks[i]);
        }

        // to solve this problem we need to learn shallow and deep copy
        // Shallow copy copies object and shares same inner object references
        // Deep copy copies object and also creates new inner objects

    }
}


class Student {
    String name;
    int roll;
    String password;
    int marks[];

    // shallow copy constructor
    // Student(Student s1) { 
    //     marks = new int[3]; // reference of array is pass
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.marks = s1.marks;  // reference of array is pass
    // }


    // deep copy constructor
    Student(Student s1) { // parameter Student s1
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for(int i=0; i<marks.length; i++) { // new array is created
            this.marks[i] = s1.marks[i];
        }
    }



    Student() {
        marks = new int[3];
        System.out.println("Constructor is called");
    }
}

