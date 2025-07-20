package BitManipulation.Advance;

public class UniqueElement {
    public static int findUnique(int[] arr) {
        int xor = 0;
        //taking xor of all element
        for(int num : arr) {
            xor ^= num;
        }
        return xor;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,6,3,4,2,1,4,5,5};
        System.out.println(findUnique(arr));
    }
}

// when xor all element pairs cancel out (a ^ a = 0) 
// only one element left which is unique
