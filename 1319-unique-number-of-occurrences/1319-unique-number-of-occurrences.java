class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        if(arr.length==0){
            return false;
        }
        Map<Integer, Integer> m=new HashMap<>();
        for(int num:arr){
            if(m.containsKey(num)){
                m.put(num, m.get(num)+1);
            }
            else{
                m.put(num,1);
            }
        }
        Set<Integer> s=new HashSet<>(m.values());
        if(m.size()==s.size()){
            return true;
        }
        return false;
    }
}