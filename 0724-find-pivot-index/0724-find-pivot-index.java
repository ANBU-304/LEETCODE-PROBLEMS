class Solution {
    public int pivotIndex(int[] nums) {
       
int n = nums.length;
        for(int i=0;i<n;i++)
        {
            int start = 0;
            int end = 0;
            int k= 0;
       int m=n-1;
            while(k<i)
            {
                start +=nums[k];
                k++;
            }
            while(m>i)
            {
                end +=nums[m];
                m--;
            }

            if(start == end)
            return i;
        }
     return -1; 
    }
}