class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int count= 0 ;
        for(int i=0;i<nums.length;i++)
        {
            int t=0;
            for(int j=i;j<nums.length;j++)
            {
                if(nums[j]== target)
                {
                    t++;
                }
                int len = Math.abs(j-i+1);
                if(len<2*t)
                {
                    count++;
                }
                
            }
        }

        return count;
    }
}