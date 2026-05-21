class Solution {
    public boolean canAliceWin(int[] nums) {
        int bsum=0;
        int asum=0;
        for(int num:nums)
        {
            if(num>9)
            {
                bsum+=num;
            }else
            {
                asum+=num;
            }
        }

        return asum!=bsum;
    }
}