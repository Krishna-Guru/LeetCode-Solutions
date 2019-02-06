class Solution {
    public boolean isValid(String s) {
        Stack<String> stack = new Stack<>();
        String value ="";
        for(int i=0;i<s.length();i++){
                value=String.valueOf(s.charAt(i));
            
            if(value.equals("(") || value.equals("{") || value.equals("["))
                stack.push(value);
            else
            {
                if(!stack.isEmpty()){
                    
                if(stack.peek().equals("(") && value.equals(")") )
                    stack.pop();
                else if(stack.peek().equals("[") && value.equals("]") )
                    stack.pop();    
                else if(stack.peek().equals("{") && value.equals("}") )
                    stack.pop();
                else
                    return false;
                }
                else
                    return false;
            }
        }
        
        if(stack.isEmpty())
        return true;
        else
            return false;
    }
}