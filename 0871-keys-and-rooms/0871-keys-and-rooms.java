class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
       Set<Integer> set =new HashSet<>();
       Queue<Integer> q=new LinkedList<>();
       set.add(0);
       q.add(0);
       while( !q.isEmpty()){
        int ind=q.poll();
        for(int key:rooms.get(ind)){
            if( !set.contains(key)){
                set.add(key);
                q.add(key);
                }
            }
        } 
        return set.size() ==rooms.size();
    }
}