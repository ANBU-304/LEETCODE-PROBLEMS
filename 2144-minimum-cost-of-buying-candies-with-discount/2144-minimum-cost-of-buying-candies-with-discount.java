class Solution {
    public int minimumCost(int[] cost) {
        if(cost.length==1)
        return cost[0];

        if(cost.length==2)
        return cost[0]+cost[1];

        Arrays.sort(cost);
       int sum=0;
       int k=1;
        for(int i=cost.length-1;i>=0;i--)
        {
                if(k%3!=0)
                {
                    sum+=cost[i];
                }
              k++;
             
            
        }

        return sum;
    }
}