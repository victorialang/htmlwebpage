import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
/**
 * Main antagonist - Kevin Bacon
 * Class contains many getters and one method to move Bacon
 * @author lang, mather, sandoval, yates
 *
 */

public class KevinBacon {
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
	private int myFallingSpeed;
	private Player thePlayer;

	/**
	 * Bacon constructor
	 * @param x - an X value
	 * @param y - a y value
	 * @param width - the width
	 * @param height - the height
	 * @param aPlayer - the player it is following
	 */
	public KevinBacon(int x, int y, int width, int height, Player aPlayer){
		myWidth = width;
		myHeight = height;
		myLeftX = x;
		myTopY = y;
		myRightX = myLeftX + width;
		myBotY = myTopY + height;
		myWidth = width;
		myHeight = height;
		thePlayer = aPlayer;
	}
	/**
	 * This method moves Bacon across the screen
	 */
	public void move(){
		if(this.seesPlayer()){
			this.setCords((thePlayer.getMyLeftX() - myLeftX) /4 , (thePlayer.getMyTopY() - myTopY) / 10);
		}
	}
	/**
	 * This method checks to see if Bacon sees a player within 100 distance of him
	 * @return boolean value of true or false, true if bacon sees the player
	 */
	public boolean seesPlayer(){
		if(this.getMyLeftX() - thePlayer.getMyLeftX() < 100){
			return true;
		}
		return false;
	}
	/**
	 * Moves image to the end 
	 * The x coordinates are adjusted here
	 * @param theImage - a buffered image of KBacon
	 */
	public void moveEnd(BufferedImage theImage){
		myLeftX = myLeftX - 1;
		myRightX = myRightX - 1;
	}

	/**
	 * Getters for x and y coordinates, height and width
	 * @return the coordinate or height/width
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
	public int getHeight(){
		return myHeight;
	}
	public int getWidth(){
		return myWidth;
	}
	public void setCords(int x, int y ){
		myLeftX = myLeftX + x;
		myRightX = myRightX + x;
		myTopY = myBotY + y;
		myBotY = myTopY + y;
	}
	public int getMovingSpeed() {
		return myMovingSpeed;
	}
	public int getFallingSpeed() {
		return myFallingSpeed;
	}
	/**
	 * This sets the speeds of moving and falling
	 * @param mySpeed - an integer value of speed
	 */
	public void setMovingSpeed(int mySpeed) {
		myMovingSpeed = mySpeed;
	}

	public void setFallingSpeed(int mySpeed) {
		myFallingSpeed = mySpeed;
	}




	/**
	 * Loads an image from a file
	 * @param FileName - the name of a file
	 * @return a buffered image
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
