class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        int n = arr.length;
        double low = 0.0;
        double high = 1.0;
        
        while (low < high) {
            double mid = (low + high) / 2.0;
            double maxFraction = 0.0;
            int totalSmallerFractions = 0;
            
            int numIdx = 0, denIdx = 0;
            int j = 1;
            
            for (int i = 0; i < n; i++) {
                while (j < n && arr[i] > mid * arr[j]) {
                    j++;
                }
                
                if (j == n) break;
                
                totalSmallerFractions += (n - j);
                
                double currentFraction = (double) arr[i] / arr[j];
                if (currentFraction > maxFraction) {
                    maxFraction = currentFraction;
                    numIdx = i;
                    denIdx = j;
                }
            }
            
            if (totalSmallerFractions == k) {
                return new int[]{arr[numIdx], arr[denIdx]};
            } else if (totalSmallerFractions > k) {
                high = mid;
            } else {
                low = mid;
            }
        }
        
        return new int[]{};
    }
}
