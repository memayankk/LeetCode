class Solution {
    public int minimumAddedInteger(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        for (int i = 2; i >= 0; i--){
            int candidateX = nums2[0] - nums1[i];
            if (isValidShift(nums1, nums2, candidateX)) {
                return candidateX;
            }
        }
        return 0;
    }
    private boolean isValidShift(int[] nums1, int[] nums2, int x){
        int skipped = 0;
        int p2 = 0;
        for (int num1 : nums1) {
            if (p2 < nums2.length && num1 + x == nums2[p2]){
                p2++; 
            }
            else {
                skipped++;
                if (skipped > 2) {
                    return false;
                }
            }
        }
        return p2 == nums2.length;
    }
}