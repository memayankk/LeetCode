class Solution {
    public int climbStairs(int n, int[] costs) {
        long [] arr =new long [n+1];
        arr[0] = 0;

        for(int i = 1; i<=n; i++){
            long minCosts = Long.MAX_VALUE;

            if(i >= 1 && arr[i-1] != Long.MAX_VALUE){
                minCosts = Math.min(minCosts, arr[i-1]+costs[i-1] + 1);
            }

            if(i >= 2 && arr[i-2] != Long.MAX_VALUE){
                minCosts = Math.min(minCosts, arr[i-2] + costs[i-1] + 4);
            }

            if(i >= 3 && arr[i-3] != Long.MAX_VALUE){
                minCosts = Math.min(minCosts, arr[i-3]+ costs[i-1] + 9);
            }

            arr[i] = minCosts;
        }
        return (int) arr[n];
    }
}