class Solution {
    public int eraseOverlapIntervals(int[][] inter) {
        Arrays.sort(inter,new Comparator<int[]>(){
            public int compare (int []a,int[]b){
                return a[1]-b[1];
            }
        });
        int rem=0;
        int end=-100000;
        for(int[]in:inter){
            if(in[0]>=end){
                end=in[1];
            }
            else{
                rem++;
            }
        }
        return rem;
    }
}