class Solution {
    public boolean isPalindrome(String s) {
        
        String[] sa = s.split("");
        String word="";
        String word1="";
        Stack<String> st = new Stack<>();
        ArrayList<String> al = new ArrayList<>();
        for(int i=0;i<sa.length;i++){
        if(sa[i].matches("^[a-zA-Z0-9]*$"))
            al.add(sa[i].toUpperCase());
       
        }
        for(int i=0;i<al.size();i++)
        {
            st.push(al.get(i));
            word+=al.get(i); 
        }        
        while(!st.isEmpty()){
            word1+=st.pop();
        }
        if(word.equals(word1))
            return true;
        else
            return false;
    }
    
    
}