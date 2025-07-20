public class HollowRectangle {

    public static void main(String[] args) {

        int n = 4;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n + 1; j++) {

                if (i == 1 || i == n || j == 1 || j == n + 1) {
                    System.out.print("*"); // Use print instead of println
                } else {
                    System.out.print(" "); // Print space for the hollow part
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
