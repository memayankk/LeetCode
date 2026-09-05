class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n = nums.length;
        int [] res = new int [2*n];
        int l = res.length-1;
        for (int i = 0; i<n; i++){
            res[i] = nums[i];
            res[l-i] = nums[i];
        }
        return res;
    }
}