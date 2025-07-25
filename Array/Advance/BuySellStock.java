package Advance;

public class BuySellStock {
    public static int maxProfit(int prices[]) {
        int n = prices.length;
        int maxProfit = 0;
        int buyPrice = Integer.MAX_VALUE; 
        
        for(int i=0; i<n; i++) {
            if(buyPrice < prices[i]) { // profit
                 int profit = prices[i] - buyPrice; // today's profit
                 maxProfit = Math.max(maxProfit, profit); // max profit
            }
            else { // buyPrice > arr[i]  => take minimum buy price i.e. arr[i]
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices)); // 5
    }
    
}
