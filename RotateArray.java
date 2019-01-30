class Solution {
    public void rotate(int[] nums, int k) {
        int[] temp = new int[nums.length] ;
        int l = nums.length;
        for (int j=0;j<k;j++){
        for(int i=0; i<nums.length;i++){
        if(i==l-1)
            temp[0]=nums[i];
         else
             temp[i+1]=nums[i];
        }
            for(int i=0;i<l;i++)
                nums[i]=temp[i];
        }
           }
}