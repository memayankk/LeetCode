class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] minCoinsForAmount = new int[amount + 1];
        Arrays.fill(minCoinsForAmount, amount + 1);
        
        minCoinsForAmount[0] = 0;
        
        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (i - coin >= 0) {
                    minCoinsForAmount[i] = Math.min(minCoinsForAmount[i], minCoinsForAmount[i - coin] + 1);
                }
            }
        }
        
        if (minCoinsForAmount[amount] > amount){
            return -1;
        }
        else{
            return minCoinsForAmount[amount];
        }
    }
}