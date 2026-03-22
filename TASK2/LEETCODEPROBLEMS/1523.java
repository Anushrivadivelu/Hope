class Solution {
    public int countOdds(int low, int high) {
        /*int count=0;
        if(low%2==0){
            low++;
        }
        for(int i=low;i<=high;i+=2){
            count++;
        }
        return count;
        */
        int res=0;
        int c= high-low;
        if(((low&1)==0) && ((high&1)==0)){
            res= c>>1;
            System.out.println(res);
        } 
        else if(((low&1)==1) && ((high&1)==1)){
            res=((c+2)>>1);
            System.out.println(res);
        } 
        else{
            res=((c+1)>>1);
            System.out.println(res);
        }
        return res;
    }
}
