class Solution {
    public String capitalizeTitle(String title) {
        StringBuilder ans = new StringBuilder();
        String words[] = title.split(" ");
        //ans.append(words[0].charAt(0).toUpperCase());

        for(int i=0;i<words.length;i++)
        {
            if(words[i].length()>=3)
            {
                ans.append(Character.toUpperCase(words[i].charAt(0)));
                for(int j=1;j<words[i].length();j++)
                ans.append(Character.toLowerCase(words[i].charAt(j)));
                if(i+1 != words.length)
                ans.append(" ");
            }else
            {
                for(int j=0;j<words[i].length();j++)
                ans.append(Character.toLowerCase(words[i].charAt(j)));
                if(i+1 != words.length)
                ans.append(" ");
            }
        }

        return ans.toString();
    }
}