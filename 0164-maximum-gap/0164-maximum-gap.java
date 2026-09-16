class Solution {
    public int maximumGap(int[] nums) {
        int n = nums.length;
        if (n < 2) {
            return 0;
        }
        int maxGap = 0;
        Arrays.sort(nums);
        for(int i = 0; i<n-1; i++){
            if(nums[i+1]-nums[i] > maxGap){
                maxGap = nums[i+1]-nums[i];
            }
        }
        return maxGap;
    }
}