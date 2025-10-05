class Solution {
    private int[][] directions = {{1,0}, {-1,0}, {0,1}, {0,-1}};
    private int m, n;
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> result = new ArrayList<>();
        if (heights == null || heights.length == 0 || heights[0].length == 0) return result;

        m = heights.length;
        n = heights[0].length;

        boolean[][] pacific = new boolean[m][n];
        boolean[][] atlantic = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            dfs(heights, pacific, i, 0, Integer.MIN_VALUE);    
            dfs(heights, atlantic, i, n - 1, Integer.MIN_VALUE); 
        }
        for (int j = 0; j < n; j++) {
            dfs(heights, pacific, 0, j, Integer.MIN_VALUE);     
            dfs(heights, atlantic, m - 1, j, Integer.MIN_VALUE); 
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (pacific[i][j] && atlantic[i][j]) {
                    result.add(Arrays.asList(i, j));
                }
            }
        }

        return result;
    }
    private void dfs(int[][] heights, boolean[][] visited, int row, int col, int prevHeight) {
        if (row < 0 || col < 0 || row >= m || col >= n) return;
        if (visited[row][col]) return;
        if (heights[row][col] < prevHeight) return;

        visited[row][col] = true;

        for (int[] dir : directions) {
            int newRow = row + dir[0];
            int newCol = col + dir[1];
            dfs(heights, visited, newRow, newCol, heights[row][col]);
        }
    }
}