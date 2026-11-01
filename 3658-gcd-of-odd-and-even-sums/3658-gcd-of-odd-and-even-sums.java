class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumOdd = 0;
        int sumEven = 0;

        int oddNum = 1;
        int evenNum = 2;
        int count = 0;
        while(count < n){
            sumOdd += oddNum;
            sumEven += evenNum;
            oddNum += 2;
            evenNum += 2;
            count++;
        }
        while(sumEven != 0){
            int remainder = sumOdd % sumEven;
            sumOdd = sumEven;
            sumEven = remainder;
        }
        return sumOdd;
    }
}