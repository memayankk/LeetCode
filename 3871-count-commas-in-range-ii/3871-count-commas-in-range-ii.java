class Solution {
    public long countCommas(long n) {
        long comma = 0;
        if(n>=1000){
            comma += n-1000+1;
        }
        if(n>=1000000){
            comma += n-1000000+1;
        }
        if(n>=1000000000L){
            comma += n-1000000000L+1;
        }
        if(n>=1000000000000L){
            comma += n-1000000000000L+1;
        }
        if(n>=1000000000000000L){
            comma += n-1000000000000000L+1;
        }
        return comma;
    }
}