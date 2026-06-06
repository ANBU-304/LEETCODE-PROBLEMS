class Solution {
    public int[] leftRightDifference(int[] nums) {
   
       int [] ans = new int[nums.length];
      
        for(int i=0;i<nums.length;i++)
        {
                 int l=0;
             int ls=0;
       int rs=0;
             int r=i+1;;
            while(l<i)
            {
                ls+=nums[l];
                l++;
            }
            while(r<nums.length)
            {
                rs+=nums[r];
                r++;
            }
            ans[i] = Math.abs(ls-rs);
            

        }
        return ans;
    }
}