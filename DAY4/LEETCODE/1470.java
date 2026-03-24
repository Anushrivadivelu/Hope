//1470. Shuffle the Array
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n];
        int x = 0;
        for (int i = 0; i < n; i++) {
            result[x] = nums[i];
            x++;
            result[idx] = nums[i + n];
            x++;
        }return result;
    }
}
