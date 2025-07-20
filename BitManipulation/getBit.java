package BitManipulation;

public class getBit { 
    // get ith bit of a number
    public static int getIthBit(int n, int i) { //n=number, i=target
        if((n & (1<<i)) == 0) { // (1<<i) removes all bits at right side of ith bit 
            return 0;
        }
        else {
            return 1;
        }
    }
    //set ith bit to 1
    public static int setIthBit(int n, int i) {
        int bitMask = 1<<i; //finding  ith position
        return n | bitMask; //set ith bit to 1 using OR operator
    }

    //clear ith bit
    public static int clearIthBit(int n, int i) { //n=number, i=target
        int bitMask = ~(1<<i); //finding  ith position and inverting it
        return n & bitMask; //clear ith bit using AND operator
    }

    //update ith bit
    public static int updateIthBit(int n, int i, int newBit) {
        // if(newBit == 0) {
        //     return clearIthBit(n,i);
        // }
        // else {
        //     return setIthBit(n,i);
        // }

         n = clearIthBit(n, i);
        int bitMask = newBit << i;
        return n | bitMask;
       
    }

    public static int clearIBit(int n, int i) {
        int BitMask = ((-1) << i);
        return n & BitMask;
    }

    public static int clearBitsInRange(int n, int i, int j) {
        int a = ((~0) << (j+1));
        int b = (1 << i ) - 1;
        int bitMask = a | b;
        return n & bitMask;
    }

    public static void main(String[] args) {
        System.out.println("ith bit: " + getIthBit(11,2)); //output: ith bit: 0
        System.out.println("ith bit: " + getIthBit(11,3)); //output: ith bit: 1
        System.out.println();
        // set ith bit to 1
        System.out.println("set ith bit: " + setIthBit(10,2)); 
        System.out.println();
        //clear ith bit
        System.out.println("clear ith bit: " + clearIthBit(10,1));
    }
    
}
