class Solution {
    public int compareVersion(String version1, String version2) {

   String[] v1 = version1.split("\\.");
   String[] v2 =version2.split("\\.");
    int l1 = v1.length;
     int l2 = v2.length;
     if(l1>l2)
     {
         for(int i=0;i<l2;i++)
         {
             int a = Integer.parseInt(v1[i]);
             int b = Integer.parseInt(v2[i]);
             if(a>b)
                 return 1;
             else if(a<b)
                 return -1;
         }
         for(int i=l2;i<l1;i++)
         {
              int a = Integer.parseInt(v1[i]);
             if(a>0)
                 return 1;
         }
         
     }
        else if(l2>l1){
            
         for(int i=0;i<l1;i++)
         {
             int a = Integer.parseInt(v1[i]);
             int b = Integer.parseInt(v2[i]);
             if(a>b)
                 return 1;
             else if(a<b)
                 return -1;
         }
         for(int i=l1;i<l2;i++)
         {
              int a = Integer.parseInt(v2[i]);
             if(a>0)
                 return -1;
         }
            
        }
        else if(l1==l2){
         for(int i=0;i<l2;i++)
         {
             int a = Integer.parseInt(v1[i]);
             int b = Integer.parseInt(v2[i]);
             if(a>b)
                 return 1;
             else if(a<b)
                 return -1;
         }
            
        }
        return 0;
        }
}