class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int count = 0;
        for(int num : nums){
            if (num == 0) {
                if (digit == 0) {
                    count++;
                }
                continue;
            }
            while (num > 0) {
                int currentDigit = num % 10;
                if (currentDigit == digit) {
                    count++;
                }
                num /= 10; 
            }
        }
        return count;
    }
}