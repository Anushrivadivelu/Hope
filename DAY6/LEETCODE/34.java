//34. Find First and Last Position of Element in Sorted Array
class Solution {
    public int[] searchRange(int[] nums, int target) {  
        
      // BRUTEFORCE SOLUTION
      
        int[] res = {-1,-1};
        int temp =-1;
        for(int i =0;i<nums.length;i++){
            if(nums[i]==target){
                res[0]=i;
                temp=i;
                break;
            }
        } 
        if(temp==-1) return res;
        for(int j=nums.length-1;j>=temp;j--){
            if(nums[j]==target){
                res[1]=j;
                break;
            }
        }
        return res;
        
        // OPTIMAL SOLUTION USING BINARY SEARCH
      
        int left=0;
        int right= nums.length - 1;
        int i=0;
        int[] res={-1,-1};
        while(left <= right){
            int mid = (left+right)>>1;
            if(nums[mid]==target){
                res[0]=mid; 
                right= mid-1;
            }
            else if(nums[mid]<target) left = mid+1;
            else right = mid-1;
        }
        left=0;right= nums.length -1;
        while(left <= right){
            int mid = (left+right)>>1;
            if(nums[mid]==target){
                res[1]=mid;
                left = mid+1;
            }else if(nums[mid]<target) left = mid+1;
            else right = mid-1;
        }
        return res;
    }
}
