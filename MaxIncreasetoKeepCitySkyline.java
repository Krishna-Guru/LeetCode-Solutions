class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int sum = 0;
        int sum1 = 0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0; j<grid.length ; j++)
               sum+=grid[i][j];
        }
        
        
        
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                 int g =grid[i][j];
                 int r = grid[i][j];
                 int c = grid[i][j] ; 
                for(int k=0;k<grid.length;k++){
                    if(grid[i][k] > r)
                        r=grid[i][k]; 
                }
                for(int l=0;l<grid.length;l++){
                    if(grid[l][j] > c)
                        c=grid[l][j]; 
                }
                if(c>r)
                    grid[i][j] = r;
                else
                    grid[i][j] = c;
            }
        }
        
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0; j<grid.length ; j++)
               sum1+=grid[i][j];
        }
        
        return sum1-sum;
    }
}