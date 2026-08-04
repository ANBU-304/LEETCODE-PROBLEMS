class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int []f = new int [101];
        List<Integer> a = new ArrayList<>();
        Arrays.sort(nums);
        int max=nums[nums.length-1];
        int min= nums[0];
        
        for (int num : nums) {
            f[num] = 1;
        }

        for(int i=min;i<max;i++)
        {
            if(f[i]==0)
            {
                a.add(i);
            }
        }

        return a;
    }
}