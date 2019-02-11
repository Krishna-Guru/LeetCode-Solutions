class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0)
            return 0;
        ArrayList<Integer> al = new ArrayList<>();
        int count=0;
        int temp = nums[0];
        for(int i=0;i<nums.length;i++)
        {
            if((nums[i])!=temp)
                count=0;
            if(count<2)
        {
            al.add(nums[i]);
                temp=nums[i];
                count++;
        }   
           
        }
        for(int i=0;i<al.size();i++)
          nums[i]=al.get(i);
        return al.size();
    }
}