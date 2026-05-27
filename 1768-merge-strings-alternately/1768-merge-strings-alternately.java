class Solution {
    public String mergeAlternately(String word1, String word2) {
        String s="";
        int n1=word1.length();
        int n2 = word2.length();
        int max = Math.max(n1,n2);
        for(int i=0;i<max;i++)
        {
            if(i<n1)
                s=s+word1.charAt(i);

            if(i<n2)
                s=s+word2.charAt(i);
            
        }

        return s;
    }
}