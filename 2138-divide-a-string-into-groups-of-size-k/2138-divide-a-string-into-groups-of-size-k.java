class Solution {
    public String[] divideString(String s, int k, char fill) {
        
        String [] ans = new String[((s.length()+k)-1)/k];
        int t=0;
        for(int i=0;i<ans.length;i++)
        {
            StringBuffer a = new StringBuffer();
            
            for(int j=0;j<k;j++)
            {
                if(t>=s.length())
                {
                    a.append(fill);
                }else
                {
                    a.append(s.charAt(t));
                }
                
                t++;
            }
            
            ans[i] = a.toString();
           
        }
        return ans;
    }
}