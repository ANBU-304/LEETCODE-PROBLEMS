class Solution {
    public boolean checkInclusion(String s1, String s2) {
        char[] a = s1.toCharArray();
        Arrays.sort(a);
        for(int i=0;i<= s2.length() - s1.length();i++)
        {
            StringBuffer ans = new StringBuffer();
            for(int j=i;j<i+s1.length();j++)
            {
                ans.append(s2.charAt(j));
            }
             char[] b = ans.toString().toCharArray();
            Arrays.sort(b);

            if(Arrays.equals(a, b)) {
                return true;
            }

        }
        return false;

        

        
    }
}