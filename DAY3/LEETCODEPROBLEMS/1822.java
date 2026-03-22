//1822. Sign of the Product of an Array
class Solution {
    public int arraySign(int[] nums) {
        int mul=1;
        int res=0;
        for(int i : nums){
            if(i==0){
                return 0;
            }if(i<0){
                mul*=-1;
            }
        }if(mul>0){
            res=1;
        }else{
            res=-1;
        }
        return res;
    }
}
