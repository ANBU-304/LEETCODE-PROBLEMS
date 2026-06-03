class Solution {
    public int smallestAbsent(int[] nums) {
        long sum = 0;
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            sum += num;
            set.add(num);
        }

        int avg = (int)(sum / nums.length);

        int candidate = Math.max(1, avg + 1);

        while (set.contains(candidate)) {
            candidate++;
        }

        return candidate;
    }
}