class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        boolean[] visit=new boolean[256];
        int j=0;
        for(int i=0;i<n;i++){
            if(!visit[i]){
                j++;
                dfs(isConnected,visit,i);
            }
        }
        return j;
    }
    public void dfs(int isConnected[][],boolean visit[],int city){
        Queue <Integer> q=new LinkedList<>();
        q.add(city);
        while(q.size()>0){
            int temp=q.poll();
            for(int i=0;i<isConnected.length;i++){
                if(isConnected[temp][i] ==1 && !visit[i]){
                    q.add(i);
                    visit[i]=true;
                }
            }
        }
    }
}