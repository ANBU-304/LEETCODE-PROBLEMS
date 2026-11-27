class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int count=0;
        for(int i=left;i<=right;i++)
        {
          String s = words[i];
          String v = "aeiou";
          if(v.indexOf(s.charAt(0))!=-1 && v.indexOf(s.charAt(s.length()-1))!=-1)
          count++;
        }

        return count;
    }
}