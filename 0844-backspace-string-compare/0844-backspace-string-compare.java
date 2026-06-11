class Solution {

    public Stack<Character> checkString(String a)
    {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i)=='#')
            {
                if(!st.isEmpty()){
                     st.pop();
                }
            }
            else
            {
                st.push(a.charAt(i));
            }
        }
        return st;
    }
    public boolean backspaceCompare(String s, String t) {
        return checkString(s).equals( checkString(t));

    }
}