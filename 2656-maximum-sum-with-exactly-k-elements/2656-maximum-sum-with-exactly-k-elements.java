class Solution {
    public int maximizeSum(int[] nums, int k) {
        int maxVal = nums[0];
        for (int num : nums) {
            if (num > maxVal) {
                maxVal = num;
            }
        }
        return (maxVal * k) + ((k - 1) * k / 2);
    }
}