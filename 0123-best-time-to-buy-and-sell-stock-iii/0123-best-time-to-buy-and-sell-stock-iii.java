class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if (n < 2) return 0;

        int[] leftProfits = new int[n];
        int p1 = 0; 
        int maxLeftProfit = 0;
        for(int p2 = 1; p2<n; p2++){
            if(prices[p1] >= prices[p2]){
                p1 = p2;
            }
            else{
                int profit = prices[p2] - prices[p1];
                if (profit > maxLeftProfit) {
                    maxLeftProfit = profit;
                }
            }
            leftProfits[p2] = maxLeftProfit;
        }

        int[] rightProfits = new int[n];
        int maxPrice = prices[n - 1]; 
        int maxRightProfit = 0;
        
        for(int i = n - 2; i >= 0; i--){
            if(prices[i] >= maxPrice){
                maxPrice = prices[i]; 
            } else {
                int profit = maxPrice - prices[i]; 
                if (profit > maxRightProfit) {
                    maxRightProfit = profit;
                }
            }   
            rightProfits[i] = maxRightProfit; 
        }
        int totalMaxProfit = 0;
        for (int i = 0; i < n; i++) {
            int currentTotal = leftProfits[i] + rightProfits[i];
            if (currentTotal > totalMaxProfit) {
                totalMaxProfit = currentTotal;
            }
        }
        return totalMaxProfit;
    }
}