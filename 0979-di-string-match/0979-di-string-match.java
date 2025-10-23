class Solution {
    public int[] diStringMatch(String s) 
    {
        int[] result=new int[s.length()+1];
        int leftindex=0;
        int rightindex=s.length();
        int index=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='I')
            {
                result[index]=leftindex;
                index++;
                leftindex++;
            }
            else
            {
                result[index]=rightindex;
                index++;
                rightindex--;
            }
        }
         if(s.charAt(s.length()-1)=='I')
         {
            result[index]=leftindex;
         }
          else 
          {
            result[index]=rightindex;
          }
          return result;
    }
}