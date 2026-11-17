class Solution {
    public String sortVowels(String s) {
        char [] arr = s.toCharArray();
        char [] vowels = new char [arr.length];
        int k = 0;

        for(char c : arr){
            if("AEIOUaeiou".indexOf(c) != -1){
                vowels[k] = c;
                k++;
            }
        }
        vowels = Arrays.copyOf(vowels, k);
        Arrays.sort(vowels);
        k = 0;
        for(int i = 0; i<arr.length; i++){
            if("AEIOUaeiou".indexOf(arr[i]) != -1){
                arr[i] = vowels[k];
                k++;
            }
        }
        return new String (arr);
    }
}