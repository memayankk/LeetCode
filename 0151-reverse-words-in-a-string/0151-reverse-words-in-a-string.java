import java.util.Arrays;
class Solution {
    public String reverseWords(String s) {
        String [] wordsArray = s.trim().split("\\s+");
        int start = 0;
        int end = wordsArray.length-1;
        while(start<end){
            String temp = wordsArray[start];
            wordsArray[start] = wordsArray[end];
            wordsArray[end] = temp;
            start++;
            end--;
        }
        return  String.join(" ", wordsArray);
    }
}