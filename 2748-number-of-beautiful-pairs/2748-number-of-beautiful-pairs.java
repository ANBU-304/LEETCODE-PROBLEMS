class Solution {
    public int gcd(int a,int b)
    {
        while(b!=0)
        {
          
        int temp = b;
        b = a % b;
        a = temp;
           
        }
        return a;
    }
    public int firstDigit(int n)
    {
        while(n>=10)
        {
            n/=10;
        }
        return n;
    }
    public int countBeautifulPairs(int[] nums) {
        int count=0;
       for(int i=0;i<nums.length;i++)
       {
        for(int j=i+1;j<nums.length;j++)
        {
            if(gcd(firstDigit(nums[i]),nums[j]%10)==1)
            {
                count++;
            }
            
        }
       }



            
        

        return count;
    }
}