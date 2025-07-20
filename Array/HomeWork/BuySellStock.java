package HomeWork;

public class BuySellStock {
    public static void MaxProfit(int prices[]) {
        int n = prices.length;
        int maxProfit = 0;
        int minPrice = prices[0];

        for(int i=0; i<n; i++) {
            if(prices[i] < minPrice) {
                minPrice = prices[i];
            }
            else {
                maxProfit = Math.max(maxProfit, prices[i] - minPrice);
            }
        }
        System.out.println("Maximum possible profit is " + maxProfit);


    }
    public static void main(String[] args) {
        int prices[] = {7,6,4,3,1};
        MaxProfit(prices);
    }
}
