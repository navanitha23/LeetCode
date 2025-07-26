class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer>s1 = new HashSet<>();
        Set<Integer>s2 = new HashSet<>();
        for(int i = 0; i< nums1.length; i++){
            s1.add(nums1[i]);
        }
        for(int j = 0; j< nums2.length;j++){
            s2.add(nums2[j]);
        }
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp1 = new ArrayList<>();
        for(int val:s1){
            if(!(s2.contains(val))){
                temp1.add(val);
            }
        }
        ans.add(temp1);
        List<Integer> temp2 = new ArrayList<>();
        for(int val:s2){
            if(!(s1.contains(val))){
                temp2.add(val);
            }
        }
        ans.add(temp2);
        return ans;
    }
}