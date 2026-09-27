class Solution {
    public String reverseParentheses(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        
        for (int i = 0; i < n; i++) {
            if (arr[i] == ')') {
                int j = i;
                while (j >= 0 && arr[j] != '(') {
                    j--;
                }
                
                reverse(arr, j + 1, i - 1);
                
                arr[j] = ' ';
                arr[i] = ' ';
            }
        }
        
        return new String(arr).replace(" ", "");
    }
    
    private void reverse(char[] arr, int left, int right) {
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
