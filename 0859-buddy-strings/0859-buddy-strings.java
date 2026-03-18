class Solution {
    public boolean buddyStrings(String s, String goal) {

        if (s.length() != goal.length())
            return false;

        int k = 0;
        int[] a = new int[2];

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != goal.charAt(i)) {

                if (k == 2) // ✅ FIX HERE
                    return false;

                a[k] = i;
                k++;
            }
        }

        if (k == 0) {
            int[] freq = new int[26];
            for (int i = 0; i < s.length(); i++) {
                freq[s.charAt(i) - 'a']++;
                if (freq[s.charAt(i) - 'a'] > 1)
                    return true;
            }
            return false;
        }

        if (k != 2) return false;

        char[] arr = s.toCharArray();

        char temp = arr[a[0]];
        arr[a[0]] = arr[a[1]];
        arr[a[1]] = temp;

        for (int i = 0; i < s.length(); i++) {
            if (arr[i] != goal.charAt(i)) {
                return false;
            }
        }

        return true;
    }
}