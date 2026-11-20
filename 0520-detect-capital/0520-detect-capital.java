class Solution {
    

    
    public boolean detectCapitalUse(String word) {
        int caps=0;
        int low=0;

        for(int i=0;i<word.length();i++)
        {
            char c = word.charAt(i);
            if(Character.isUpperCase(c))
            caps++;

            if(Character.isLowerCase(c))
            low++;

        }

        if(caps == word.length()|| low == word.length()||(low==word.length()-1 && Character.isUpperCase(word.charAt(0))))
        return true;
    return false;
    }
}