class Solution {
    public int longestConsecutive(int[] nums) {
        int count=0;
        int max=0;
        ArrayList<Integer> al = new ArrayList<>();
        Set<Integer> s = new HashSet<Integer>();
        Stack<Integer> stack = new Stack<>();
        for (int x : nums) 
            s.add(x);
        for (int x : s) 
            al.add(x); 
          Collections.sort(al);
        
        for(int i=0;i<al.size();i++)
        {
            if(i==0||al.get(i)==stack.peek()+1){
                
                stack.push(al.get(i));
                    count++;
                if(count>max)
                    max=count;
            }
            else{
                stack.clear();
                    if(count>=max)
                        max=count;
                stack.push(al.get(i));
                count=1;
            }
                
        }
        return max;
    }
}