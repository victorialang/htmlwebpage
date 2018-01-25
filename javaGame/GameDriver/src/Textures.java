
import java.awt.*;
import javax.swing.*;
/**
 * Textures class creates the sand and seaweed
 * @author Victoria Lang
 * Created 27 April 2015
 */
public class Textures extends JPanel {
	private JFrame myFrame;
	/**
	 * Default constructor
	 */
	public Textures() {	
	}
	
	public void initialize() {
		myFrame = new JFrame();
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setSize(600, 600);
		myFrame.setVisible(true);
	}
	/**
	 * The method to invoke in the test driver that refers to the paintComponent method
	 */
	public void drawing() {
		repaint();
	}
	
	/**
	 * This paints the sand and seaweed and adds in the previous world
	 */
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		for(int i = 0; i < 700; i+=7) {
			g.setColor(Color.BLACK);
			g.fillRect(i, 535, 6, 6);
			g.setColor(new Color(255,211,155));
			g.fillRect(i, 536, 5, 5);
		}
		for(int i = 0; i < 700; i+=7) {
			g.setColor(Color.BLACK);
			g.fillRect(i, 542, 6, 6);
			g.setColor(new Color(244,164,96));
			g.fillRect(i, 543, 5, 5);
		}
		for(int i = 0; i < 700; i+=7) {
			g.setColor(Color.BLACK);
			g.fillRect(i, 549, 6, 6);
			g.setColor(new Color(255,165,79));
			
			g.fillRect(i, 550, 5, 5);
		}
		for(int i = 0; i < 700;i+=7) {
			g.setColor(Color.BLACK);
			g.fillRect(i, 556, 6, 6);
			g.setColor(new Color(238,154,73));
			g.fillRect(i, 557, 5, 5);
		}
		for(int i = 0; i < 700; i+=7) {
			g.setColor(Color.BLACK);
			g.fillRect(i, 563, 6, 6);
			g.setColor(new Color(210,105,30)); 
			g.fillRect(i, 564, 5, 5);
		}
		for(int i = 0; i < 700; i+=7) {
			g.setColor(Color.BLACK);
			g.fillRect(i, 570, 6, 6);
			g.setColor(new Color(139,69,19));
			g.fillRect(i, 571, 5, 5);
		}
		//LAST ROW DOESNT SHOW ENTIRELY 
		for(int i = 0; i < 700; i+=7) {
			g.setColor(Color.BLACK);
			g.fillRect(i, 577, 6, 6);
			g.setColor(new Color(139,69,19));
			g.fillRect(i, 578, 5, 5);
		}
		//break one
		for(int i = 0; i < 10; i++) {
//			g.setColor(Color.BLACK);
//			g.fillOval(499, 500+i, 12, 12);
			g.setColor(new Color(112,219,147));
			g.fillOval(515, 515+i, 10, 10);
		}
		for(int i = 0; i < 10; i++) {
			g.setColor(new Color(112, 219, 147));
			g.fillOval(510, 505+i, 10, 10);
		}
		for(int i = 0; i < 10; i++) {
			g.setColor(new Color(112, 219, 147));
			g.fillOval(515, 495+i, 10, 10);
		}
		//break two
		for(int i = 0; i < 10; i++) {
			g.setColor(new Color(46,139,87));
			g.fillOval(415, 515+i, 10, 10);
		}
		for(int i = 0; i < 10; i++) {
			g.setColor(new Color(46,139,87));
			g.fillOval(410, 505+i, 10, 10);
		}
		for(int i = 0; i < 10; i++) {
			g.setColor(new Color(46,139,87));
			g.fillOval(415, 495+i, 10, 10);
		}
		//break three
		for(int i = 0; i < 10; i++) {
			g.setColor(new Color(0,100,0));
			g.fillOval(215, 515+i, 10, 10);
		}
		for(int i = 0; i < 10; i++) {
			g.setColor(new Color(0,100,0));
			g.fillOval(210, 505+i, 10, 10);
		}
		for(int i = 0; i < 10; i++) {
			g.setColor(new Color(0,100,0));
			g.fillOval(215, 495+i, 10, 10);
		}
		//break four
		for(int i = 0; i < 10; i++) {
			g.setColor(new Color(34,139,34));
			g.fillOval(350, 515+i, 10, 10);
		}
		for(int i = 0; i < 10; i++) {
			g.setColor(new Color(34,139,34));
			g.fillOval(355, 505+i, 10, 10);
		}
		for(int i = 0; i < 10; i++) {
			g.setColor(new Color(34,139,34));
			g.fillOval(350, 495+i, 10, 10);
		}
		//break 5 46,139,87
		for(int i = 0; i < 10; i++) {
			g.setColor(new Color(46,139,87));
			g.fillOval(170, 515+i, 10, 10);
		}
		for(int i = 0; i < 10; i++) {
			g.setColor(new Color(46,139,87));
			g.fillOval(175, 505+i, 10, 10);
		}
		for(int i = 0; i < 10; i++) {
			g.setColor(new Color(46,139,87));
			g.fillOval(170, 495+i, 10, 10);
		}
		// break 6
		for(int i = 0; i < 10; i++) {
			g.setColor(new Color(0,128,0));
			g.fillOval(215, 515+i, 10, 10);
		}
		for(int i = 0; i < 10; i++) {
			g.setColor(new Color(0,128,0));
			g.fillOval(210, 505+i, 10, 10);
		}
		for(int i = 0; i < 10; i++) {
			g.setColor(new Color(0,128,0));
			g.fillOval(215, 495+i, 10, 10);
		}
		//break 7
		for(int i = 0; i < 10; i++) {
			g.setColor(new Color(0,238,118));
			g.fillOval(70, 515+i, 10, 10);
		}
		for(int i = 0; i < 10; i++) {
			g.setColor(new Color(0,238,118));
			g.fillOval(75, 505+i, 10, 10);
		}
		for(int i = 0; i < 10; i++) {
			g.setColor(new Color(0,238,118));
			g.fillOval(70, 495+i, 10, 10);
		}
		//break 8 (middle of screen)
		for(int i = 0; i < 10; i++) {
			g.setColor(new Color(105,139,34));
			g.fillOval(310, 515+i, 10, 10);
		}
		for(int i = 0; i < 10; i++) {
			g.setColor(new Color(105,139,34));
			g.fillOval(315, 505+i, 10, 10);
		}
		for(int i = 0; i < 10; i++) {
			g.setColor(new Color(105,139,34));
			g.fillOval(310, 495+i, 10, 10);
		}
		//break 9 
		for(int i = 0; i < 10; i++) {
			g.setColor(new Color(110,139,61));
			g.fillOval(10, 515+i, 10, 10);
		}
		for(int i = 0; i < 10; i++) {
			g.setColor(new Color(110,139,61));
			g.fillOval(15, 505+i, 10, 10);
		}
		for(int i = 0; i < 10; i++) {
			g.setColor(new Color(110,139,61));
			g.fillOval(10, 495+i, 10, 10);
		}		
	}
}


