/**
 * This is the point class
 * It is defined by an x and y
 * @author lang, mather, sandoval, yates
 */
public class Point {
	/**
	 * Instance variables
	 */
	int myX;
	int myY;
	/**
	 * Constructor
	 * @param x - an X coordinate
	 * @param y - a Y coordinate
	 */
	public Point(int x, int y){
		myX = x;
		myY = y;
	}
	/**
	 * Getter method for X and Y coordinates
	 * @return the coordinates
	 */
	public int getX(){
		return myX;
	}
	public int getY(){
		return myY;
	}
	/**
	 * toString method that converts x and y coordinates
	 */
	public String toString(){
		return "" + myX + myY;
	}
}
