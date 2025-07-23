class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        // int []pre=new int[n];
        // int post[]=new int[n];
        // pre[0]=nums[0];
        // post[n-1]=nums[n-1];
        // for(int i=1;i<n;i++){
        //     pre[i]=pre[i-1]*nums[i];
        // }
        // for(int i=n-2;i>=0;i--){
        //     post[i]=post[i+1]*nums[i];
        // }
        // for(int i=0;i<n;i++){
        //     int prev=i!=0?pre[i-1]:1;
        //     int postv=i!=n-1?post[i+1]:1;
        //     nums[i]=prev*postv;
        // }
        // return nums;
        int postmax[]=new int[n];
         postmax[0]=1;
        for(int i=1;i<n;i++){
            postmax[i]=postmax[i-1]*nums[i-1];
        }
        int suffix=1;
        for(int i=n-1;i>=0;i--){
           postmax[i] *= suffix;
           suffix=suffix*nums[i];
        }
        return postmax;
    }
}