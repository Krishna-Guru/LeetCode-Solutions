class Solution {
    public String reverseWords(String s) {
        String[] temp = new String[10000];
        temp=s.split(" ");
        int j=0;
        s ="";
         
        for(int i =0;i<temp.length;i++)
        {
           String rev ="";
            for(j=temp[i].length()-1;j>=0;j--)
            { 
                
                rev+=temp[i].charAt(j); 
            }  
            if(i!=temp.length-1)
            s=s+rev+" ";
            else
                s=s+rev;
          }
        System.out.print(s);
        return s;
    }
  }