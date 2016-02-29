package alg;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class AlgoStar {

	public static JFrame sFrame;
	/**
     * @param args the command line arguments
     */
	public static void main(String[] args){
		int width  = 693;
        int height = 545;
        sFrame = new JFrame("Trajectoire");
        sFrame.pack();
        sFrame.setResizable(false);
     // the form is located in the center of the screen
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double screenWidth = screenSize.getWidth();
        double ScreenHeight = screenSize.getHeight();
        int x = ((int)screenWidth-width)/2;
        int y = ((int)ScreenHeight-height)/2;
 
        sFrame.setLocation(x,y);
        sFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        sFrame.setVisible(true);
		
	}
	
	// test 1
}
