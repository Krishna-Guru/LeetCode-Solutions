class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length()!=t.length())
            return false;
        else 
        {
             ArrayList<Character> al = new ArrayList<>();
            ArrayList<Character> al2 = new ArrayList<>();
             for(int i=0;i<s.length();i++)
            {
                    al.add(s.charAt(i));
                    al2.add(t.charAt(i));
             }
            Collections.sort(al);
            Collections.sort(al2);
            for(int i=0;i<s.length();i++)
            {
                    if(al.get(i)!=al2.get(i))
                        return false;
             }
        }
    return true;
    }
}