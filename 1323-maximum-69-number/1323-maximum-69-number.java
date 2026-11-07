class Solution {
    public int maximum69Number (int num) {
        int temp = num;
        int index = 0;
        int firstSixPos = -1;

        while(temp>0){
            if(temp%10==6){
                firstSixPos = index;
            }
            temp /= 10;
            index++;
        }
        if(firstSixPos != -1){
            num += 3 * Math.pow(10, firstSixPos);
        }
        return num;
    }
}