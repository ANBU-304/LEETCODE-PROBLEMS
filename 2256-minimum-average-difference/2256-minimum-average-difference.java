class Solution {
    public int minimumAverageDifference(int[] nums) {
        int n=nums.length;
        long total=0;
       
      long avg=0;
      
        
         long sum=0;
        for(int num:nums)
        {
            total+=num;
        }
        int i=0;
        long minAvg=Integer.MAX_VALUE;
        int ans=0;
         long ravg=0;
        for(i=0;i<n;i++)
        {
           
                sum+=nums[i];
               
            
         
          

           
            

            if(i!=n-1)
            ravg=(total-sum)/(n-i-1);
            else
            ravg = 0;

            avg = Math.abs((sum/(i+1)) - ravg);

            if(minAvg>avg)
            {
                minAvg=avg;
                ans=i;
            }
          
        }

        return ans;
        
    }
}