public class Solution {
    public int reverseBits(int n) {
        String binaryStr = String.format("%32s", Integer.toBinaryString(n)).replace(' ', '0');
        String reversedStr = new StringBuilder(binaryStr).reverse().toString();
        return (int) Long.parseLong(reversedStr, 2);
    }
}
