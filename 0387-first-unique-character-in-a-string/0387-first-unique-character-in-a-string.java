class Solution {
    public int firstUniqChar(String s) {
        int n=s.length();
        for(int i=0;i<n;i++){
            int c=s.charAt(i);
            if(i==s.indexOf(c) && i==s.lastIndexOf(c))
            return i;
        }
        return -1;
    }
}