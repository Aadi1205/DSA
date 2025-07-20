package BitManipulation;

public class FastExpo {
    public static int fastExpo(int a, int n) {
        int ans = 1;

        while(n > 0) {
            if((n & 1) != 0 ) {// check LSB 
                ans = (ans * a);
            }
            a = a * a;
            n = n >> 1;
        }
        return ans;
    }

    public static int fastExpoMod(int a, int n, int mod) {
    int ans = 1;
    a = a % mod;

    while(n > 0) {
        if((n & 1) != 0 ) {
            ans = (int)((1L * ans * a) % mod);
        }
        a = (int)((1L * a * a) % mod);
        n = n >> 1;
    }
    return ans;
}

    public static void main(String[] args) {
        System.out.println(fastExpo(3, 5));
        // fast Expo using mod
        System.out.println(fastExpoMod(3,13,7));
    }
}
