class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        int min = 0;
        int max = 0;

        for (int k = 0; k < n; k++){
            if(nums[k] < nums[min]){
                min = k;
            }
            if(nums[k] > nums[max]){
                max = k;
            }
        }

        int i = Math.min(min, max);
        int j = Math.max(min, max);

        int opt1 = j + 1;
        int opt2 = n - i;
        int opt3 = (i + 1) + (n - j);

        return Math.min(opt1, Math.min(opt2, opt3));
    }
}