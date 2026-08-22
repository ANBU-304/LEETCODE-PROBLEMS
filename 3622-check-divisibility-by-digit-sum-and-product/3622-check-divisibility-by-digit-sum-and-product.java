class Solution {
    public boolean checkDivisibility(int n) {
        int temp =n;
        int prod = 1;
        int sum =0;
        while(temp>0)
        {
            int a = temp%10;
          
            sum+=a;
            prod*=a;
            temp/=10;

        }
        return n % (sum+prod) ==0;
    }
}