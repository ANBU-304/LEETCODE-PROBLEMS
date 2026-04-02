class Solution {
    public int[] numberOfPairs(int[] nums) {
        int[] count = new int[101];
        int pairs = 0;
        int leftover = 0;

        for (int num : nums) {
            count[num]++;
        }

        for (int num : count) {

            pairs += num / 2;
            leftover += num % 2;
        }

        return new int[] { pairs, leftover };

    }
}