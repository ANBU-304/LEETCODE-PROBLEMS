class Solution {
    public String mergeAlternately(String word1, String word2) {
       StringBuilder s = new StringBuilder();
        int n1=word1.length();
        int n2 = word2.length();
        int max = Math.max(n1,n2);
        for(int i=0;i<max;i++)
        {
            if(i<n1)
                s.append(word1.charAt(i));

            if(i<n2)
                s.append(word2.charAt(i));
            
        }

        return s.toString();
    }
}