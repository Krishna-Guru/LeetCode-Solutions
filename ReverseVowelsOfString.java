class Solution {
    public String reverseVowels(String s) {
        String vowels = "";
        String newword = "";
        int count = 0;
        for(int i=0;i<s.length();i++)
        {
                                                                        if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'
        ||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'
        ||s.charAt(i)=='O'||s.charAt(i)=='U')
            {
            newword+="*";
            vowels+=String.valueOf(s.charAt(i));
            count++;
            }
            else
                newword+=String.valueOf(s.charAt(i));
            
        } 
        s="";
        for(int i=0;i<newword.length();i++)
        {
            if(newword.charAt(i)=='*'){
             String a = String.valueOf(vowels.charAt(count-1));
                s+=a;
            count--;
            }   
            else
                s+=String.valueOf(newword.charAt(i));
        }
        
        return s;
    }
}