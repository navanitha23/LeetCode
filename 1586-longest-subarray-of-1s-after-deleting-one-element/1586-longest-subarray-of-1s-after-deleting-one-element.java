class Solution {
    public int longestSubarray(int[] nums) {
        int lef=0;
        int c=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                c++;
            }
            while(c >1)
            {
                if(nums[lef]==0)
                {
                    c--;
                }
                lef++;
            }
            max=Math.max(max,i-lef);
        }
        return max;
    }
}