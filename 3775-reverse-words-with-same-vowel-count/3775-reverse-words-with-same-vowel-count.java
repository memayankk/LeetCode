class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        int targetVowels = 0;
        String firstWord = words[0];
        for (int i = 0; i < firstWord.length(); i++) {
            char ch = firstWord.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                targetVowels++;
            }
        }
        StringBuilder result = new StringBuilder();
        result.append(firstWord);
        for (int i = 1; i < words.length; i++){
            String currentWord = words[i];
            int currentVowels = 0;
            for (int j = 0; j < currentWord.length(); j++){
                char ch = currentWord.charAt(j);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    currentVowels++;
                }
            }
            result.append(" ");
            if (currentVowels == targetVowels){
                for (int j = currentWord.length() - 1; j >= 0; j--) {
                    result.append(currentWord.charAt(j));
                }
            }
            else {
                result.append(currentWord);
            }
        }
        return result.toString();
    }
}