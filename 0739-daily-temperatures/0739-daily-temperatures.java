class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
      Stack<Integer> stack=new Stack<>();
        int n=temperatures.length;
        int[] result=new int[n];
        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && temperatures[stack.peek()]<temperatures[i]){
                int ans=stack.pop();
                result[ans]=i-ans;
            }
            stack.push(i);
        }

        return result;  
    }
}