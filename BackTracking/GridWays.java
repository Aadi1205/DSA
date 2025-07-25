package BackTracking;

public class GridWays {
    public static int gridWays(int i, int j, int n, int m) {
        //base case
        if(i == n-1 && j == m-1) {
            return 1;
        }
        //corner case
        else if(i == n || j == n) { // boundary cross condition
            return 0;
        }
        int w1 = gridWays(i+1, j, n, m);
        int w2 = gridWays(i, j+1, n, m);
        return w1 + w2;
    }
    public static void main(String[] args) {
        int n = 5, m = 5;
        System.out.println(gridWays(0, 0, n, m));
    }
}
