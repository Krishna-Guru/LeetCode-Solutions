class Solution {
    public List<String> summaryRanges(int[] nums) {
       
        ArrayList<String> al = new ArrayList<>();
        String w = "";
        Stack<Integer> stack = new Stack<>();
        if(nums.length==1)
        {
          al.add(String.valueOf(nums[0]));
            return al;
        }
        
        for(int i=0;i<nums.length;i++)
        {
          if(i==0)
          {
              w=w+String.valueOf(nums[i])+",";
              stack.push(nums[i]);
          }
            else{
                
                if(stack.peek()==nums[i]-1)
                { 
                    stack.push(nums[i]);
                   w=w+String.valueOf(nums[i])+",";
                }
                 else
                {
                    al.add(w);
                    stack.clear();
                    w="";
                    w=w+String.valueOf(nums[i])+",";
                    stack.push(nums[i]);
                }
            }
        }
        
        if(!stack.isEmpty())
            al.add(w);
            
            
        ArrayList<String> al2=new ArrayList<>();
        
        String w2="";
        String w2f="";
        String w2l="";
        for(int i=0;i<al.size();i++)
        {
        String[] temp = al.get(i).split(",");   
        if(temp.length>1){
            w=temp[0]+"->"+temp[temp.length-1];
            al2.add(w);
            }
        else
            al2.add(temp[0]);
        }
    
        return al2;
        
    }
}