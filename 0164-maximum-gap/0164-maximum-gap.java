class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int maxGap = 0;
        for(int i = 0; i<nums.length-1; i++){
            if(nums[i+1]-nums[i] > maxGap){
                maxGap = nums[i+1]-nums[i];
            }
        }
        return maxGap;
    }
}