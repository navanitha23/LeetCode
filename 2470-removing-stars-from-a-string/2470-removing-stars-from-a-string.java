class Solution {
    public String removeStars(String s) {
        Stack<Character> str=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch !='*'){
                str.push(ch);
            }
            else{
                str.pop();
            }
        }
        StringBuilder sb=new StringBuilder();
        while(! str.isEmpty()){
            sb.append(str.pop());
        }
        return sb.reverse().toString();
    }
}