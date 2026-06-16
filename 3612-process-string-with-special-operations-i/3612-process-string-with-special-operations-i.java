class Solution {
    public String processStr(String s) {
       StringBuffer ans = new StringBuffer();

       for(int i=0;i<s.length();i++)
       {
          switch(s.charAt(i))
          {
            case '#':
            ans.append(ans);
            break;

            case '%':
            ans.reverse();
            break;

            case'*':
            
            if(ans.length()==0)
            break;

            ans.deleteCharAt(ans.length() - 1);
            break;

            default:
            ans.append(s.charAt(i));

          }
       }

       return ans.toString();
    }
}