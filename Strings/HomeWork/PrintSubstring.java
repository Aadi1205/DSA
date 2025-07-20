package Strings.HomeWork;

public class PrintSubstring {
    public static void print(String str) {

        // for(int i=0; i<str.length(); i++) {
        //     for(int j=i; j<str.length(); j++) {
        //         for(int k=i; k<=j; k++) {
        //             System.out.print(str.charAt(k) + " ");
        //         }
        //         System.out.println();
        //     }
        // }

        for(int i=0; i<str.length(); i++) {
            for(int j=i+1; j<=str.length(); j++) {
                System.out.println(str.substring(i,j));
            }
        }
    }
    public static void main(String[] args) {
        print("abc");
    }
}
