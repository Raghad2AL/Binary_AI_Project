package AI_Binary;

import java.awt.Color;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;

import cartesian.coordinate.CCPoint;
import cartesian.coordinate.CCPolygon;
import cartesian.coordinate.CCSystem;
import cartesian.coordinate.CCLine;

public class Main extends JFrame {
    private static final long serialVersionUID = 1L;
    public static CCSystem s = new CCSystem();

    

    Main() {
        super("Viewer");
        setTitle("Viewer");
       // int x,y,z;
        setVisible(true);
        setSize(1000, 600);
        setLocationRelativeTo(null);
       
       //add(s);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
       // double[] x = new double[]{-1,2,0};
       // double[] y = new double[]{-1,-2,3};
      //  CCPolygon ccp = new CCPolygon(x, y);
        
       /* s.add(new CCLine(1.0, 0.0, Color.blue));
        s.add(new CCLine(-1.0, 10.0, Color.magenta));
        s.add(new CCLine(1.0, 5.0, Color.red));
        s.add(new CCLine(-1.0, 5.0, Color.cyan));
        s.add(new CCLine(-1.0, 15.0, Color.yellow));
        s.add(new CCLine(1.0, -5.0, Color.green));
        s.add(new CCLine(1.0, 0.0, 5.0, Color.orange));
        s.add(new CCLine(0.0, 1.0, 5.0, Color.pink));*/
      //  s.add(new CCPoint(x, y,z));
       //s s.add(ccp);
        
       
    }
    public static void main(String[] args) {
        new Main();
    }
}
