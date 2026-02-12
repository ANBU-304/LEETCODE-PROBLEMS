class Solution {
    public boolean isBalanced(String num) {

       
        int sumEven=0;
        int sumOdd=0;
        for(int i=0;i<num.length();i++)
        {
            int s= num.charAt(i)-'0';
            if(i%2==0)
            {
                 sumEven+=s;
            }
            else
            {
                sumOdd+=s;
            }
            
        }

        if(sumEven!=sumOdd)
        {
            return false;
        }
        return true;
    }
}