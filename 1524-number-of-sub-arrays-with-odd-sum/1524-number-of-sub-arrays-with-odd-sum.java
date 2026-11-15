class Solution {
    public int numOfSubarrays(int[] arr) {
        long oddCount = 0;
        int currentSum = 0;

        for (int num : arr) {
            currentSum += num;
            if (currentSum % 2 != 0) {
                oddCount++;
            }
        }
        long evenCount = (arr.length + 1) - oddCount;
        return (int) ((oddCount * evenCount) % 1_000_000_007);
    }
}