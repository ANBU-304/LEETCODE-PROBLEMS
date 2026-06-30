class Solution {
public:
void helper(int i,int j,int n,int m,vector<pair<int,int>>dir,vector<vector<int>>& grid,int & cnt){
    queue<pair<int,int>>q;
    q.push({i,j});
    grid[i][j]=0;
    cnt=1;
    while(!q.empty()){
        int crow=q.front().first;
        int ccol=q.front().second;
        q.pop();
        for(int i=0;i<dir.size();i++){
            int nrow=crow+dir[i].first;
            int ncol=ccol+dir[i].second;
            if(nrow>=0&&nrow<=n-1&&ncol>=0&&ncol<=m-1&&grid[nrow][ncol]==1){
                q.push({nrow,ncol});
                cnt++;
                grid[nrow][ncol]=0;
            }
        }
        
    }
}
    int maxAreaOfIsland(vector<vector<int>>& grid) {
       int maxcnt=0,cnt=0;
        int n=grid.size();
        int m=grid[0].size();
        vector<pair<int,int>>dir={{-1,0},{0,-1},{1,0},{0,1}};
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                 
                if(grid[i][j]==1){
                    cnt=0;
                    helper(i,j,n,m,dir,grid,cnt);
                }
                maxcnt=max(cnt,maxcnt);
            }
        }
        return maxcnt;
    }
};