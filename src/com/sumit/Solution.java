package com.sumit;

public class Solution {
	/*
	 * We can use dfs or bfs algorithm in this case as we need to see adjacent
	 * element as well according to problem.
	 * 
	 * 
	 */
   public static int numIslands(char[][] grid) {
        
        if(grid==null || grid.length==0){
            return 0;
        }
        
        int numberOfIsland = 0;
            
        for(int i=0;i<grid.length;i++)
        {
          for(int j=0;j<grid[i].length;j++) 
          {
              if(grid[i][j]=='1')
              {  
                  numberOfIsland = numberOfIsland + dfs(grid,i,j);
              }
          }  
        }    
        
        return numberOfIsland;
    }
    
    private static int dfs(char[][]grid, int i, int j)
    {
        if(i<0 || i >= grid.length || j <0 || j>=grid[i].length || grid[i][j]=='0')
        {
            return 0;
        }
        
        grid[i][j]='0';
        
        System.out.println(dfs(grid,i+1,j));//down
        
        System.out.println(dfs(grid,i-1,j)); //up
        
        System.out.println(dfs(grid,i,j+1)); //right
        
        System.out.println(dfs(grid,i,j-1)); //left
        return 1;
    }
    
    public static void main(String[] args) {
    	char grid[][] = {
    			{'1','1','1','1','0'},
    			{'1','1','0','1','0'},
    			{'1','1','0','0','0'},
    			{'0','0','0','0','0'}
    	};
    	
    	char grid2[][] = {
    			{'1','1','0','0','0'},
    			{'1','1','0','0','0'},
    			{'0','0','1','0','0'},
    			{'0','0','0','1','1'}
    	};
    	
    	System.out.println(Solution.numIslands(grid2));
	}

}
