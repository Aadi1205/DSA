// -----------------------------------Strings are IMMUTABLE---------------------------------------------- 
// Strings are immutable, meaning that once a string is created, it cannot be changed.
// If you try to change a string, you will actually create a new string.
package Strings;
import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        // Concatination of string
        String str = "Hello"; // Declare a string variable and assign it a value
        String str2 = new String(", World!"); // Declare a string variable and assign it a value using the String constructor
        System.out.println("Concatination of Two Strings: " + str + str2); // Output: Concatination of Two Strings: Hello,
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter name:");
        String name = sc.nextLine(); // Line => to read multiple words/lines
        System.out.println(name);

        // length() function
        String fullName = "Aditya Bhavsar";
        System.out.println("Aditya Bhavsar: " + fullName.length());

        // charAt() function used to find the character at the specified index
        System.out.println(fullName.charAt(0));
        sc.close();
    }
}
