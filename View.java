package aiassignment;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class View extends JFrame{
Scanner in =new Scanner(System.in); 
int [][] maze = 
{
  {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
  {1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
  {1,0,1,0,0,0,1,0,1,1,1,1,0,1,0,0,0,1,0,1,0,1,1,0,1,1},
  {1,0,0,0,1,1,1,0,0,1,0,1,0,1,0,0,0,0,0,0,0,1,0,0,1,1},
  {1,0,1,0,0,1,0,0,1,1,0,1,0,1,0,1,0,1,1,1,0,0,0,0,0,1},
  {1,0,1,0,1,1,1,0,0,0,0,1,0,0,0,1,0,1,0,0,1,0,1,0,1,1},
  {1,0,1,0,1,0,0,0,1,1,1,1,0,1,0,1,0,1,0,0,0,0,0,0,1,1},
  {1,0,1,0,0,1,1,0,1,0,1,1,0,1,0,1,0,1,0,1,0,1,1,0,0,1},
  {1,0,1,1,0,0,1,0,0,0,0,1,0,1,0,0,0,1,0,1,0,0,1,0,0,1},
  {1,1,0,0,1,0,0,0,0,1,0,0,0,1,0,1,1,1,1,1,1,0,1,0,1,1},
  {1,1,0,1,0,0,1,0,1,1,0,1,0,1,1,0,0,0,0,0,0,0,1,0,1,1},
  {1,0,0,0,0,1,1,0,1,1,0,0,0,1,1,0,1,0,1,0,1,0,0,0,1,1},
  {1,0,1,1,0,0,1,0,0,0,1,1,0,1,0,0,1,0,0,0,0,0,1,0,0,1},
  {1,1,0,0,1,0,0,1,0,0,0,0,0,1,0,1,1,1,0,1,0,1,1,1,0,1},
  {1,1,1,0,1,0,0,0,0,1,1,1,0,1,0,0,1,0,0,1,0,1,1,1,0,1},
  {1,0,0,0,1,1,0,1,0,0,0,0,0,1,1,0,0,0,0,0,1,0,0,1,0,1},
  {1,0,1,0,1,0,0,1,0,1,1,1,0,1,0,0,1,1,1,0,1,1,0,1,0,1},
  {1,0,1,0,0,0,0,0,0,0,1,0,0,1,1,0,0,0,0,0,0,0,0,1,0,1},
  {1,0,1,1,1,1,0,1,1,0,1,0,0,1,1,1,1,0,1,1,0,1,1,1,0,1},
  {1,0,0,1,0,0,0,0,0,0,1,0,0,1,0,0,1,0,1,1,0,1,0,0,9,1},
  {1,1,0,1,0,1,0,1,1,0,1,1,0,1,1,0,1,0,1,0,0,1,0,1,1,1},
  {1,0,0,0,0,1,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1,0,1},
  {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}

}; 
    
//    int [][] maze = 
//{
//            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
//            {1,0,0,0,0,0,0,0,1,0,1,0,1,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,1,0,0,0,0,0,1,0,1},
//            {1,0,1,1,1,1,1,1,1,0,1,0,1,1,1,0,1,0,1,1,1,0,1,1,1,0,1,1,1,1,1,1,1,0,1,0,1},
//            {1,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,1,0,1,0,0,0,0,0,1,0,0,0,0,0,1,0,1,0,0,9,1},
//            {1,1,1,1,1,0,1,1,1,1,1,0,1,1,1,0,1,0,1,0,1,0,1,1,1,0,1,1,1,1,1,0,1,0,1,1,1},
//            {1,0,0,0,1,0,1,0,1,0,1,0,0,0,1,0,1,0,1,0,1,0,0,0,1,0,1,0,0,0,1,0,1,0,0,0,1},
//            {1,0,1,1,1,0,1,0,1,0,1,0,1,1,1,0,1,1,1,1,1,0,1,1,1,0,1,0,1,1,1,0,1,1,1,0,1},
//            {1,0,0,0,0,0,0,0,1,0,0,0,0,0,1,0,0,0,1,0,0,0,1,0,0,0,0,0,1,0,1,0,1,0,0,0,1},
//            {1,1,1,0,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,0,1,1,1,0,1,1,1,0,1,0,1,0,1,0,1} 
//};
//  int [][] maze = 
//{  
//  {1,1,1,1,1,1,1,1,1,1,1,1,1},
//  {1,0,1,0,1,0,1,0,0,0,0,0,1},
//  {1,0,1,0,0,0,1,0,1,1,1,0,1},
//  {1,0,0,0,1,1,1,0,0,0,0,0,1},
//  {1,0,1,0,0,1,0,0,1,1,1,0,1},
//  {1,0,1,0,1,1,1,0,1,0,0,0,1},
//  {1,0,1,0,1,0,0,0,1,1,1,9,1},
//  {1,0,1,0,1,1,1,0,1,0,1,0,1},
//  {1,0,0,0,0,0,0,0,0,0,1,0,1},
//  {1,0,0,0,0,0,0,0,0,0,1,0,1},
//  {1,0,0,0,0,0,0,0,0,0,1,0,1},
//  {1,1,1,1,1,1,1,1,1,1,1,1,1}
//
//};    
    //private java.util.List<Integer> path = new ArrayList<Integer>();
    ArrayList<Integer> path = new ArrayList<Integer>();
    ArrayList<Integer> notpath = new ArrayList<Integer>();
    
    private int pathIndex;
    private int pathIndex1;
    
    public View(){
        
        setTitle("Simple MAze Solver");
        setSize(800,700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        System.out.println("Choose the source Vertex\n 1. Source(1,1)\n 2. Source(1,21)\n 3. Source(1,15)");
        int choice=in.nextInt();
        
        switch(choice)
        {
            
            case 1:
                    DepthFirst.searchPath(maze, 1,1, path,notpath);
                    break;
            case 2:
                    DepthFirst.searchPath(maze, 1,21, path,notpath);
                    break;
            case 3: 
                    DepthFirst.searchPath(maze, 1,15, path,notpath);
                    break;
            default:
                System.out.println("INCORRECT INPUT");
        }
        pathIndex = path.size() - 2;
        pathIndex1= notpath.size()-2;
        for(int i=0;i<path.size();i=i+2)
        {
            System.out.println("["+path.get(i)+" , "+path.get(i+1)+"]");
        }
        for(int i=0;i<notpath.size();i=i+2)
        {
            System.out.println("["+notpath.get(i)+" , "+notpath.get(i+1)+"]");
        }
        
        //System.out.println(path);
        
        
    }
    @Override
    public void paint(Graphics g){
        super.paint(g);
        
        for(int row = 0; row<maze.length; row++){
            
            for (int col = 0; col<maze[0].length; col++){
                Color color;
//                if(row==24 && col==19)
//                {
//                color=Color.MAGENTA;
//                g.setColor(color);
//                g.fillRect(30 * col, 30 * row , 30, 30);
//                }
                
                switch (maze[row][col]){
                    case 1 : 
                        
                        color = Color.BLUE;
                        
                        break;
                    case 9 : color = Color.RED;
                        break;
                    default : color = Color.WHITE;
                        break;
                    }
                
                g.setColor(color);
                g.fillRect(30 * col, 30 * row , 30, 30);
                g.setColor(Color.BLACK);
                g.drawRect(30 * col, 30 * row , 30, 30);
                
            }
        }
        
        for (int p = 0; p<path.size(); p = p+2){
            
            int pathX = path.get(p);
            int pathY = path.get(p+1);
            //System.out.println("pathX"+pathX+"pathY="+pathY);
            g.setColor(Color.GREEN);
            g.fillRect(pathX*30, pathY*30, 30, 30);
        }
        
        int pathX = path.get(pathIndex);
        int pathY = path.get(pathIndex + 1);
        g.setColor(Color.RED);
        g.fillOval(pathX * 30, pathY * 30, 30, 30);
        
        for (int p = 0; p<notpath.size(); p = p+2){
            
            int pathX1 = notpath.get(p);
            int pathY1 = notpath.get(p+1);
            //System.out.println("pathX"+pathX1+"pathY="+pathY1);
            g.setColor(Color.MAGENTA);
            g.fillRect(pathX1*30, pathY1*30, 30, 30);
        }
//        int pathX1 = notpath.get(pathIndex1);
//        int pathY1 = notpath.get(pathIndex1 + 1);
//        g.setColor(Color.MAGENTA);
        //g.fillOval(pathX1 * 30, pathY1 * 30, 30, 30);
    }
    
    protected void processKeyEvent(KeyEvent ke){
            if (ke.getID() != KeyEvent.KEY_PRESSED){
                return;
            }
            if (ke.getKeyCode() == KeyEvent.VK_RIGHT){
                pathIndex = pathIndex - 2;
                if(pathIndex < 0){
                    pathIndex = 0;
                }
            }
            else if( ke.getKeyCode() == KeyEvent.VK_LEFT){
                pathIndex = pathIndex + 2;
                if (pathIndex > path.size() - 2){
                    pathIndex = path.size() - 2;
                    
                }
            }
            repaint();
    }
            
            
            
            
    public static void main(String[] args){
        
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run(){
                View view = new View();
                view.setVisible(true);
            }
        });
    }
}
