package maze.solver;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class App {
    JFrame frame;
    public App(){
        frame=new JFrame();
       frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.blue);
        frame.setBounds(50, 50, 780, 600);
        frame.setTitle("MazeSolver");
        Maze m=new Maze();
        m.setBounds(5, 5, 600,500);
        frame.add(m);
        frame.setVisible(true);
        frame.setResizable(false);
        // frame.pack();
    }
}
