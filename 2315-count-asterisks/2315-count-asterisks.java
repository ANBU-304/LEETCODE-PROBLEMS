class Solution {
    public int countAsterisks(String s) {
        int c=0;
        int ans=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='|')
            c++;

            if(c==0 || c%2==0)
            {
                if(s.charAt(i)=='*')
                ans++;
            }
        }

        return ans;
    }
}