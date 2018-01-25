import java.awt.*;

/**
 * This class creates a collection of rocks
 * @author lang, mather, sandoval, yates
 */

public class Rocks  {
	/**
	 * Instance variables
	 */
	private Levels myLevels;
	private Color myFirstColor;
	private Color mySecondColor;
	private Color myThirdColor;
	private int myX;
	private int myY;

	/**
	 * Rocks constructor
	 * @param x - a X coordinate
	 * @param y - a Y coordinate
	 * @param aLevel - a level
	 */
	public Rocks(int x, int y, Levels aLevel) {
		myX = x;
		myY = y;
		myLevels = aLevel;
	}

	/**
	 * This method draws the rocks using the levels object when invoked
	 */
	public void drawRock() {
		Graphics g = myLevels.getG();
		myFirstColor = new Color(119,136,153);
		mySecondColor = new Color(112,128,144);
		myThirdColor = new Color(108,123,139);
		for(int i = 0; i < 15; i++) {
			g.setColor(myFirstColor);
			g.fillOval(i + myX, myY, 50, 50);
		}
		for(int i = 0; i < 15; i++) {
			g.setColor(mySecondColor);
			g.fillOval(i + myX + 40, myY - 10, 50, 50);
		}
		for(int i = 0; i < 15; i++) {
			g.setColor(myThirdColor);
			g.fillOval(i + myX + 50, myY, 50, 50);
		}
	}
	/**
	 * Getter methods for X and Y coordinates
	 * @return current x and y coordinates 
	 */
	public int getX(){
		return myX;
	}
	public int getY(){
		return myY;
	}	
}