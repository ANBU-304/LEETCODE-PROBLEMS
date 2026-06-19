class Solution {
    public int maximizeSum(int[] nums, int k) {
         int max = Integer.MIN_VALUE;
	   int sum=0;
	   for(int i=0;i<nums.length;i++)
	   {
	       max = Math.max(nums[i],max);
	   }
       sum=max;
       while(--k>0)
       {
        ++max;
        sum+=max;
        
       }
        
       return sum;
    }
}