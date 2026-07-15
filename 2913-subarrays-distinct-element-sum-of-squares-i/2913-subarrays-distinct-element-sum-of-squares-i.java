class Solution {
    public int sumCounts(List<Integer> nums) {
        int count =0;
        for(int i=0;i<nums.size();i++)
        {
            HashSet<Integer> ans = new HashSet<>();
            for(int j=i;j<nums.size();j++)
            {
                ans.add(nums.get(j));
                count+=ans.size() * ans.size();
            }

            
        }
        return count;
    }
}