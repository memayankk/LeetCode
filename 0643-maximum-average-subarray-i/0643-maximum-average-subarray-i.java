class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int start = 0;
        int end = k -1 ;
        int sum = 0;
        while(start<=end){
            sum = sum + nums[start];
            start++;
        }
        start = 0;
        int maxSum = sum;
        while(end<nums.length-1){
            sum = sum - nums[start];
            start++;
            end++;
            sum = sum + nums[end];
            maxSum = Math.max(sum, maxSum);
        }
        return (double) maxSum/k;
    }
}