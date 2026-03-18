public class Solution {
    
    public int reverseBits(int num) {
        int ans=0;

        for(int i=31;i>=0;i--)
        {
               if((num & 1) == 1) ans += 1<<i;
               num = num>>1;
        }       
        return ans;
        
    }
}