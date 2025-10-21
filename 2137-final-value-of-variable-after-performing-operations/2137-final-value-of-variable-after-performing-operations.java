class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int c=0;
        for(String s:operations){
            if(s.charAt(0)=='+' || s.charAt(2)=='+') c++;
            else c--;
        }
        return c;
    }
}