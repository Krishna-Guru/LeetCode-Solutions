class Solution {
    public int findDuplicate(int[] nums) {
        
        HashMap<Integer,Integer> hmap = new HashMap<>();
        
        for(int i=0;i<nums.length;i++)
        {
            if(hmap.get(nums[i])==null)
                hmap.put(nums[i],1);
            else
                return nums[i];
        }
        
        
        return 0;
        
    }
}