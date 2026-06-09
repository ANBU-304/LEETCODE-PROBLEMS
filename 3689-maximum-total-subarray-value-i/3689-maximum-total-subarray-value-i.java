class Solution {
    public long maxTotalValue(int[] nums, int k) {
        Arrays.sort(nums);
        int minValue=nums[0];
        int maxValue=nums[nums.length-1];
        return (long)k*(maxValue-minValue);

    }
}