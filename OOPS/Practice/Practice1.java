package OOPS.Practice;

public class Practice1 {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Adi";
        System.out.println(s.name);  // how to access the variable name of the class Student
    }
}

class Student {
     String name; 
     int marks;
}

