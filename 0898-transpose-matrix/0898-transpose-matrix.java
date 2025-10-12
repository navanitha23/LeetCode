class Solution {
    public int[][] transpose(int[][] mat) {
        int r=mat[0].length;
        int c=mat.length;
        int [][] arr=new int[r][c];
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                arr[j][i]=mat[i][j];
            }
        }
        return arr;
    }
}