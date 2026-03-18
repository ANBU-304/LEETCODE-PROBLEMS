class Solution {
    public int mostFrequentEven(int[] nums) {
        int []f = new int[100001];

        int max=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0)
            {
                f[nums[i]]++;
            }
           
            
        }
        int j=-1;
        for(int i=0;i<100001;i++)
        {
            if(f[i]>max)
            {
                max=f[i];
                j=i;
            }
        }

        return j;





    }
}