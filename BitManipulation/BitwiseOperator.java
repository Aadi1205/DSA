package BitManipulation;

public class BitwiseOperator {
    public static void main(String[] args) {
        //bitwise and &
        System.out.println("5 & 6 = " + (5 & 6)); //output 101 & 110 = 100 => 4 in decimal
        //bitwise or | pipe 
        System.out.println("5 | 6 = " + (5 | 6)); //output 101 | 110 = 111 => 7 in decimal
        //bitwise XOR ^
        System.out.println("5 ^ 6 = " + (5 ^ 6)); //output 101 ^ 110 = 011 => 3 in decimal
        //bitwise NOT ~
        System.out.println("~5 = " + (~5)); //output ~101 = 010 = 2 in decimal but answer is -6 due to MSB is 1 so the number is negative
        System.out.println("~0 = " + (~0)); //output ~000 = 111 = -1 in decimal
        System.out.println("~1 = " + (~1)); //output ~001 = 110 = -2 in decimal
        //binary left shift <<
        System.out.println("5 << 2 = " +  (5<<2)); //output 000101 << 2 = 010100 = 20 in decimal
        //binary right shift >>
        System.out.println("5 >> 2 = " + (5>>2)); //output 000101 >> 2 = 000001 = 1 in decimal

    }
}