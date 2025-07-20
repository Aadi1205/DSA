// very important we can print only vowel, number, letter , space, and dot using this function
package Strings;

public class PrintChar {
    public static void printLetters(String str) {
        for(int i=0; i<str.length(); i++) { 
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        printLetters("Aditya Suresh Bhavsar");
    }
}
