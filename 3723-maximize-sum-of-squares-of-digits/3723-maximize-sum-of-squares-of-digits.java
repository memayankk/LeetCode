class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if (sum > 9 * num) {
            return "";
        }
        
        StringBuilder sb = new StringBuilder();
        int ninesCount = sum / 9;
        int remainder = sum % 9;

        for (int i = 0; i < ninesCount; i++) {
            sb.append('9');
        }
        if (ninesCount < num && remainder > 0) {
            sb.append(remainder);
        }
        else if (ninesCount < num && remainder == 0 && sb.length() == 0){

        }
        while (sb.length() < num) {
            sb.append('0');
        }
        
        return sb.toString();
    }
}