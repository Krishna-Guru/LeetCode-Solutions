class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>() ;
        
        for(int i=0;i<tokens.length;i++){
            if(tokens[i].equals("+")||tokens[i].equals("-")||tokens[i].equals("*")||tokens[i].equals("/"))
            {
                int a = Integer.parseInt(stack.pop());
                int b = Integer.parseInt(stack.pop());
                int c =0;
                if(tokens[i].equals("+"))
                    c=b+a;
                else if(tokens[i].equals("-"))
                    c=b-a;
                else if(tokens[i].equals("*"))
                    c=b*a;
                else if(tokens[i].equals("/"))
                    c=b/a;
                stack.push(String.valueOf(c));
                    
            }
            else
            stack.push(tokens[i]);
        }
        
        return (Integer.parseInt(stack.pop()));

    }
    
}