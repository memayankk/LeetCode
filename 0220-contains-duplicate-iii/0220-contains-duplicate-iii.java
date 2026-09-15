class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        int n = nums.length;
        for(int i = 0; i<n; i++){
            int maxJ = Math.min(n - 1, i + indexDiff);
            for (int j = maxJ; j > i; j--){
                long diff = Math.abs((long) nums[i] - (long) nums[j]);
                if (diff <= valueDiff) {
                    return true;
                }
                if (valueDiff == 0 && nums[i] != nums[j]){
                    if (Math.abs(j - i) > 1000) {
                        j = i + 1;
                    }
                }
            }
        }
        return false;
    }
}