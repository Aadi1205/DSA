package GreedyAlgorithm;
import java.util.*;
public class IndianCoins { //This algo may failed in some country's currency
    public static void TotalCoins(int amount) {
        int[] coins = {2000, 500, 100, 50, 20, 10, 5, 2, 1}; //Indian currency -> canonical order
        ArrayList<Integer> ans = new ArrayList<>();
        int count = 0;
        for(int i=0; i<coins.length; i++) {
            while(coins[i] <= amount) {
                count++;
                ans.add(coins[i]);
                amount -= coins[i];
            }
            
        }
        
        System.out.println("Total number of Coins used: " + count);
        System.out.println(ans);
    }
    public static void main(String[] args) {
        int V = 190;
        TotalCoins(V);

    }
}
