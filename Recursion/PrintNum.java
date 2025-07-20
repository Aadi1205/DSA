package Recursion;

public class PrintNum { 
    public static void PrintDec(int n) { // print numbers in a decreasing order
        if(n == 1) {
            System.out.println(n);
            return;
        }
        System.out.print(n + " " );
        PrintDec(n-1);
    }

    public static void printInc(int n) { //print numbers in an increasing order
        if(n == 1) {
            System.out.print(n + " " );
            return;
        }
        printInc(n-1);
        System.out.print(n + " ");
    }
    public static void main(String[] args) {
        PrintDec(10);
        printInc(10);
    }
}
