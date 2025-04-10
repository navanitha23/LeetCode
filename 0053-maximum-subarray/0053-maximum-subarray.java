class Solution {
    public int maxSubArray(int[] nums) {
        int max=Integer.MIN_VALUE;
        int currmax=0;
        for(int i=0;i<nums.length;i++){
            if(currmax<0){
            currmax=0;
        }
            currmax=currmax+nums[i];
            max=Math.max(max,currmax);
        }
        return max;
    }
}