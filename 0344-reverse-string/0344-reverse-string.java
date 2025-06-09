class Solution {
    public void reverseString(char[] s) {
        StringBuilder str=new StringBuilder();
        for(char i:s){
            str.append(i);
        }
        str.reverse();
        for(int i=0;i<s.length;i++){
           s[i]=str.charAt(i); 
        }
    }
}