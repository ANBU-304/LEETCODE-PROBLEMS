class Solution {
    public String stringHash(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i+=k)
        {
            int c=0;
            for(int j=i;j<k+i;j++)
            {
                c+=s.charAt(j)-'a';
            
            }
         
            sb.append((char)((c%26)+'a'));
        }

        return sb.toString();
    }
}