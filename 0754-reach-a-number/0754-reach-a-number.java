class Solution {
    public int reachNumber(int target) {
        target = Math.abs(target);
        int start = 0;
        int count = 0;
        while(start<target){
            count++;
            start += count;
        }
        while((start-target) % 2 != 0){
            count++;
            start += count;
        }
        return count;
    }
}