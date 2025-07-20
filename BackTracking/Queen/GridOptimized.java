package BackTracking.Queen;

public class GridOptimized {
    
    public static int fact(int n) {
        if(n == 1) {
            return 1;
        }
        return n * fact(n-1);
    }
    public static int grid(int n, int m) {
        int totWays = fact(n-1+m-1) / (fact(n-1) * fact(m-1));
        return totWays;
    }
    public static void main(String[] args) {
        int n = 5, m = 5;
        System.out.println("Total ways: " + grid(n, m));
    }
}


