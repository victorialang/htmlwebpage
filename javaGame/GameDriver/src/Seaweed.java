import java.awt.*;
/**
 * Seaweed class that creates seaweed to be drawn on the screen
 * @author Lang
 * April 27, 2014
 */
public class Seaweed  {
	/**
	 * Instance variables 
	 */
	private Color myColor;
	private int myX;
	private int myY;
	private Levels myLevels;

	/**
	 * Seaweed constructor
	 * @param aColor - a color
	 * @param x - a X coordinate
	 * @param y - a Y coordinate
	 * @param aLevel - a Level
	 */
	public Seaweed(Color aColor, int x, int y, Levels aLevel) {
		myColor = aColor;
		myX = x;
		myY = y;
		myLevels = aLevel;
	}
	/**
	 * Seaweed is drawn using the current level
	 * It uses 'g' from the level, so invoking the method will draw the seaweed
	 */
	public void drawSeaweed() {
		Graphics g = myLevels.getG();
		for(int i = 0; i < 10; i++) {
			g.setColor(myColor);
			g.fillOval(myX, (myY+i), 10, 10);
		}
		for(int i = 0; i < 10; i++) {
			g.setColor(myColor);
			g.fillOval(myX + 5, ((myY + 10) + i), 10, 10);
		}
		for(int i = 0; i < 10; i ++) {
			g.setColor(myColor);
			g.fillOval(myX, ((myY + 20) + i), 10, 10);
		}
	}
}