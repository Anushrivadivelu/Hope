class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int m =0;
        int[] a = new int[nums1.length];
        for(int i =0;i<nums1.length;i++){
            boolean f = false;
            for(int k=0;k<m;k++){
                if(a[k]==nums1[i]){
                    f= true;
                }
            }
            if(f) continue;
            for(int j =0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    a[m]=nums1[i];
                    m++;
                    break;
                }
            }
        }
        return java.util.Arrays.copyOf(a, m);
    }
}
