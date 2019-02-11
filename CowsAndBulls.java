class Solution {
    public String getHint(String secret, String guess) {
        int cows = 0;
        int bulls = 0;
        String t="";
        String t2="";
        
        String f="";
        for(int i=0; i<secret.length();i++)
        {
            String s = String.valueOf(secret.charAt(i));
            String g = String.valueOf(guess.charAt(i));
            if(s.equals(g))
            {   
                bulls++;
            }
            else 
            {t+=g;
                t2+=s;}
        }
        
        
        Stack<String> stack = new Stack<>();
        for(int i=0;i<t2.length();i++){
            String g = String.valueOf(t2.charAt(i));
            stack.push(g);     
        }
        
        for(int i=0;i<t.length();i++)
        {
            String g = String.valueOf(t.charAt(i));
            if(stack.contains(g))
            {
                cows++;
            stack.remove(g);
            }
            }
        
        f=bulls+"A"+cows+"B";
        return f;
    }
}