class Solution {
    public int[] resultArray(int[] nums) {
        ArrayList<Integer> a = new ArrayList<>();
         ArrayList<Integer> b = new ArrayList<>();
        a.add(nums[0]);
        b.add(nums[1]);
       
        for(int i=2;i<nums.length;i++)
        {
            if(a.get(a.size()-1)>b.get(b.size()-1))
            a.add(nums[i]);
            else
            b.add(nums[i]);
        }

        
        int i=0;
        for(i=0;i<a.size();i++)
        {
            nums[i] = a.get(i);
        }

        for(int j=0;j<b.size();j++)
        {
            nums[i] = b.get(j);
            i++;
        }

   return nums;
    }
}