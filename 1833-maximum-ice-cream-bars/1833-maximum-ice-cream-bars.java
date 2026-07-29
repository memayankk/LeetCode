class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int totalCost = 0;
        int count = 0; 
        for(int i = 0; i<costs.length; i++){
            if(totalCost + costs[i] <= coins ){
                totalCost = totalCost + costs[i];
                count++;
            }
            else{
                break;
            }
        }
        return count;
    }
}