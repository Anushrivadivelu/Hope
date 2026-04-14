class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length==1) return nums[0];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int avg = (nums.length)/2;
        for(int i : map.keySet()){
            if(map.get(i)>avg){
                return i;
            }
        }
        return -1;
    }
}
