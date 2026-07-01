class Solution {
    public int pivotIndex(int[] nums) {
        int start = 0;
        int n = nums.length;
        int end = 0;
        int total=0;
        for(int num:nums){
            total+=num;
        }
        for (int i = 0; i < n; i++) {

            
            start += nums[i];

            end =total-start+nums[i];

            if (start == end)
                return i;
        }
        return -1;
    }
}