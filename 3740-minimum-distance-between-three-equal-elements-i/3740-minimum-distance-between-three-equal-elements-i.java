class Solution {
    public int minimumDistance(int[] nums) {
        // if(nums.length<=2)
        // {
        //     return -1;
        // }

       
            int f[] = new int[101];
            for(int i=0;i<nums.length;i++)
            {
                f[nums[i]]++;
            }
            int max =0;
            for(int i=1;i<=nums.length;i++)
            {
                max = Math.max(f[i],max);
            }

            if(max<3)
            {
                return -1;
            }
        
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
         for(int j=i+1;j<nums.length;j++)
         {
            for(int k=j+1;k<nums.length;k++)
            {
                int d = Integer.MAX_VALUE;
                if(nums[i]==nums[j] && nums[j]==nums[k])
                {
                    d = Math.abs(i-j) + Math.abs(j-k) + Math.abs(k-i); 
                }

                min = Math.min(min,d);
            }
         }   
        }

        return min;
    }
}