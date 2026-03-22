//231. Power of Two
class Solution {
    public boolean isPowerOfTwo(int n) {
        boolean result = false;
        if(n==0 || n==Integer.MAX_VALUE || n==Integer.MIN_VALUE) return false;
        if((n & (n-1))==0) result = true;
        return result;
    }
}
