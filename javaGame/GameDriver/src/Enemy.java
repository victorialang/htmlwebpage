import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
/**
 * this is the enemy class made for the sea creatures 
 * @author joeyates
 *
 */
public class Enemy{
	/**
	 * these are all of the instance variables used for enemies
	 */
	private int myRightX;
	private int myLeftX;
	private int myTopY;
	private int myBotY;
	private int myTopRightCord;
	private int myTopLeftCord;
	private int myBotLeftCord;
	private int myBotRightCord;
	private int myWidth;
	private int myHeight;
	private int myMovingSpeed;

	/**
	 * constructor
	 * @param x
	 * @param y
	 * @param width
	 * @param height
	 */
	public Enemy(int x, int y, int width, int height){
		myWidth = width;
		myHeight = height;
		myMovingSpeed = 0;
		myLeftX = x;
		myTopY = y;
		myRightX = myLeftX + width;
		myBotY = myTopY + height;
		myTopRightCord = x;
		myTopLeftCord = y;
		myBotLeftCord = y;
		myBotRightCord = y;

	}

	/**
	 * get method of the height of the enemies
	 * @return
	 */
	public int getHeight(){
		return myHeight;
	}
	/**
	 * getter for the width of the enemies
	 * @return
	 */
	public int getWidth(){
		return myWidth;
	}
	/**
	 * this is the move right method for all of the enemies that move to the right 
	 * @param s - both s and s2 were made to give different value of speed for different enemies
	 * @param s2
	 * @param rx- rx and lx were made so that when the enemies warped they would have the same hit box and make it for different enemies
	 * @param lx
	 */
	public void moveEnemyRight(int s, int s2, int rx, int lx){
		myLeftX = myLeftX + s;
		myRightX = myRightX + s2;

		if(myRightX > 1800){
			myRightX = rx;
			myLeftX = lx;
		}

	}
	/**
	 * this is the move left method for all of the enemies that move to the right 
	 * @param s - both s and s2 were made to give different value of speed for different enemies
	 * @param s2
	 * @param rx- rx and lx were made so that when the enemies warped they would have the same hit box and make it for different enemies
	 * @param lx
	 */
	public void moveEnemyLeft(int s, int s2, int rx, int lx){
		myLeftX = myLeftX - s;
		myRightX = myRightX - s2;
		if(myLeftX < -350){
			myRightX = rx;
			myLeftX = lx;
		}
	}
	/**
	 * this is the move down method for all of the enemies that move to the right 
	 * @param s - both s and s2 were made to give different value of speed for different enemies
	 * @param s2
	 * @param ty- ty and by were made so that when the enemies warped they would have the same hit box and make it for different enemies
	 * @param by
	 */
	public void moveEnemyDown(int s, int s2, int ty, int by){
		myTopY = myTopY + s;
		myBotY = myBotY + s2;
		if(myBotY > 850){
			myTopY = ty;
			myBotY = by;
		}
	}
	/**
	 * this is the move up method for all of the enemies that move to the right 
	 * @param s - both s and s2 were made to give different value of speed for different enemies
	 * @param s2
	 * @param ty- ty and by were made so that when the enemies warped they would have the same hit box and make it for different enemies
	 * @param by
	 */
	public void moveEnemyUp(int s, int s2, int ty, int by){
		myTopY = myTopY - s;
		myBotY = myBotY - s2;
		if(myTopY < -300 ){
			myTopY = ty;
			myBotY = by;
		}
	}
	/**
	 * this is for the enemies that move diaginally
	 * all of these variables were used to keep the hit box the same
	 * @param s3
	 * @param s4
	 * @param s5
	 * @param s6
	 */
	public void moveEnemyDiaginal(int s3, int s4, int s5, int s6){
		myRightX = myRightX + 2;
		myLeftX = myLeftX + 2;
		myTopY = myTopY + 2;
		myBotY = myBotY + 2;

		if(myBotY > 1000){
			myTopY = s3;
			myBotY = s4;
		}

		if(myRightX > 1500){
			myRightX = s5;
			myLeftX = s6;
		}

	}
	/**
	 * this was used in the last level for the fish because kevin bacon is suppose to be the main star so did not want the enemies to warp
	 */
	public void moveEnemyOtherLeft(){
		myRightX = myRightX - 2;
		myLeftX = myLeftX - 2;
	}
	/**
	 * this is used to set the enemy coordinates
	 * @param x
	 * @param y
	 */
	public void setEnemyCords(int x, int y ){
		myLeftX = myLeftX + x;
		myRightX = myRightX + x;
		myTopY = myTopY + y;
		myBotY = myBotY + y;
	}
	/**
	 * this is a getter for the enemy right x
	 * @return
	 */
	public int getMyEnemyRightX() {
		return myRightX;
	}
	/**
	 * this is a getter for the enemy left x
	 * @return
	 */
	public int getMyEnemyLeftX() {
		return myLeftX;
	}
	/**
	 * this is a getter for the enemy top y
	 * @return
	 */
	public int getMyEnemyTopY() {
		return myTopY;
	}
	/**
	 * this is a getter for the enemy bottom y
	 * @return
	 */
	public int getMyEnemyBotY() {
		return myBotY;
	}
	/**
	 * this is used to load all of the images of the fish
	 * @param FileName
	 * @return
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
