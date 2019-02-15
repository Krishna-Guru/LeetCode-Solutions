class Solution {
    public int[] searchRange(int[] nums, int target) {
        int count=0;
        int start =0;
        int[] ret = new int[2];
        for(int i=0;i<nums.length;i++){
            if(nums[i]== target)
                count++;
        }
        if(count == 0)
        {
            ret[0]=ret[1]=-1;
            return ret;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]== target)
            {start=i;
            break;
            }
        }
         
        ret[0]=start;
        ret[1]=start+count-1;
        
        
        
        return ret;
    }
}