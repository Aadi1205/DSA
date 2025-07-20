package BitManipulation.Advance;

public class TwoUniqueElements {
    public static void findTwoUniques(int[] arr) {
        int xor = 0;
        for(int num : arr) {
            xor ^= num;
        }
        int rightmostSetBit = xor & -xor;

        int a=0, b=0;
        for(int num : arr) {
            if((num & rightmostSetBit) == 0 ) {
                a ^= num;
            }
            else {
                b ^= num;
            }
        }

        System.out.println("Two unique elements are: " + a + " and " + b);
    }
    public static void main(String[] args) {
        int[] arr = {2, 4, 3, 6, 3, 2, 5, 5};
        findTwoUniques(arr);  // Output: 4 and 6
    }
}
// When XOR all elements, pairs cancel out (a ^ a = 0)
// We're left with xor = num1 ^ num2 (both unique)
// Find rightmost set bit (diffBit) where num1 and num2 differ
// Use diffBit to divide array into 2 groups and XOR separately to get both unique numbers
