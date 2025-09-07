class Solution {
    public int orangesRotting(int[][] grid) {
       int n=grid.length;
       int m=grid[0].length;
       int count=0;
       Queue<int []> q=new LinkedList<>();
       for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(grid[i][j]==2){
                q.add(new int[]{i,j});
                grid[i][j]=3;
            }
            else if(grid[i][j]==1){
                count++;
            }
        }
       }
       int fresh=0;
       if(count==0)
       return 0;
       if(q.isEmpty())
       return -1;
       while(!q.isEmpty()){
        int s=q.size();
        for(int i=0;i<s;i++){
            int []temp=q.poll();
            int r=temp[0];
            int c=temp[1];
            if(r+1<n && grid[r+1][c]==1){
                q.add(new int[]{r+1,c});
                grid[r+1][c]=3;
            }
            if(r-1>=0 && grid[r-1][c]==1){
                q.add(new int[]{r-1,c});
                grid[r-1][c]=3;
            }
            if(c+1<m && grid[r][c+1]==1){
                q.add(new int[]{r,c+1});
                grid[r][c+1]=3;
            }
            if(c-1>=0 && grid[r][c-1]==1){
                q.add(new int[]{r,c-1});
                grid[r][c-1]=3;
            }
        }
        fresh++;
       }
        for(int i =0;i < n;i++){
            for(int j =0;j <m;j++){
                if(grid[i][j] == 1){
                    return -1;
                }            
            }
        }
        return fresh-1;
    }
}