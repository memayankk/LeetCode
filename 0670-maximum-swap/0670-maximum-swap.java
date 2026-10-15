class Solution {
    public int maximumSwap(int num) {
        int temp = num;
        int count = 0;
        while (temp > 0) {
            count++;
            temp /= 10;
        }

        int[] digits = new int[count];
        temp = num;
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }
        
        int maxNum = num;

        for (int i = 0; i < count; i++){
            for (int j = i + 1; j < count; j++){
                int t = digits[i];
                digits[i] = digits[j];
                digits[j] = t;
                int currentNum = 0;
                for (int k = 0; k < count; k++){
                    currentNum = currentNum * 10 + digits[k];
                }
                if (currentNum > maxNum) {
                    maxNum = currentNum;
                }

                digits[j] = digits[i];
                digits[i] = t;
            }
        }
        return maxNum;
    }
}