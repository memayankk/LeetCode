class Solution {
    public int minMoves(int[] nums) {
        int maxVal = nums[0];
        int totalSum = 0;
        for (int num : nums){
            if(num > maxVal){
                maxVal = num;
            }
            totalSum += num;
        }
        return (maxVal * nums.length)-totalSum;
    }
}