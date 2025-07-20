import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 4;

        // ternary operator to check even/odd
        String abc = ((number % 2 == 0)) ? "Even" : "Odd";
        System.out.println(abc);  // Output: Even

        // simple boolean comparison
        boolean larger = (5 > 3);
        System.out.println(larger);  // Output: true

        // ternary operator to get the larger number
        int pqr = (5 > 3) ? 5 : 3;
        System.out.println(pqr);  // Output: 5

        sc.close();
    }
}
