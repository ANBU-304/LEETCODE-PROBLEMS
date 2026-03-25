class Solution {
    public int[] findErrorNums(int[] nums) {
        int a=0;
        int b=0;
       int sum=0;
       int n=nums.length;
       Arrays.sort(nums);
      for(int i=1;i<nums.length;i++)
      {
        if(nums[i-1]==nums[i])
        {
            a=nums[i-1];
            break;
        }
      }

      for(int i=0;i<nums.length;i++ )
      {
        sum+=nums[i];
      }
      sum-=a;
    
      int totalSum=((n*(n+1))/2);
      b = totalSum-sum;
     
      return new int[]{a,Math.abs(b)};

    }
}