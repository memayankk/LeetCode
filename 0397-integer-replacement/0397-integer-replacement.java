class Solution {
    public int integerReplacement(int n) {
        int oper = 0;
        long num = n; 
        
        while (num > 1) {
            if (num % 2 == 0) {
                num /= 2;
                oper++;
            }
            else {
                if (num == 3) {
                    num -= 1; 
                } else if ((num + 1) % 4 == 0) {
                    num += 1; 
                } else {
                    num -= 1; 
                }
                oper++;
            }
        }
        return oper;
    }
}