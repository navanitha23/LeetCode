class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(a,b)->Integer.compare(a[0],b[0]));
        int c=1;
        int prevs=points[0][0];
        int preve=points[0][1];
        for(int i=1;i<points.length;i++){
            int currs=points[i][0];
            int curre=points[i][1];
            if(currs>preve){
                c++;
                prevs=currs;
                preve=curre;
            }
            else{
                prevs=Math.max(prevs,currs);
                preve=Math.min(preve,curre);
            }
        }
        return c;
    }
}