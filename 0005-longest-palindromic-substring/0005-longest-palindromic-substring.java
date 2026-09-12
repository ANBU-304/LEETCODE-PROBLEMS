public class Solution {
    public Boolean isPalidrom(String b) {
        int l = 0;
        int r = b.length() - 1;

        while (l < r) {
            if (b.charAt(l) != b.charAt(r))
                return false;

            l++;
            r--;
        }

        return true;
    }

    public String longestPalindrome(String s) {
        String ans = "";

        int max = 0;
        for (int i = 0; i < s.length(); i++) {

            for (int j = i; j < s.length(); j++) {
                String a = s.substring(i, j + 1);
                int len = a.length();
                if (isPalidrom(a)) {
                    if (len > max) {
                        max = len;
                       // ans = "";
                        ans = a;
                    }

                }
            }
        }

        return ans;
    }
}