class Solution {
    public void moveZeroes(int[] nums) {
        int j = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0 && j == -1) {
                j = i; 
            } else if (nums[i] != 0 && j != -1) {
                int t = nums[i];
                nums[i] = nums[j];
                nums[j] = t;
                j++; 
            }
        }
    }
}
