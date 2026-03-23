class Solution {
    public int shipWithinDays(int[] weights, int days) {
        
        int low = 0;
        int sum = 0;

        for (int w : weights) {
            low = Math.max(low, w); 
            sum += w;
        }

        int high = sum;

        while (low < high) {
            int mid = (low + high) / 2;

            if (helper(weights, mid) <= days) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public int helper(int[] weights, int mid) {
        int currSum = 0;
        int d = 1;

        for (int num : weights) {
            if (currSum + num > mid) {
                d++;
                currSum = num;
            } else {
                currSum += num;
            }
        }
        return d;
    }
}