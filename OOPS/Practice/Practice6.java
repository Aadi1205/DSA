// which line has error
package OOPS.Practice;

public class Practice6 {
    public static void main(String[] args) {
        Test t = new Test();
        t.set_marks(98);   // Line 1
        System.out.println(Test.marks); // Line 2
    }
}

class Test {
     static int marks;
     void set_marks(int marks) {
        this.marks = marks;   // Line 3
     }
}

// answer: no line has error