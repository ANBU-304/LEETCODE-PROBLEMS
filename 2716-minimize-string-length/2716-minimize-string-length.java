class Solution {
    public int minimizedStringLength(String s) {
        boolean f[] = new boolean[26];

        for(int i=0;i<s.length();i++)
        {
            f[s.charAt(i)-'a'] = true;
        }

        int count=0;
         for(int i=0;i<26;i++)
        {
            if(f[i] )
            {
                count++;
            }
        }

        return count;

    }
}