class Solution {
    public int minMoves(int[] nums) {
        if(nums.length==0)
        return 0;

        int min = nums[0];
        int ans =0;
        for(int i=1;i<nums.length;i++)
        {
           if (nums[i] < min) {
                min = nums[i];
            }
        }

        for(int i=0;i<nums.length;i++)
        {
            ans+=nums[i]-min;
        }
        return ans;
    }
}