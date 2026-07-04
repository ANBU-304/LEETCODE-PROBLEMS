class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        TreeSet<Integer> set = new TreeSet<>();

        for(int i=0;i<nums.length;i++)
        {
            set.add(nums[i]);
        }
         int size = Math.min(k, set.size());
        int ans[] = new int[size];
        Iterator<Integer> it = set.descendingIterator();
        int i=0;
       while(it.hasNext() && i<size)
       {
        ans[i++]   = it.next();
       }

        return ans;
    }
}