class Solution {
    public int scoreOfParentheses(String s) {
        int totalScore = 0;
        int currentLayerValue = 1;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == '('){
                currentLayerValue *= 2; 
            }
            else {
                currentLayerValue /= 2;
                if (s.charAt(i - 1) == '(') {
                    totalScore += currentLayerValue;
                }
            }
        }
        return totalScore;
    }
}