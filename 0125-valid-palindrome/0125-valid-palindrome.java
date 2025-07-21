class Solution {
    public boolean isPalindrome(String s) {
        String str=s.toLowerCase();
        String ns=str.replaceAll("[^a-z0-9]","");
        int len=ns.length();
        for(int i=0;i<len/2;i++){
            if(ns.charAt(i) != ns.charAt(len-i-1)){
                return false;
            }
        }
        return true;
    }
}