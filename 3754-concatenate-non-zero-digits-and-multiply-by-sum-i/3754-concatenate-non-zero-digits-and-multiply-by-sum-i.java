class Solution {
    public long sumAndMultiply(int n) {
        String s = String.valueOf(n).replace("0", "");

        if (s.isEmpty()) {
            return 0;
        }

        long sum = 0;
        for (char c : s.toCharArray()) {
            sum += c - '0';
        }

        return sum * Long.parseLong(s);
    }
}