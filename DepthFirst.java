package aiassignment;
//package mazesolver;
import java.util.List;
public class DepthFirst {
    
    //If path present, it will return true and 
    //path list will be filled
    //like: {xn,yn........x1,y1} i.e. in inverted order
    
    // here x and y are starting positions
    public static boolean searchPath(int[][] maze, int x, int y,List<Integer> path,List<Integer> notpath){
        
        if(maze[y][x] == 9){            //System.out.println("x="+x+"y="+y);
            path.add(x);
            path.add(y);
            return true;
            
        }
        if(maze[y][x] == 0){
            
            maze[y][x] = 2;
            
            int dx = -1;
            int dy = 0;
            
            if(searchPath(maze , x+dx , y+dy , path,notpath)){
                path.add(x);
                path.add(y);
                return true;
            }
            
            dx = 1;
            dy = 0;
            
            if(searchPath(maze , x+dx , y+dy , path,notpath)){
                path.add(x);
                path.add(y);
                return true; 
            }
            
            dx = 0;
            dy = -1;
            
            if(searchPath(maze , x+dx , y+dy , path,notpath)){
                path.add(x);
                path.add(y);
                return true;
            }
            
            dx = 0;
            dy = 1;
            
            if(searchPath(maze , x+dx , y+dy , path,notpath)){
                path.add(x);
                path.add(y);
                return true;
            }
    
           notpath.add(x);
           notpath.add(y);
            
}  
        return false;
}
}
