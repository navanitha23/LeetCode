class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int c=1;
        int res=0;
        for(int i=0;i<flowerbed.length;i++){
            if(flowerbed[i]==0){
                c++;
            }
            else{
                res=res+(c-1)/2;
                c=0;
            }
        }
        if(c != 0) res+=c/2;
        return res>=n;
    }
}