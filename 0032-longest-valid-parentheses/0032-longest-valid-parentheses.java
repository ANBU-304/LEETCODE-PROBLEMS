class Solution {
    public int longestValidParentheses(String s) {
        int count = 0;
        Stack<Integer> st = new Stack<>();
        int maxCount = 0;
        st.push(-1);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                st.push(i);
            }

            else {
                    st.pop();
                if (st.isEmpty()) {
                    st.push(i);
                } else {
                    maxCount = Math.max(maxCount, i - st.peek());
                }

            }

        }
        return maxCount;
    }
}