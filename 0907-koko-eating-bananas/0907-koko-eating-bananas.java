class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l=1;
        int max=0;
        for( int i=0;i<piles.length;i++){
            // h=Math.max(h.piles[i]);
            if(piles[i]>max){
                max=piles[i];
            }}
            int ans=0;
            while(l<=max){
                int mid=(l+max)/2;
                if(AbleToFinish(mid,piles,h)){
                     ans=mid;
                    max=mid-1;
                }
                else{
                    l=mid+1;
                }}
            return ans;

    }
        boolean AbleToFinish (int speed,int[]piles,int h){
            long time=0;
            for(int i=0;i<piles.length;i++){
                time+=piles[i]/speed;
                if(piles[i]%speed!=0)
                {
                    time+=1;
                }
            }
                if(time<=h){
                    return true;
                }
                else{
                    return false;
                }
        }
}