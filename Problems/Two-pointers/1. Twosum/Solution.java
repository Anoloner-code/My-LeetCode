import java.util.HashMap;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> newlist = new  HashMap<Integer,Integer>();
        for (int i = 0 ;i< nums.length;i++ ) {
            int newtarget = target - nums[i];
            if (newlist.containsKey(newtarget)) {
                return new int[]{newlist.get(newtarget), i};
            } else {
                newlist.put(nums[i],i);
            }
        }
        
        
        return null;
    }
}
