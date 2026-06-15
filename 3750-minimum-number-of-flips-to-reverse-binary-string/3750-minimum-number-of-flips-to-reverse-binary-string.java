class Solution {
    public int minimumFlips(int n) {
        String binary = Integer.toBinaryString(n);
      String rev = new StringBuilder(binary).reverse().toString();

      if(rev==binary)
      return 0;

      int count=0;
      for(int i=0;i<rev.length();i++)
      {
        if(rev.charAt(i)!=binary.charAt(i))
        {
            count++;
        }
      }
      return count;
    }
}