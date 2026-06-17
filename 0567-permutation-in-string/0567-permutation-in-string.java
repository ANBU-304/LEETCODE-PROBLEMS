class Solution {
    public boolean checkInclusion(String s1, String s2) {
        char a[] = s1.toCharArray();
        Arrays.sort(a);
        String target = new String(a);
     for(int i=0, j = s1.length();j<=s2.length();i++,j++)
     {
        char []b = s2.substring(i,j).toCharArray();
        Arrays.sort(b);

        if(target.equals(new String(b)))
        {
            return true;
        }
     }   
     return false;
    }
}