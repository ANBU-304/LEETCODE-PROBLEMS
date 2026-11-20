class Solution {
    public boolean isCircularSentence(String sentence) {
        String[] str = sentence.split(" ");

        if(str.length==1)
        {
            return str[0].charAt(0) == str[0].charAt(str[0].length()-1);
        }

        if(str[0].charAt(0)!=str[str.length-1].charAt(str[str.length-1].length()-1))
        {
            return false;
        }

        for(int i=1;i<str.length;i++)
        {
            char f = str[i-1].charAt(str[i-1].length()-1);
            char e = str[i].charAt(0);

            if(f!=e)
            return false;
        }

        return true;
    }
}