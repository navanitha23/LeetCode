class Solution {
    public int longestOnes(int[] nums, int k) {
        int l = 0, r = 0;
        int n = nums.length;
        int flips = 0;
        int ans = 0;
        while(r<n){
            while(r<n && (nums[r]==1 || flips<k)){
                if(nums[r]==0) flips++;
                r++;
            }
            ans = Math.max(ans,r-l);
            //finding first 0 to be removed from flips and
            // using current 0 ecountered
            while(l<r && nums[l]==1){
                l++;
            }
            l++;
            r++;
        }
        return ans;
    }
}