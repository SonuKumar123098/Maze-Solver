package maze.solver;

import java.util.List;

public class DepthFirstSearch {
    public static boolean searchPath(int[][] grid,int x,int y,List<Integer>path){
        if(grid[x][y]==9){
            path.add(x);
            path.add(y);
            return true;
        }
        if(grid[x][y]==0){
            grid[x][y]=2;
            int dx=1; int dy=0;
            if(searchPath(grid,x+dx,y+dy,path)){
                path.add(x);
                path.add(y);
                return true;
            }
            dx=0;dy=1;
            if(searchPath(grid,x+dx,y+dy,path)){
                path.add(x);
                path.add(y);
                return true;
            }
            dx=0; dy=-1;
            if(searchPath(grid,x+dx,y+dy,path)){
                path.add(x);
                path.add(y);
                return true;
            }
            dx=-1; dy=0;
            if(searchPath(grid,x+dx,y+dy,path)){
                path.add(x);
                path.add(y);
                return true;
            }
        }
        return false;
    }
}
