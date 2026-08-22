class Solution {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int i=0;
      while(i<n && nums[i]<0)
        {
            
            
                int j=n-1;
                while(nums[j]>0)
                {
                    if(nums[j]+nums[i]==0)
                    return nums[j];

                    j--;
                }
           i++;
        }

        return -1;
    }
}