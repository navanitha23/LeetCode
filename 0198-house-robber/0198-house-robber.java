class Solution {
    public int rob(int[] nums) {
      int n=nums.length;
        int s1=0;
        int s2=0;
        for(int i=0;i<n;i++){
            int t1=s2+nums[i];
            int t2=Math.max(s1,s2);
            s1=t1;
            s2=t2;
        }
        return Math.max(s1,s2);  
    }
}