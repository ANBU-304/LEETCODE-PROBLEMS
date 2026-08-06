class Solution {
    public int smallestNumber(int n, int t) {
        int mul=1;
        int i=n;
      for( i=n;i<101;i++)
      {
        int temp=i;
         mul=1;
        while(temp>0)
        {
            mul*=temp%10;
            temp/=10;
        }

        if(mul%t==0)
        {
            break;
        }
      }

      return i;
    }
}