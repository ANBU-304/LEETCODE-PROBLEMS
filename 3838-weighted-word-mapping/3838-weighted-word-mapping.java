class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        String ans = "";
   

        for (int i = 0; i < words.length; i++) {
            int sum = 0;
            int n = words[i].length();
            for(int j=0;j<n;j++)
            {
               sum += weights[words[i].charAt(j) - 'a'];
            }
            

            ans += (char)('z' - (sum % 26));
        }

        return ans;
    }
}