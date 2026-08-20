class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        TreeMap<Long, Long> map = new TreeMap<>();

        for (int i = 0; i < nums.length; i++) {

            long x = nums[i];

           
            Long key = map.ceilingKey(x - valueDiff);

            if (key != null && key <= x + valueDiff) {
                return true;
            }

            map.put(x, (long) i);

           
            if (i >= indexDiff) {
                map.remove((long) nums[i - indexDiff]);
            }
        }

    
        return false;

    }
}