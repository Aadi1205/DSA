package BitManipulation.HomeWork;
public class ToggleBit {
    public static int toggleIthBit(int n, int i) {
        return n ^ (1 << i);
    }

    public static void main(String[] args) {
        int n = 13;  // Binary: 1101
        int i = 1;   // Toggle 1st bit (0-based from right)
        
        int result = toggleIthBit(n, i);
        System.out.println("Before: " + Integer.toBinaryString(n));
        System.out.println("After : " + Integer.toBinaryString(result));
        System.out.println("Result: " + result);
    }
}
