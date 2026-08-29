class Solution {
    public boolean canJump(int[] nums) {
        int finalJ = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++){
            if(i>finalJ){
                return false;
            }
            finalJ = Math.max(finalJ, i+nums[i]);

            if(finalJ>=n-1){
                return true;
            }
        }
        return true;
    }
}