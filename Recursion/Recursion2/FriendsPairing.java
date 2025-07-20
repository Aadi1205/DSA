package Recursion.Recursion2;

public class FriendsPairing {
    public static int friendsPairing(int n) {
        //base case
        if(n == 1 || n == 2) {
            return n;
        }
        // choices
        // single
        int fnm1 = friendsPairing(n-1);

        // pair
        int fnm2 = friendsPairing(n-2);
        int pairWays = (n-1) * fnm2;

        int totalWays = fnm1 + pairWays;

        return totalWays;
        
        // return friendsPairing(n-1) + (n-1) * friendsPairing(n-2);
    }
    public static void main(String[] args) {
        System.out.println(friendsPairing(4));
    }
}
