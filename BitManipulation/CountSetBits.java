package BitManipulation;
// Count set bits in a number --> Number of one's in binary representation of a number
public class CountSetBits { //TC: O(log n) : to represent n in bin. format we require log(n) bits
    public static int countSetBits(int n) {
        int count = 0;
        while(n > 0) {
            if((n & 1) != 0) { // check our LSB
                count++;
            }
            n = n >> 1; // right shift by 1
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countSetBits(15));
        System.out.println(countSetBits(16));
    } 
}
