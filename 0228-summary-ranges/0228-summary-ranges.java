class Solution {
    public List<String> summaryRanges(int[] nums) {
         List<String> result=new ArrayList<>();
        if(nums.length==0)
        {
            return result;
        }
        int i=0;
        int j=0;
        while(j<nums.length)
        {   
            if(j<nums.length-1 && nums[j+1]==nums[j]+1)
            {
                j++;
            }
            else
            {   if(i==j)
                {   
                    result.add(Integer.toString(nums[i]));
                }
                else{
                    result.add(nums[i]+"->"+nums[j]);
                }
                j++;
                i=j;
            }
        }
        return result;
    }
    }