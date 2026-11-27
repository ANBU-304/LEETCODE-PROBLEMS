class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int count = 0;

        for(int i=left;i<=right;i++){
            int l = words[i].length();
            char c1 = words[i].charAt(0);
            char c2 = words[i].charAt(l-1);

            if((c1 == 'a' || c1 == 'e' || c1 == 'i' || c1 == 'u' || c1 == 'o') &&
            (c2 == 'a' || c2 == 'e' || c2 == 'i' || c2 == 'o' || c2 == 'u' )){
                count++;
            }
        }

        return count;
    }
}