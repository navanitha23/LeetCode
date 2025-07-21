class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Boolean> m=new HashMap<>();
        for(int i:nums){
            if(m.containsKey(i)){
                return true;
            }
        m.put(i,true);
        }
        return false;
    }
}