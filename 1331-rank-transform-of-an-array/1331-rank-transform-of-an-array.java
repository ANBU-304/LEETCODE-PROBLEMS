class Solution {
    public int[] arrayRankTransform(int[] arr) {
        
     TreeSet<Integer> set = new TreeSet<>();
        int nums[] = new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            set.add(arr[i]);
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        int r=1;
        for(int n:set)
        {
            map.put(n,r++);
        }

        for(int i=0;i<arr.length;i++)
        {
            nums[i] = map.get(arr[i]);
        }

        return nums;
    }
}