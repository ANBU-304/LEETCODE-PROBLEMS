class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        String s ="123456789";
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=2;i<10;i++)
        {
            int d=0;
            for(int j=0;j+i<10;j++)
            {
             d = Integer.parseInt(s.substring(j,j+i));
             if(d>=low && d<=high)
            {
                ans.add(d);
            }
            }

            

        }
        return ans;
    }
}