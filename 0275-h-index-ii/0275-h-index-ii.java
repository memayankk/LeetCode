class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int start = 0;
        int end = n - 1;
        while (start<=end){
            int mid = start + (end - start)/2;
            int remPapers = n - mid;
            if(citations[mid]==remPapers){
                return remPapers;
            }
            else if(citations[mid]<remPapers){
                start = mid+1;
            }
            else {
                end = mid - 1;
            }
        }
        return n - start;
    }
}