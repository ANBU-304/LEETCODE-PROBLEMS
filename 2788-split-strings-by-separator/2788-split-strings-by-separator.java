class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> ans = new ArrayList<>();
        for(int i=0;i<words.size();i++)
        {
            String s = words.get(i);
           StringBuffer t = new StringBuffer();
            for(int j=0;j<s.length();j++)
            {
                if(s.charAt(j)!=separator)
                {
                    t.append(s.charAt(j));
                }
                else
                {
                    if(t.toString()!="")
             ans.add(t.toString());
              t.setLength(0);
            
                }
               
            }
             if(t.toString()!="")
             ans.add(t.toString());
        }
        return ans;
    }
}