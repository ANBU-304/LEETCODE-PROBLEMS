class Solution {
    public int maximizeExpressionOfThree(int[] nums) {
        int a=0;
            int b=0;
            int c=0;
            int n=nums.length;
        if(nums.length==1)
        {
            return nums[0]-1;
        }else if(nums.length==2)
        {
            return nums[0] + nums[1] - 1;
        }
        else
        {
            
            Arrays.sort(nums);
            a=nums[n-1];
            b=nums[n-2];
            c=nums[0];
        }

        return a+b-c;

        
    }
}