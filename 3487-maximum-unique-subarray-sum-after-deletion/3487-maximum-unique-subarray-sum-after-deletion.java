class Solution {
    public int maxSum(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            
                set.add(nums[i]);
            
        }
        ArrayList<Integer> list =new ArrayList<>(set);
        int sum =0;
        int max  = Integer.MIN_VALUE;
       for(int i=0;i<list.size();i++)
       {
        if(list.get(i)>0)
        sum+=list.get(i);
        
        max =Math.max(max,list.get(i));
       }

       return (sum <= 0) ? max : sum;

    }
}