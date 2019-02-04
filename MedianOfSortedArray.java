class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double median=0;
        ArrayList<Integer> al = new ArrayList<Integer>();
        for(int i=0;i<nums1.length;i++)
            al.add(nums1[i]);
        for(int i=0;i<nums2.length;i++)
            al.add(nums2[i]);
      Collections.sort(al);
        if(al.size()%2==0)
        {
            int a = al.get(al.size()/2);
            int b = al.get((al.size()/2)-1);
            median = (a+b)/2.0;
            return median;
        }
        else{
            median =al.get(al.size()/2);
            return median;
        }
        
    }
}