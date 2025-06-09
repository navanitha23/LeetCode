class Solution {
    public int[] sortArray(int[] nums) {
        int n=nums.length;
        int idx=0;
        int res[]=new int[n];
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int val:nums){
            pq.add(val);
        }
        while(!pq.isEmpty()){
            res[idx++]=pq.poll();
        }
        return res;
    }
}