package OOPS.Practice;

public class Practice2 {
    public static void main(String[] args) {
        // class person can access name and weight only
        // class student can access name, weight and roll number
    }
}

class person {
    String name; 
    int weight;
}

class Student extends person {
    int rno;
    String schoolName;
}

// Which of hte following modifiers are not allowed in front of class
// A) public
// B) private
// C) protected
// D) default

// answer is B and C