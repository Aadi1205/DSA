package BitManipulation.Advance;

public class UniqueInThrice {
    public static int findUnique(int[] arr) {
        int result = 0;

        // Check every bit position (0 to 31 for int)
        for (int i = 0; i < 32; i++) {
            int sum = 0;
            int bitMask = 1 << i;

            for (int num : arr) {
                if ((num & bitMask) != 0) {
                    sum++;
                }
            }

            // If bit count is not multiple of 3, set that bit in result
            if (sum % 3 != 0) {
                result |= bitMask;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 5, 3, 5, 3, 9};
        System.out.println("Unique element: " + findUnique(arr));  // Output: 9
    }
}
//We pick only those positions where `sum % 3 ≠ 0` → and build the result using OR