class Solution {
    public int[] findErrorNums(int[] nums) {
        int xor = 0;
        int n = nums.length;

        // Step 1: XOR all elements and numbers 1..n
        for (int num : nums) xor ^= num;
        for (int i = 1; i <= n; i++) xor ^= i;

        // Step 2: Get rightmost set bit
        int setBit = xor & -xor;

        int x = 0, y = 0;

        // Step 3: Divide into two groups
        for (int num : nums) {
            if ((num & setBit) != 0) x ^= num;
            else y ^= num;
        }

        for (int i = 1; i <= n; i++) {
            if ((i & setBit) != 0) x ^= i;
            else y ^= i;
        }

        // Step 4: Determine duplicate and missing
        for (int num : nums) {
            if (num == x) {
                return new int[]{x, y}; // x = duplicate
            }
        }

        return new int[]{y, x}; // y = duplicate
    }
}