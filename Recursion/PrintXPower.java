package Recursion;

public class PrintXPower {
    public static int Power(int x, int n) {
        if(n == 0) {
            return 1; // base case anything Power 0 is 1
        }
        return x * Power(x,n-1);
    }

    public static int optimizedPower(int x, int n) { // TC: O(log n)
        if(n == 0) { // base case
            return 1;
        }
        
        int halfPower = optimizedPower(x, n/2); // function calling
        int halfPowerSq = halfPower * halfPower ;  

        // n is odd
        if(n % 2 != 0) {
            halfPowerSq = x * halfPowerSq;
        }

        return halfPowerSq; // return answer
    }
    public static void main(String[] args) {
        System.out.println(Power(2,10));
        System.out.println(optimizedPower(2,10));
    }
}
