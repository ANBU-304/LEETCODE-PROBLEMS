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

        long diff = sum - expectedSum;             
        long sqDiff = sqSum - expectedSqSum;       

        long sumXY = sqDiff / diff;               

        int x = (int) ((diff + sumXY) / 2);        
        int y = (int) (sumXY - x);        

        return new int[]{x, y};
    }
}