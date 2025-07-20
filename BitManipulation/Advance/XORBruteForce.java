package BitManipulation.Advance;

public class XORBruteForce {
    public static int xorUptoN(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result ^= i;  // XOR each number
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(xorUptoN(5));     // Output: 1
        System.out.println(xorUptoN(100));   // Output: 100 ^ ... ^ 1
    }
}

