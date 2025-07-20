// what would be the output of the following code?
package OOPS.Practice;

public class Practice7 {
    public static void main(String[] args) {
        Change ch = new Change();
        ch.changeB();
        System.out.println(Change.a + Change.b);  // output: 40;
    }
}

class Change {
    static int a = 10;
    static int b;
    static void changeB() {
        b = a * 3;
    }
}