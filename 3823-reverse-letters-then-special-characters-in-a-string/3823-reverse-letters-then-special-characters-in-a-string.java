class Solution {
    public String reverseByType(String s) {
        StringBuilder letters = new StringBuilder();
        StringBuilder specials = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                letters.append(ch);
            } else {
                specials.append(ch);
            }
        }
        int letterIdx = letters.length() - 1;
        int specialIdx = specials.length() - 1;

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                result.append(letters.charAt(letterIdx));
                letterIdx--;
            } else {
                result.append(specials.charAt(specialIdx));
                specialIdx--;
            }
        }
        return result.toString();
    }
}