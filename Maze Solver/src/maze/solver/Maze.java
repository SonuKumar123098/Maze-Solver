package maze.solver;

import java.awt.Color;
import java.awt.Graphics;
import java.util.List;
import java.util.ArrayList;

import javax.swing.JPanel;

public class Maze extends JPanel {
    private int [][]grid={
        {1,1,1,1,1,1,1,1,1,1,1,1,1},
        {1,0,1,0,1,0,1,0,0,0,0,0,1},
        {1,0,1,0,0,0,1,0,1,1,1,0,1},
        {1,0,1,1,1,1,1,0,0,0,0,0,1},
        {1,0,0,1,0,0,0,0,1,1,1,0,1},
        {1,0,1,0,1,1,1,0,1,0,0,0,1},
        {1,0,1,0,1,0,0,0,1,1,1,0,1},
        {1,0,1,0,1,1,1,0,1,0,1,0,1},
        {1,0,0,0,0,0,0,0,0,0,1,9,1},
        {1,1,1,1,1,1,1,1,1,1,1,1,1},
    };
    public List<Integer>path=new ArrayList<>();
    
    @Override
    public void paint(Graphics g) {
        g.translate(190, 150);
      
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                Color color;
                switch(grid[i][j]){
                    case 1:color=Color.BLACK;break;
                    case 0:color=Color.BLUE;break;
                    default:color=Color.RED;
                }
                g.setColor(color);
                g.fillRect(30*j, 30*i, 30, 30);
                g.setColor(Color.RED);
                g.drawRect(30*j, 30*i,30, 30);
            }
        }

        DepthFirstSearch.searchPath(grid,1,1,path);
        for(int i=0;i<path.size();i+=2){
            int X=path.get(i);
            int Y=path.get(i+1);
            System.out.println("X cordinate: "+Y);
            System.out.println("Y cordinate: "+X);
            g.setColor(Color.GREEN);
            g.fillRect(30*Y+1, 30*X+1,20, 20);

        }
    }
    public static void main(String[] args) {
        new App();
    }
}

