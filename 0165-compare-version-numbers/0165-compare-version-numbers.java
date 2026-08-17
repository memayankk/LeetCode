class Solution {
    public int compareVersion(String version1, String version2) {
        int i = 0; 
        int j = 0;
        int n1 = version1.length();
        int n2 = version2.length();
        while (i < n1 || j < n2) {
            long num1 = 0;
            long num2 = 0;

            while (i < n1 && version1.charAt(i) != '.') {
                int digit = version1.charAt(i) - '0'; 
                num1 = num1 * 10 + digit;             
                i++;
            }

            while (j < n2 && version2.charAt(j) != '.') {
                int digit = version2.charAt(j) - '0';
                num2 = num2 * 10 + digit;
                j++;
            }
            if (num1 < num2) return -1;
            if (num1 > num2) return 1;
            i++;
            j++;
        }  
        return 0;  
    }
}