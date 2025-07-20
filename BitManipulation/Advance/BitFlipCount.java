package BitManipulation.Advance;
// Count total bits required to convert A to B
public class BitFlipCount {
    public static int countBitsToFlip(int a, int b) {
        int xor = a ^ b;
        int count = 0;

        while (xor != 0) {
            count += (xor & 1);
            xor >>= 1;
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(countBitsToFlip(10, 20)); // Output: 4
    }
}

