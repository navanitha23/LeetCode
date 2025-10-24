class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n=image.length;
        for(int[] row:image){
            int i=0;
            int j=n-1;
            while(i<=j){
                if(i==j){
                    row[i]^=1;
                }
                else{
                    int temp=row[i]^1;
                    row[i]=row[j]^1;
                    row[j]=temp;
                }
                i++;
                j--;
            }
        }
        return image;
    }
}