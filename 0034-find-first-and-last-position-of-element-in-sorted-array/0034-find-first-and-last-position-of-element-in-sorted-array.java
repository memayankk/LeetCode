class Solution {
    public int binarySearch(int [] nums, int target, boolean first){
        int ans = -1;
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start + (end - start) / 2;
            if(nums[mid]<target){
                start = mid+1;
            }
            else if(nums[mid]>target){
                end=mid-1;
            }
            else{
                ans = mid;
                if(first){
                    end = mid -1;
                }
                else{
                    start = mid+1;
                }
            }
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        return new int [] {binarySearch(nums, target, true),binarySearch(nums, target, false)};
    }
}