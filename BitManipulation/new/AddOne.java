package BitManipulation.HomeWork;

public class AddOne {
    // ~n = -(n+1) --> -~n = (n+1) 
    // this is based on 2's complement rule: 
    //~n is 2's complement of n
    public static int addOne(int n) {
        return -~n;
    }

    public static int addOne2(int n) {
        int m = 1;

        // Flip all the set bits starting from right
        while ((n & m) != 0) {
            n = n ^ m;
            m <<= 1;
        }

        // Flip the first 0 bit found
        n = n ^ m;
        return n;
    }
    public static void main(String[] args) {
        System.out.println(addOne(5));  // Output: 6
        System.out.println(addOne(7));  // Output: 8
    }
}

