import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

/**
 * This is the player class 
 * It defines a player
 * @author lang, mather, sandoval, yates
 *
 */
public class Player {
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
	private int myMovingSpeed;
	private double myFallingSpeed;
	private int myHealth;

	/**
	 * This is the player constructor
	 * @param x - a X coordinate 
	 * @param y - a Y coordinate
	 * @param width - player width
	 * @param height - player height
	 */
	public Player(int x, int y, int width, int height){
		myWidth = width;
		myHeight = height;
		myMovingSpeed = 0;
		myFallingSpeed = 0;
		myLeftX = x;
		myTopY = y;
		myRightX = myLeftX + width;
		myBotY = myTopY + height;
		myHealth = 100;			
	}
	/**
	 * Moves the player to the right 
	 * The coordinates are set by a new moving and falling speed
	 */
	public void moveRight(){
		this.setCords(myMovingSpeed, myFallingSpeed);
	}
	/**
	 * Moves the player to the level 
	 * The coordinates are set by a new moving and falling speed
	 */
	public void moveLeft(){
		this.setCords(myMovingSpeed, myFallingSpeed);
	}
	/**
	 * Moves the player down 
	 * The coordinates are set by a new moving and falling speed
	 */
	public void moveDown(){
		this.setCords(myMovingSpeed, myFallingSpeed);
	}
	/**
	 * Moves the player up 
	 * The coordinates are set by a new moving and falling speed
	 */
	public void moveUp(){
		this.setCords(myMovingSpeed, myFallingSpeed);
	}


	/**
	 * Setter method for the coordinates of the player
	 * @param x - an x coordinate
	 * @param y - a y coordinate
	 * The health and hit - coordinates are also set
	 */
	public void setCords(int x, double y ){
		myLeftX = myLeftX + x;
		myRightX = myRightX + x;
		myTopY = (int) (myTopY + y);
		myBotY = (int) (myBotY + y);
	}
	/**
	 * This sets the health
	 * @param theHealth - an integer value to set the health as
	 */
	public void setHealth(int theHealth) {
		myHealth = theHealth;
	}

	public void setHitCords(int x, int y){
		myLeftX = x;
		myRightX = x + 40;
		myTopY = y;
		myBotY = y + 50;

	}
	public void setStart(int x, int y){
		myLeftX = x;
		myTopY = y;
	}
	/**
	 * Getter methods for speed, x and y (and top/bottom) coordinates, health, width, and height
	 * @return the resulting value
	 */
	public int getMovingSpeed() {
		return myMovingSpeed;
	}
	public void setMovingSpeed(int aSpeed) {
		myMovingSpeed = aSpeed;
	}
	public double getFallingSpeed() {
		return myFallingSpeed;
	}
	public void setFallingSpeed(double aSpeed) {
		myFallingSpeed = aSpeed;
	}
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
	public int getHealth() {
		return myHealth;
	}
	public int getHeight(){
		return myHeight;
	}
	public int getWidth(){
		return myWidth;
	}

	/**
	 * Loads in an image
	 * @param FileName - a specified image name
	 * @return a BufferedImage
	 */
	public BufferedImage loadImageFromFile(String FileName){
		BufferedImage image = null;
		try{
			image = ImageIO.read(new File(FileName));
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
		return image;
	}

}
