class Solution {
    public int[] countBits(int n) {
        int ans[]=new int[n+1];
        ans[0]=0;
        for(int i=1;i<=n;i++){
            String bin=Integer.toBinaryString(i);
            int onec=countone(bin);
            ans[i]=onec;
        }
        return ans;
    }
    private int countone(String num){
        int c=0;
        for(int i=0;i<num.length();i++){
            if(num.charAt(i)=='1'){
                c++;
            }
        }
        return c;
    }
}