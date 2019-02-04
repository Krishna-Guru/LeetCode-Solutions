class Solution {
    public boolean isIsomorphic(String s, String t) {
        String word = "";
        int count=0;
        int count1=0;
        Set<String> set = new HashSet<>();
        Set<String> set1 = new HashSet<>();
        if(s.length()!=t.length())
            return false;
        else {
            String[] temp=s.split("");
            String[] temp1=t.split("");
            HashMap<String, String> hmap = new HashMap<String, String>();
            for(int i=0;i<s.length();i++){
                hmap.put(temp[i],temp1[i]); 
            }
            
            for(String name: temp){
                if(set.add(name) == false)
                    count++;
                }
                 
            for(String name: temp1){
                if(set1.add(name) == false)
                    count1++;
                } 
            if(count1!=count)
                return false;
            
            for(int i=0;i<s.length();i++)
                word+= hmap.get(temp[i]);

            if(t.equals(word))
                return true;
            else
                return false;
        }
    }
}