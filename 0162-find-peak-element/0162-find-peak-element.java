class Solution {
    public int findPeakElement(int[] nums) {
        int n=nums.length;
        int c=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(max<nums[i]){
                max=nums[i];
                c=i;
            }
        }
        return c;
    }
}