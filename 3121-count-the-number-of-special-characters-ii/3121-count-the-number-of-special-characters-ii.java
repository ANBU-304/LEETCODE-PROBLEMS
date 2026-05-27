class Solution {
    public int numberOfSpecialChars(String word) {
        int [] low = new int [26];
        int [] high = new int [26];
             int count=0;
        for(char a:word.toCharArray())
        {
            if(Character.isUpperCase(a))
            {
                if(low[a-'A']==1 && high[a-'A']==0)
                {
                    count++;
                 
                }
                high[a - 'A'] = 1;
            }else
            {
                if(high[a-'a']==1)
                {

                
                if(low[a-'a']==1)
                {
                    count--;
                    
                }
                low[a-'a'] = 2;
                }

                else if(low[a-'a']==0)
                {
                   
                    low[a-'a'] = 1;
                }
            }
            
        }

   

        return count;
    }
}