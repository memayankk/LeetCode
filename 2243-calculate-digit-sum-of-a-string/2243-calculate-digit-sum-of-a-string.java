class Solution {
    public String digitSum(String s, int k) {
        while(s.length()>k){
            StringBuilder nextS = new StringBuilder();

            for(int i = 0; i<s.length(); i+=k){
                int groupSum = 0;
                int end = Math.min(i+k, s.length());

                for(int j = i; j<end; j++){
                    groupSum += s.charAt(j) -'0';
                }
                nextS.append(groupSum);
            }
            s = nextS.toString();
        }
        return s;
    }
}