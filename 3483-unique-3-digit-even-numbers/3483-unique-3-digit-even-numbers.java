class Solution {
    public int totalNumbers(int[] digits) {
        int [] availableCounts = new int [10];
        for (int d : digits) {
            availableCounts[d]++;
        }
        int uniqueCount = 0;
        for (int num = 100; num <= 998; num += 2) {
            int hundreds = num / 100;
            int tens = (num / 10) % 10;
            int units = num % 10;

            int[] requiredCounts = new int[10];
            requiredCounts[hundreds]++;
            requiredCounts[tens]++;
            requiredCounts[units]++;   

            boolean isPossible = true;
            for (int i = 0; i < 10; i++) {
                if (requiredCounts[i] > availableCounts[i]) {
                    isPossible = false;
                    break;
                }
            }
            
            if (isPossible) {
                uniqueCount++;
            } 
        }
        return uniqueCount;
    }
}