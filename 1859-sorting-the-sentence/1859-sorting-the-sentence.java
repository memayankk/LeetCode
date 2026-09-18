class Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] correctOrder = new String[words.length]; 
        for (String word : words){
            int len = word.length();
            char digit = word.charAt(len - 1);
            int index = digit - '1'; 
            correctOrder[index] = word.substring(0, len - 1);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < correctOrder.length; i++) {
            sb.append(correctOrder[i]);
            if (i < correctOrder.length - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}