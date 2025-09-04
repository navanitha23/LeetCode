class Solution {
    public int equalPairs(int[][] grid) {
        Map<String,Integer>mp = new HashMap<>();
        int n = grid.length;
        for(int i = 0; i< grid.length;i++){
            String gridStr = Arrays.toString(grid[i]);
            mp.put(gridStr,mp.getOrDefault(gridStr,0)+1);
        }
        int ans = 0;
        for(int j = 0; j< n; j++){
            int temp[] = new int[n];
            for(int i = 0; i< n;i++){
             temp[i] = grid[i][j];
            }
            String tempStr = Arrays.toString(temp);
            ans += mp.getOrDefault(tempStr,0);
        }
        return ans;
    }
}