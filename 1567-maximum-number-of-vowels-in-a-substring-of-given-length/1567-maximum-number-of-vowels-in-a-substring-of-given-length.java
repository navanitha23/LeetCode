class Solution {
    public boolean isvowel(char s){
        return s=='a'||s=='e'||s=='i'||s=='o'||s=='u';
    }
    public int maxVowels(String s, int k) {
        int c=0;
        int max=0;
        for(int i=0;i<s.length();i++){
            if(isvowel(s.charAt(i)))
            c++;
            if(i>=k && isvowel(s.charAt(i-k)))
            c--;
            max=Math.max(max,c);
        }
        return max; 
    }
}