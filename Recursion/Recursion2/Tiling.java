package Recursion.Recursion2;

public class Tiling {
    public static int tilingProblem(int n) { // 2 X n (floor size)
        // base case
        if(n == 0 || n == 1) {
            return 1;
        }
        //Ver choices
        // int fnm1 = tilingProblem(n-1); // Ver Tiles

        // //horizontal choice
        // int fnm2 = tilingProblem(n-2);

        // int totalWays = fnm1 + fnm2; // similar to fibonacci seq
        // return totalWays;

        return tilingProblem(n-1) + tilingProblem(n-2);
    }
    public static void main(String[] args) {
        System.out.println(tilingProblem(5));
    }
}
