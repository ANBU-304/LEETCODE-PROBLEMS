class Solution {
    public int minimumDistance(int[] nums) {
        // if(nums.length<=2)
        // {
        //     return -1;
        // }

       
            // int f[] = new int[101];
            // for(int i=0;i<nums.length;i++)
            // {
            //     f[nums[i]]++;
            // }
            // int max =0;
            // for(int i=1;i<=nums.length;i++)
            // {
            //     max = Math.max(f[i],max);
            // }

            // if(max<3)
            // {
            //     return -1;
            // }
        int n = nums.length;
        int min=n+1;
        for(int i=0;i<n-2;i++)
        {
         for(int j=i+1;j<n-1;j++)
         {
            if (nums[i] != nums[j]) {
                    continue;
                }
            for(int k=j+1;k<n;k++)
            {
                if(nums[j]==nums[k])
                {
                   min = Math.min(min, k - i);
                   break;
                }

                
            }
         }   
        }

        return min==n+1 ? -1 : min*2;
    }
}