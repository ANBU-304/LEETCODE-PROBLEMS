class Solution {
    public String reverseVowels(String s) {
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            if((s.charAt(i)== 'A' )||(s.charAt(i)== 'a') ||(s.charAt(i)== 'E' )||( s.charAt(i)== 'e') ||( s.charAt(i)== 'I') || (s.charAt(i)== 'i') || (s.charAt(i)== 'O')|| s.charAt(i)== 'U' || s.charAt(i)== 'u' || (s.charAt(i)== 'o') )
            {
                c++;
            }
        }
        char [] v = new char [c];
        int k=0;
        for(int i=0;i<s.length();i++)
        {
           if((s.charAt(i)== 'A' )||(s.charAt(i)== 'a') ||(s.charAt(i)== 'E' )||( s.charAt(i)== 'e') ||( s.charAt(i)== 'I') || (s.charAt(i)== 'i') || (s.charAt(i)== 'O')|| s.charAt(i)== 'U' || s.charAt(i)== 'u'|| (s.charAt(i)== 'o') )
            {
                v[k]=s.charAt(i);
                k++;
            }
        }

        char []ans = s.toCharArray();

        k=k-1;


        for(int i=0;i<s.length();i++)
        {
           if((s.charAt(i)== 'A' )||(s.charAt(i)== 'a') ||(s.charAt(i)== 'E' )||( s.charAt(i)== 'e') ||( s.charAt(i)== 'I') || (s.charAt(i)== 'i') ||(s.charAt(i)== 'o') || (s.charAt(i)== 'O')|| s.charAt(i)== 'U' || s.charAt(i)== 'u' )
            {
                ans[i]=v[k];
                k--;
            }
        }
        String res=new String();

        for(int i=0;i<s.length();i++)
        {
            res+=ans[i];
        }

        return res;
    }
}