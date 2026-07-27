class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int consMax = 0;
        int count = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i]==1){
                count++;
            }
            else{
                count=0;
            }
            consMax = Math.max(count, consMax);
        }
        return consMax;
    }
}