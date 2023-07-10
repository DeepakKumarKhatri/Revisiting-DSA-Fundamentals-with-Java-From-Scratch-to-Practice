package Arrays;

// LeetCode Easy
// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/

public class BestTimeToSell {
    public static void main(String[] args) {
        int[] prices = {2,4,1};
        System.out.println(bestTimeToSell(prices));
    }

    private static int bestTimeToSell(int[] prices) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (buyPrice < prices[i]){
               int profit = prices[i] - buyPrice;
               maxProfit = Math.max(profit, maxProfit);
            }else {
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }
}
