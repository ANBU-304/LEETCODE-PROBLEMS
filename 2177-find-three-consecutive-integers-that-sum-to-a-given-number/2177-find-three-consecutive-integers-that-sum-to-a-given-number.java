class Solution {
    public long[] sumOfThree(long num) {
        
        // for(int i=0;i<=num/3;i++)
        // {
        //     if(i*3==num)
        //     {
        //         return new long[]{i-1,i,i+1};
        //     }
        // }

        // return new long[]{};

        
        if((num - 3) % 3 == 0){
            long a = (num-3)/3;
            return new long[]{a,a+1,a+2};
        }else{
            return  new long[]{};
        }
    }
}