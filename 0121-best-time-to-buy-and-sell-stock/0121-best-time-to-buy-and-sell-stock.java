class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int n = prices.length;
        int profit = 0;
        int p1 = 0;
        int p2 = 1;
        while (p2<n){
            if(prices[p1]>=prices[p2]){
                p1 = p2;
            }
            else{
                profit = prices[p2]-prices[p1];
                if(profit > max){
                    max = profit;
                }
            }
            p2++;
        }
        return max;
    }
}