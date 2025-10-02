class Solution {
    public int maxProfit(int[] prices, int fee) {
        int free=0;
        int h=-prices[0];
        for(int i:prices){
            int temp=h;
            h=Math.max(h,free-i);
            free=Math.max(free,temp+i-fee);
        }
        return free;
    }
}