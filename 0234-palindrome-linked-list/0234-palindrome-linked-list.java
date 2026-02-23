import java.util.*;

class Solution {
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> st = new Stack<>();
        ListNode temp = head;
        int count = 0;

        // Count length
        while (temp != null) {
            count++;
            temp = temp.next;
        }

        temp = head;
        int i = count / 2;

        // Push first half into stack
        while (i > 0) {
            st.push(temp.val);
            temp = temp.next;
            i--;
        }

        // Skip middle element if odd length
        if (count % 2 == 1) {
            temp = temp.next;
        }

        // Compare second half
        while (temp != null) {
            int a = st.pop();
            if (a != temp.val) {
                return false;
            }
            temp = temp.next;
        }

        return true;
    }
}