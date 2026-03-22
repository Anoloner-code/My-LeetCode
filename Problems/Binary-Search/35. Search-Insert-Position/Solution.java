class Solution {
    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++)  {
            if (nums[i]>target && i==0) return i;
            if (nums[i]==target) return i;
            if (i+1<=nums.length-1) {
            if (nums[i]< target && nums[i+1]> target) return i+1;}
                
            }
        if (nums[nums.length-1] == target) return nums.length-1;
        return nums.length;
    }
}
