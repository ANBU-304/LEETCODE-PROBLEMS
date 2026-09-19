class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int count = requests[0];
        int prev = count;
        for (int i = 1; i < requests.length; i++) {
            count += Math.abs(prev - requests[i]);
            prev = requests[i];
        }

        return count;
    }
}