class Solution {
    public int[] numberOfPairs(int[] nums) {
       Arrays.sort(nums);
       int count=0;
       int res=0;
       int j=0;

       if(nums.length==1)
       return new int[]{0,1};

       for(int i=1;i<nums.length;i++)
       {
        if(nums[j]==nums[i])
        {
          count++;
          i++;
          j++;
        }
        else
        {
            res++;
        }
        j++;
       

       
       }
      


       return new int[]{count,nums.length-count*2};
    }
}