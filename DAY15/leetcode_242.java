class Solution {
    public boolean isAnagram(String s, String t) {
        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();
        Arrays.sort(ss);
        Arrays.sort(tt);
        String m =String.valueOf(ss);
        String n = String.valueOf(tt);
        if(m.equals(n)){
            return true;
        }else{
            return false;
        }
    }
}
