class Solution {
    public int numUniqueEmails(String[] emails) {
        int count = 0;
        int flag = 0;
        ArrayList<String> al = new ArrayList<>();
        for(int i=0;i<emails.length;i++)
        {
            flag = 0;
            String word="";
            String[] mail = emails[i].split("@");
            for(int k=0;k<mail[0].length();k++){
                String temp = String.valueOf(mail[0].charAt(k));
                if(temp.equals("."))
                    word+="";
                else if(temp.equals("+"))
                    break;
                else
                    word+=temp;
            }
            
    
        
        System.out.println(word);
            for(int j=0;j<al.size();j++)
            {
                String[] check = al.get(j).split("@");
                if(word.equals(check[0]) && mail[1].equals(check[1])){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                count++;
            al.add(word+"@"+mail[1]);
            }}
    return count;    
    }
    }