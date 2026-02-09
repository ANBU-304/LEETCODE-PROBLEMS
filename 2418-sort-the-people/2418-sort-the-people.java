class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
      HashMap<Integer,String> a = new HashMap<>();
      String []s = new String[heights.length];
      for(int i=0;i<heights.length;i++)
      {
        a.put(heights[i],names[i]);
      }  
      Arrays.sort(heights);
      int j=0;
      for(int i=heights.length-1;i>=0;i--)
      {
        s[j++]=a.get(heights[i]);
      }

      return s;
    }
}