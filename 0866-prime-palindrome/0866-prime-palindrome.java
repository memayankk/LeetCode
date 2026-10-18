class Solution {
    public int primePalindrome(int n) {
        if (n >= 8 && n <= 11) return 11;
        
        while (true) {
            int original = n;
            int reverted = 0;
            int temp = n;
            while (temp > 0) {
                reverted = reverted * 10 + temp % 10;
                temp /= 10;
            }
            if (original == reverted) {
                boolean isPrime = true;
                if (n <= 1) {
                    isPrime = false;
                }
                else {
                    for (int i = 2; i * i <= n; i++) {
                        if (n % i == 0) {
                            isPrime = false;
                            break; 
                        }
                    }
                }
                
                if (isPrime) {
                    return n;
                }
            }
            if (n > 10000000 && n < 100000000) {
                n = 100000000;
            } 
            else {
                n++;
            }
        }   
    }
}