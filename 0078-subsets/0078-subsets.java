class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int n=nums.length;
        int count = 1<<n;
List<List<Integer>> res = new ArrayList<List<Integer>>(); 
        for(int i=0;i<count;i++)
        {
            List<Integer> sub = new ArrayList<Integer>();
            for(int j=0;j<n;j++)
            {
                if((i & (1<<j))!=0)
                sub.add(nums[j]);
            }
            res.add(sub);
        }
return res;
    }
}