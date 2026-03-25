class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;

        long sum = 0, sqSum = 0;
        for (int num : nums) {
            sum += num;
            sqSum += (long) num * num;
        }

        long expectedSum = (long) n * (n + 1) / 2;
        long expectedSqSum = (long) n * (n + 1) * (2 * n + 1) / 6;

        long diff = sum - expectedSum;              // x - y
        long sqDiff = sqSum - expectedSqSum;        // x^2 - y^2

        long sumXY = sqDiff / diff;                 // x + y

        int x = (int) ((diff + sumXY) / 2);         // duplicate
        int y = (int) (sumXY - x);                  // missing

        return new int[]{x, y};
    }
}