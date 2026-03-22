// 1217. Minimum Cost to Move Chips to The Same Position
class Solution {
    public int minCostToMoveChips(int[] position) {
        int c1=0,c2=0;
        for(int i : position){
            if(i%2==0){
                c1++;
            }else{
                c2++;
            }
        }return Math.min(c1,c2);
    }
}
