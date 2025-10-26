class Solution {
    public int minCostToMoveChips(int[] position) {
        int e=0;
        int od=0;
        for(int n:position){
            if(n%2==0){
                e++;
            }
            else{
                od++;
            }
        }
        return Math.min(e,od);
    }
}