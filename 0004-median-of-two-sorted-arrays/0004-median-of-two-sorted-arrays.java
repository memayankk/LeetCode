class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] merged = new int[m + n];
        for (int i = 0; i < m; i++) {
            merged[i] = nums1[i];
        }
        for (int i = 0; i < n; i++) {
            merged[m + i] = nums2[i];
        }
        Arrays.sort(merged);
        int totalElements = merged.length;

        if (totalElements % 2 != 0) {
            return (double) merged[totalElements / 2];
        } 
        else {
            int mid1 = merged[(totalElements / 2) - 1];
            int mid2 = merged[totalElements / 2];
            return (mid1 + mid2) / 2.0;
        }
    }
}