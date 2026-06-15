class Solution {
    public int longestConsecutive(int[] nums) {
        int count=1;
        int j=0;
        int maxCount=1;
        TreeSet<Integer> set = new TreeSet<>();
        for(int num:nums)
        {
            set.add(num);
        }
        ArrayList<Integer> a = new ArrayList<>(set);
        for(int i= 1;i<a.size();i++)
        {
            if( a.get(j)+1==a.get(i))
            {
                 count++;
                
            }
            else
            {
                 count=1;
            }
            j++;
            maxCount=Math.max(maxCount,count);
        }

        return nums.length==0?0:maxCount;
    }
}