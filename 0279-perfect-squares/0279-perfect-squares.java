class Solution {
    public int numSquares(int n) {
        int[] arr = new int[n + 1];
        
        for (int i = 1; i <= n; i++) {
            arr[i] = i; 
            for (int j = 1; j * j <= i; j++) {
                int square = j * j;
                arr[i] = Math.min(arr[i], 1 + arr[i - square]);
            }
        }
        
        return arr[n];
    }
}