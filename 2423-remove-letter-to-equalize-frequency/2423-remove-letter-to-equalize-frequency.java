class Solution {
    public boolean equalFrequency(String word) {
        HashSet<Integer> set = new HashSet<>();

        int f[] = new int[26];
        
        for(int i=0;i<word.length();i++)
        {
            f[word.charAt(i)-'a']++;
        }

        for(int i=0;i<26;i++)
        {
            if(f[i]!=0)
            {
                set.add(f[i]);
            }
        }

      

       

        for(int i=0; i<26; i++)
        {
            if(f[i] == 0)
            {
                continue;
            }

            f[i]--;

            set.clear();

            for(int j=0; j<26; j++)
            {
                if(f[j] != 0)
                {
                    set.add(f[j]);
                }
            }

            if(set.size()==1) return true;

            

            f[i]++;
        }

        

        
        return false;
    }
}