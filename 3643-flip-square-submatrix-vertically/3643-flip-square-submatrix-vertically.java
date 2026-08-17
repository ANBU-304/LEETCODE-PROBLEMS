class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int ans[][] = new int[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(i>=x &&  i<k+x && j>=y && j<k+y)
                {
                   
                    ans[i][j] =  grid[x + k - 1 - (i - x)][j];
                   
                }else
                {
                    ans[i][j] = grid[i][j];
                }
                
               
            }
        }

       

        return ans;
    }
}