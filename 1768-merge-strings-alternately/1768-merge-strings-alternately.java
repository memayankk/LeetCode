class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n1 = word1.length();
        int n2 = word2.length();
        StringBuilder str = new StringBuilder();
        
        int i = 0;

        while (i < n1 || i < n2) {
            if (i < n1) {
                str.append(word1.charAt(i));
            }
            if (i < n2) {
                str.append(word2.charAt(i));
            }
            i++;
        }
        return str.toString();
    }
}