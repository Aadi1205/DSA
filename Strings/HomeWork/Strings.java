package Strings.HomeWork;

public class Strings {
    public static void main(String[] args) {
        String str = "Aditya";
        String str2 = "Bhavsar";
        String str3 = "Aditya";

        System.out.println(str.equals(str2) + " " + str.equals(str3)); // .equals() method is used to compare two strings

        String str4 = "Apna College".replace("l" , ""); // replace() method is used to compare two strings
        System.out.println("After replacement: " + str4); // replace method replace both 'l';

    }
    
}
