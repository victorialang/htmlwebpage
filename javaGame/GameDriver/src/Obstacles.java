/**
 * This is the obstacles class that defines an obstacle
 * It contains many getters
 * @author lang, mather, sandoval, yates
 */
public class Obstacles {
	/**
	 * Instance variables
	 */
	private int myRightX;
	private int myLeftX;
	private int myTopY;
	private int myBotY;
	private Point myTopRightCord = new Point(myRightX, myTopY); 
	private Point myTopLeftCord = new Point (myLeftX, myTopY);
	private Point myBotLeftCord = new Point(myLeftX, myBotY);
	private Point myBotRightCord = new Point(myRightX, myBotY);
	private int myWidth;
	private int myHeight;
	/**
	 * Obstacle constructor
	 * @param x - an X value
	 * @param y - a Y value
	 * @param width - the width
	 * @param height - the height
	 */
	public Obstacles(int x, int y , int width , int height){
		myWidth = width;
		myHeight = height;
		myLeftX = x;
		myTopY = y;
		myRightX = myLeftX + width;
		myBotY = myTopY + height;
	}
	/**
	 * Getter methods for x and y coordinates, and height/width
	 * @return the coordinates or width/height
	 */
	public int getMyRightX() {
		return myRightX;
	}
	public int getMyLeftX() {
		return myLeftX;
	}
	public int getMyTopY() {
		return myTopY;
	}
	public int getMyBotY() {
		return myBotY;
	}
	public int getMyHeight() {
		return myHeight;
	}
	public int getMyWidth() {
		return myWidth;
	}
}
