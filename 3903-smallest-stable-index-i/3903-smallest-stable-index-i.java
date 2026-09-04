class Solution {
    public int findMin(int nums[],int i)
    {
        int res = Integer.MAX_VALUE;
     
        for(int j=i;j<nums.length;j++)
        {
            res = Math.min(nums[j],res);
        }
        return res;
    }
    public int firstStableIndex(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        
        int ans = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            max = Math.max(max,nums[i]);
            int min = findMin(nums,i);
            if((max-min)<=k )
            {
                return i;
            }
            
        }

        return -1;
    }
}