class Solution {
    public int countKeyChanges(String s) {
        String temp = s.toLowerCase();
        int count=0;
        for(int i=1;i<temp.length();i++)
        {
            if(temp.charAt(i)!=temp.charAt(i-1))
            {
                count++;
            }
        }

        return count;
    }
}