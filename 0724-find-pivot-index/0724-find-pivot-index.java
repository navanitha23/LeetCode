class Solution {
    public int pivotIndex(int[] nums) {
        if(nums.length==0)
        return -1;
        int lt=0, rs=0;
        for(int n:nums){
            rs=rs+n;
        }
        for(int i=0;i<nums.length;i++){
            rs=rs-nums[i];
            if(rs==lt)
            return i;
            lt=lt+nums[i];
        }
        return -1;
    }
}