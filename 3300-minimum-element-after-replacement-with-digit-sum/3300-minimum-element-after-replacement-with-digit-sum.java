class Solution {
    public int minElement(int[] nums) {
        int min = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            int d =0;
            int temp = nums[i];
            while(temp>0)
            {
                d += temp%10;
                temp/=10;

            }
            min = Math.min(d,min);
            nums[i] = d;

        }

        return min;
    }
}