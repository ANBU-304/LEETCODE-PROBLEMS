class Solution {
    public int thirdMax(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        for(int num:nums)
        {
            set.add(num);
        }
        
        if(set.size()==2)
        return set.last();

        if(set.size()<=1)
        return set.first();

        
        return set.lower(set.lower(set.last()));
    }
}