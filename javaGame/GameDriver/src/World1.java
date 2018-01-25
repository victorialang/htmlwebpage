import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import javax.swing.*;
/**
 * This is the first level
 * Obstructions, enemies, and various textures found in this level
 * A player is introduced
 * @author lang, mather, sandoval, yates
 *
 */
public class World1 extends JComponent implements ActionListener, Levels {
	/**
	 * Instance variables
	 */
	private Player thePlayer = new Player(15, 150, 40, 50);
	private KevinBacon theBacon = new KevinBacon(1500, 300, 80, 60, thePlayer);
	private Color myColor = Color.GREEN;
	private BufferedImage theBaconator = theBacon.loadImageFromFile("KevinBacon.png");
	private Enemy theFish = new Enemy(900, 350, 300, 220);
	private Enemy theOtherFish = new Enemy(1, 600, 350, 140);
	private Enemy theThirdFish = new Enemy(400, 700, 50, 130);
	private Enemy theFourthFish = new Enemy(700, 100, 100, 100);
	private Enemy theFifthFish = new Enemy(400, 250, 100, 75);
	private BufferedImage scuba = thePlayer.loadImageFromFile("scuba.png");
	private BufferedImage shamoo = theFish.loadImageFromFile("shamoo.png");
	private BufferedImage blueWhale = theFish.loadImageFromFile("blueWhale.png");
	private BufferedImage squid = theFish.loadImageFromFile("squid.png");
	private BufferedImage ray = theFish.loadImageFromFile("ray.png");
	private BufferedImage redGreen = theFish.loadImageFromFile("redGreen.png");
	private ArrayList<BufferedImage> theFishes = new ArrayList<BufferedImage>();
	private ArrayList<Obstacles> theBarriers = new ArrayList<Obstacles>();
	private Graphics myG;
	private Obstacles myBackGround = new Obstacles(0, 0, 2880, 800);
	private Obstacles startPlatform = new Obstacles(0, 200, 60, 20);
	private Obstacles midGround = new Obstacles(0, 700, 9000, 100);
	private Obstacles firstWall = new Obstacles(175, 0, 50, 500);
	private Obstacles secondPlatform = new Obstacles(125, 200, 50, 20);
	private Obstacles thirdPlatform = new Obstacles(50, 300, 75, 20);
	private Obstacles secondWall = new Obstacles(100, 500, 350, 20);
	private Obstacles thirdWall = new Obstacles(320, 70, 20, 350);
	private Obstacles fourthWall = new Obstacles(530, 100, 20, 650);
	private Obstacles fifthWall = new Obstacles(660, 0, 20, 600);
	private Obstacles sixthWall = new Obstacles(800, 100, 300, 20);
	private Obstacles sixthWall2 = new Obstacles(800, 250, 300, 20);
	private Obstacles sixthWall3 = new Obstacles(800, 400, 300, 20);
	private Obstacles sixthWall4 = new Obstacles(800, 550, 300, 20);
	private Obstacles sixthWall5 = new Obstacles(800, 700, 300, 20);
	private Obstacles seventhWall = new Obstacles(1175, 750, 300, 20);
	private Obstacles seventhWall2 = new Obstacles(1175, 200, 300, 20);
	private Obstacles seventhWall3 = new Obstacles(1175, 350, 300, 20);
	private Obstacles seventhWall4 = new Obstacles(1175, 500, 300, 20);
	private Obstacles seventhWall5 = new Obstacles(1175, 650, 300, 20);
	private Timer time = new Timer(5, this);
	int counter = 0;
	private Rocks myRock = new Rocks(100,710,this);
	private Rocks myRock2 = new Rocks(200,730,this);
	private Rocks myRock3 = new Rocks(300,740,this);
	private Rocks myRock4 = new Rocks(400,710,this);
	private Rocks myRock5 = new Rocks(500,700,this);
	private Rocks myRock6 = new Rocks(600,730,this);
	private Rocks myRock7 = new Rocks(700,730,this);
	private Rocks myRock8 = new Rocks(800,740,this);
	private Rocks myRock9 = new Rocks(900,750,this);
	private Rocks myRock10 = new Rocks(1000,720,this);
	private Rocks myRock11 = new Rocks(1100,710,this);
	private Rocks myRock12 = new Rocks(1200,720,this);

	private Seaweed myWeed = new Seaweed(myColor, 150, 160, this);
	private Seaweed myWeed2 = new Seaweed(myColor, 60, 260, this);
	private Seaweed myWeed3 = new Seaweed(myColor, 100, 260, this);
	private Seaweed myWeed4 = new Seaweed(myColor, 650, 160, this);
	private Seaweed myWeed5 = new Seaweed(myColor, 690, 260, this);
	private Seaweed myWeed6 = new Seaweed(myColor, 1300, 260, this);
	private Seaweed myWeed7 = new Seaweed(myColor, 1050, 160, this);
	private Seaweed myWeed8 = new Seaweed(myColor, 600, 260, this);
	private Seaweed myWeed9 = new Seaweed(myColor, 1003, 360, this);
	private Seaweed myWeed10 = new Seaweed(myColor, 1500, 600, this);
	private Seaweed myWeed11 = new Seaweed(myColor, 690, 700, this);
	private Seaweed myWeed12 = new Seaweed(myColor, 150, 700, this);
	private Seaweed myWeed13 = new Seaweed(myColor, 150, 360, this);
	private Seaweed myWeed14 = new Seaweed(myColor, 60, 460, this);
	private Seaweed myWeed15 = new Seaweed(myColor, 500, 400, this);
	private Seaweed myWeed16 = new Seaweed(myColor, 450, 400, this);
	private Seaweed myWeed17 = new Seaweed(myColor, 360, 300, this);
	private Seaweed myWeed18 = new Seaweed(myColor, 700, 360, this);
	private Seaweed myWeed19 = new Seaweed(myColor, 850, 560, this);
	private Seaweed myWeed20 = new Seaweed(myColor, 960, 360, this);
	private Seaweed myWeed21 = new Seaweed(myColor, 1000, 290, this);
	private Seaweed myWeed22 = new Seaweed(myColor, 950, 260, this);
	private Seaweed myWeed23 = new Seaweed(myColor, 660, 460, this);
	private Seaweed myWeed24 = new Seaweed(myColor, 900, 660, this);

	/**
	 * This method is used to put the graphics onto the JFrame
	 * Barriers are first added as design -- various walls
	 * Enemies are added along with the main character
	 * Sand is loaded onto the screen through for loops
	 * Seaweed is added
	 * Health bar is available here
	 */

	public void paintComponent(Graphics g){
		myG = g;
		theBarriers.add(startPlatform);
		theBarriers.add(midGround);
		theBarriers.add(firstWall);
		theBarriers.add(secondPlatform);
		theBarriers.add(thirdPlatform);
		theBarriers.add(secondWall);
		theBarriers.add(thirdWall);
		theBarriers.add(fourthWall);
		theBarriers.add(fifthWall);
		theBarriers.add(sixthWall);
		theBarriers.add(sixthWall2);
		theBarriers.add(sixthWall3);
		theBarriers.add(sixthWall4);
		theBarriers.add(sixthWall5);
		theBarriers.add(seventhWall);
		theBarriers.add(seventhWall2);
		theBarriers.add(seventhWall3);
		theBarriers.add(seventhWall4);
		theBarriers.add(seventhWall5);


		theFishes.add(shamoo);
		theFishes.add(blueWhale);
		myG.setColor(Color.BLUE);
		myG.fillRect(myBackGround.getMyLeftX(), myBackGround.getMyTopY(), myBackGround.getMyWidth(), myBackGround.getMyHeight());
		myG.setColor(Color.BLACK);
		myG.fillRect(startPlatform.getMyLeftX(), startPlatform.getMyTopY(), startPlatform.getMyWidth(), startPlatform.getMyHeight());
		myG.fillRect(firstWall.getMyLeftX(), firstWall.getMyTopY(), firstWall.getMyWidth(), firstWall.getMyHeight());
		myG.fillRect(midGround.getMyLeftX(), midGround.getMyTopY(), midGround.getMyWidth(), midGround.getMyHeight());
		myG.fillRect(secondPlatform.getMyLeftX(), secondPlatform.getMyTopY(), secondPlatform.getMyWidth(), secondPlatform.getMyHeight());
		myG.fillRect(thirdPlatform.getMyLeftX(), thirdPlatform.getMyTopY(), thirdPlatform.getMyWidth(), thirdPlatform.getMyHeight());
		myG.fillRect(secondWall.getMyLeftX(), secondWall.getMyTopY(), secondWall.getMyWidth(), secondWall.getMyHeight());
		myG.fillRect(thirdWall.getMyLeftX(), thirdWall.getMyTopY(), thirdWall.getMyWidth(), thirdWall.getMyHeight());
		myG.fillRect(fourthWall.getMyLeftX(), fourthWall.getMyTopY(), fourthWall.getMyWidth(), fourthWall.getMyHeight());
		myG.fillRect(fifthWall.getMyLeftX(), fifthWall.getMyTopY(), fifthWall.getMyWidth(), fifthWall.getMyHeight());
		myG.fillRect(sixthWall.getMyLeftX(), sixthWall.getMyTopY(), sixthWall.getMyWidth(), sixthWall.getMyHeight());
		myG.fillRect(sixthWall2.getMyLeftX(), sixthWall2.getMyTopY(), sixthWall2.getMyWidth(), sixthWall2.getMyHeight());
		myG.fillRect(sixthWall3.getMyLeftX(), sixthWall3.getMyTopY(), sixthWall3.getMyWidth(), sixthWall3.getMyHeight());
		myG.fillRect(sixthWall4.getMyLeftX(), sixthWall4.getMyTopY(), sixthWall4.getMyWidth(), sixthWall4.getMyHeight());
		myG.fillRect(seventhWall5.getMyLeftX(), sixthWall5.getMyTopY(), sixthWall5.getMyWidth(), sixthWall5.getMyHeight());
		myG.fillRect(seventhWall.getMyLeftX(), seventhWall.getMyTopY(), seventhWall.getMyWidth(), sixthWall.getMyHeight());
		myG.fillRect(seventhWall2.getMyLeftX(), seventhWall2.getMyTopY(), seventhWall2.getMyWidth(), seventhWall2.getMyHeight());
		myG.fillRect(seventhWall3.getMyLeftX(), seventhWall3.getMyTopY(), seventhWall3.getMyWidth(), seventhWall3.getMyHeight());
		myG.fillRect(seventhWall4.getMyLeftX(), seventhWall4.getMyTopY(), seventhWall4.getMyWidth(), seventhWall4.getMyHeight());
		myG.fillRect(seventhWall5.getMyLeftX(), seventhWall5.getMyTopY(), seventhWall5.getMyWidth(), seventhWall5.getMyHeight());

		myG.drawImage(shamoo, theFish.getMyEnemyLeftX(), theFish.getMyEnemyTopY(), theFish.getWidth(), theFish.getHeight(), null);
		myG.drawImage(blueWhale, theOtherFish.getMyEnemyLeftX(), theOtherFish.getMyEnemyTopY(), theOtherFish.getWidth(), theOtherFish.getHeight(), null);
		myG.drawImage(squid, theThirdFish.getMyEnemyLeftX(), theThirdFish.getMyEnemyTopY(), theThirdFish.getWidth(), theThirdFish.getHeight(), null);
		myG.drawImage(ray,theFourthFish.getMyEnemyLeftX(), theFourthFish.getMyEnemyTopY(), theFourthFish.getWidth(), theFourthFish.getHeight(), null );
		myG.drawImage(scuba, thePlayer.getMyLeftX(), thePlayer.getMyTopY(), thePlayer.getWidth(), thePlayer.getHeight(), null);
		myG.drawImage(redGreen, theFifthFish.getMyEnemyLeftX(), theFifthFish.getMyEnemyTopY(), theFifthFish.getWidth(), theFifthFish.getHeight(), null);
		for(int i = 0; i < 1500; i += 7) {
			for(int j = 0; j < 220; j += 7) {
				if (( j <= 15)  ) { // ONE
					myG.setColor(Color.BLACK);
					myG.fillRect(i, j+700, 6, 6);
					myG.setColor(new Color(255,211,155));
					myG.fillRect(i, j+700, 5, 5);
				}
				if((j >= 15 ) && (j <= 40)) { //TWO
					myG.setColor(Color.BLACK);
					myG.fillRect(i, j+700, 6, 6);
					myG.setColor(new Color(244,164,96));
					myG.fillRect(i, j+700, 5, 5);
				}
				if((j >= 40) && (j <= 62)) { //THREE	
					myG.setColor(Color.BLACK);
					myG.fillRect(i, j+700, 6, 6);
					myG.setColor(new Color(255,165,79));
					myG.fillRect(i, j+700, 5, 5);
				}
				if((j >= 62) && (j <= 80)) { //FOUR
					myG.setColor(Color.BLACK);
					myG.fillRect(i, j+700, 6, 6);
					myG.setColor(new Color(238,154,73));
					myG.fillRect(i, j+700, 5, 5);
				}
				if((j >= 80) && (j <= 100)) { //FIVE
					myG.setColor(Color.BLACK);
					myG.fillRect(i, j+700, 6, 6);
					myG.setColor(new Color(210,105,30));
					myG.fillRect(i, j+700, 5, 5);
				}
				if((j >= 100) && (j <= 120)) { //SIX
					myG.setColor(Color.BLACK);
					myG.fillRect(i, j+700, 6, 6);
					myG.setColor(new Color(139,69,19));
					myG.fillRect(i, j+700, 5, 5);
				}
				if((j >= 120) && (j <= 142)) { //SEVEN
					myG.setColor(Color.BLACK); 
					myG.fillRect(i, j+700, 6, 6);
					myG.setColor(new Color(92,51,23));
					myG.fillRect(i, j+700, 5, 5);
				}
				if((j >= 142) && (j <= 164)) { //EIGHT
					myG.setColor(Color.BLACK);
					myG.fillRect(i, j+700, 6, 6);
					myG.setColor(new Color(92,64,51));
					myG.fillRect(i, j+700, 5, 5);
				}
				if((j >= 164) && (j <= 186)) { //NINE
					myG.setColor(Color.BLACK);
					myG.fillRect(i, j+700, 6, 6);
					myG.setColor(new Color(38,38,38));
					myG.fillRect(i, j+700, 5, 5);
				}
				if((j >= 186) && (j <= 215)) { //TEN
					myG.setColor(Color.BLACK);
					myG.fillRect(i, j+700, 6, 6);
					myG.setColor(new Color(3,3,3));
					myG.fillRect(i, j+700, 5, 5);
				}
			}
		}
		time.start();		
		myRock.drawRock();
		myRock2.drawRock();
		myRock3.drawRock();
		myRock4.drawRock();
		myRock5.drawRock();
		myRock6.drawRock();
		myRock7.drawRock();
		myRock8.drawRock();
		myRock9.drawRock();
		myRock10.drawRock();
		myRock11.drawRock();
		myRock12.drawRock();

		myWeed.drawSeaweed();
		myWeed2.drawSeaweed();
		myWeed3.drawSeaweed();
		myWeed4.drawSeaweed();
		myWeed5.drawSeaweed();
		myWeed6.drawSeaweed();
		myWeed7.drawSeaweed();
		myWeed8.drawSeaweed();
		myWeed9.drawSeaweed();
		myWeed10.drawSeaweed();
		myWeed11.drawSeaweed();
		myWeed12.drawSeaweed();
		myWeed13.drawSeaweed();
		myWeed14.drawSeaweed();
		myWeed15.drawSeaweed();
		myWeed16.drawSeaweed();
		myWeed17.drawSeaweed();
		myWeed18.drawSeaweed();
		myWeed19.drawSeaweed();
		myWeed20.drawSeaweed();
		myWeed21.drawSeaweed();
		myWeed22.drawSeaweed();
		myWeed23.drawSeaweed();
		myWeed24.drawSeaweed();

		//Draws the Health Bar
		myG.setColor(Color.darkGray);
		myG.fillRect(10, 10, 105, 20);
		myG.setColor(Color.red);
		myG.fillRect(13, 13, (thePlayer.getHealth()), 15);
		myG.setColor(Color.WHITE);
		myG.drawString("Health: " + thePlayer.getHealth() + "%" , 15, 25);

		//Checks if the Player's health is 0 to end game
		if(thePlayer.getHealth() <= 0){
			GameOver();
		}

		//Checks if the Player goes out of bounds (upper and lower bounds)
		if((thePlayer.getMyBotY() >= 850) || (thePlayer.getMyTopY() <= -55)){
			GameOver();
		}
	}

	/**
	 * this was used to make the enemies used using the move methods from enemy using an action listener
	 */
	@Override
	public void actionPerformed(ActionEvent arg0) {
		theBacon.moveEnd(theBaconator);
		theFish.moveEnemyLeft(3, 3, 1900, 1500);
		theOtherFish.moveEnemyRight(4, 4, -50, -450);
		theThirdFish.moveEnemyUp(5, 5, 875, 1025);
		theFourthFish.moveEnemyDown(4, 4, -290, -200);
		theFifthFish.moveEnemyLeft(4, 4, 1500, 1450);


		repaint();
	}

	/**
	 * Used if the keys are released (right, left, down and up)
	 * The the moving and falling speeds are set as 0 accordingly depending on current movement of player 
	 */
	public void keyReleased(KeyEvent e) {
		int key2 = e.getKeyCode();
		if( key2 == KeyEvent.VK_RIGHT){
			thePlayer.setMovingSpeed(0);
		}	
		else if( key2 == KeyEvent.VK_LEFT){
			thePlayer.setMovingSpeed(0);
		}
		else if( key2 == KeyEvent.VK_DOWN){
			thePlayer.setFallingSpeed(0);
		}
		else if( key2 == KeyEvent.VK_UP){
			thePlayer.setFallingSpeed(0);
		}
	}

	/**
	 * This method utilizes keys on the keyboard as controls
	 * When the arrows are used (left/right/up/down), the speed of the player is modified 
	 * 	depending on what key was pressed.
	 * 
	 */
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		if( key == KeyEvent.VK_RIGHT){
			thePlayer.setMovingSpeed(5);
			thePlayer.moveRight();
			for(int i = 0; i<theBarriers.size(); i++){
				if(this.isHit(i) && this.rightIsHit(i)){
					thePlayer.setMovingSpeed(-5);
					thePlayer.moveRight();
				}
			}
			for(int j = 0; j < theFishes.size(); j++){
				if(this.isHitEnemy(j) || this.isHitEnemyTwo(j) || this.isHitEnemyThree(j) || this.isHitEnemyFour(j) || this.isHitEnemyFive(j)){
				}
			}

			thePlayer.moveRight();
			theBacon.move();
			thePlayer.setMovingSpeed(0);
			thePlayer.moveRight();

		}	
		else if( key == KeyEvent.VK_LEFT){
			thePlayer.setMovingSpeed(-5);
			thePlayer.moveLeft();
			for(int i = 0; i<theBarriers.size(); i++){
				if(this.isHit(i) && this.LeftIsHit(i)){
					thePlayer.setMovingSpeed(5);
					thePlayer.moveLeft();
				}
			}

			for(int j = 0; j < theFishes.size(); j++){
				if(this.isHitEnemy(j) || this.isHitEnemyTwo(j) || this.isHitEnemyThree(j) || this.isHitEnemyFour(j) || this.isHitEnemyFive(j)){
				}
			}
			thePlayer.moveLeft();
			thePlayer.moveLeft();

			theBacon.move();
		}
		else if( key == KeyEvent.VK_DOWN){
			thePlayer.setFallingSpeed(5);
			thePlayer.moveDown();
			for(int i = 0; i<theBarriers.size(); i++){
				if(this.isHit(i) && this.TopIsHit(i)){
					thePlayer.setFallingSpeed(-5);
					thePlayer.moveDown();
				}
			}
			for(int j = 0; j < theFishes.size(); j++){
				if(this.isHitEnemy(j) || this.isHitEnemyTwo(j) || this.isHitEnemyThree(j) || this.isHitEnemyFour(j) || this.isHitEnemyFive(j)){
				}
			}

			thePlayer.moveDown();
			theBacon.move();

		}
		else if( key == KeyEvent.VK_UP){

			thePlayer.setFallingSpeed(-10);
			thePlayer.moveUp();
			for(int i = 0; i<theBarriers.size(); i++){
				if(this.isHit(i) && this.BotIsHit(i)){
					thePlayer.setFallingSpeed(10);
					thePlayer.moveRight();
				}
			}
			for(int j = 0; j < theFishes.size(); j++){
				if(this.isHitEnemy(j) || this.isHitEnemyTwo(j) || this.isHitEnemyThree(j) || this.isHitEnemyFour(j) || this.isHitEnemyFive(j)){
				}
			}

			thePlayer.moveRight();
			theBacon.move();

		}
	}
	/**
	 * This method checks to see if the player has hit something
	 * @param index - an integer to compare to the players current coordinates
	 * @return boolean of true or false
	 */
	public boolean isHit(int index){
		if((thePlayer.getMyRightX() <= theBarriers.get(index).getMyLeftX()) ||
				(thePlayer.getMyLeftX() >= theBarriers.get(index).getMyRightX()) || 
				(thePlayer.getMyBotY() <= theBarriers.get(index).getMyTopY()) ||
				(thePlayer.getMyTopY() >= theBarriers.get(index).getMyBotY())){
			return false;
		}

		return true;

	}
	/**
	 * This method is invoked when the game has ended/ the user has lost
	 * The screen's color is set
	 * Game over appears on the screen
	 * Kevin Bacon goes across the screen
	 */
	public void GameOver(){
		myG.setColor(Color.WHITE);
		myG.fillRect(0,0, 2880, 1800);
		myG.setColor(Color.BLACK);
		myG.setFont(new Font("TimesRoman", Font.BOLD, 100)); 
		myG.drawString(" **GAME OVER!** ", 225, 225);

		myG.drawImage(theBaconator, theBacon.getMyLeftX(), theBacon.getMyTopY(), theBaconator.getWidth(), theBaconator.getHeight(), null);
		theBacon.moveEnd(theBaconator);
	}

	/**
	 * Method checks to see if the player's right X coordinate has been hit
	 * @param index - an integer to compare to the player's current coordinates
	 * @return boolean value of true or false depending on if the player has been hit
	 */
	public boolean rightIsHit(int index){
		if(thePlayer.getMyRightX() <= theBarriers.get(index).getMyLeftX()){
			return false;
		}
		return true;
	}
	/**
	 * Method checks to see if the player's left X coordinate has been hit
	 * @param index - an integer to compare to the player's current coordinates
	 * @return boolean value of true or false depending on if the player has been hit
	 */
	public boolean LeftIsHit(int index){
		if(thePlayer.getMyLeftX() >= theBarriers.get(index).getMyRightX()){
			return false;
		}
		return true;
	}
	/**
	 * Method checks to see if the player's top Y coordinate has been hit
	 * @param index - an integer to compare to the player's current coordinates
	 * @return boolean value of true or false depending on if the player has been hit
	 */
	public boolean TopIsHit(int index){
		if(thePlayer.getMyBotY() <= theBarriers.get(index).getMyTopY()){
			return false;
		}
		return true;
	}
	/**
	 * Method checks to see if the player's bottom Y coordinate has been hit
	 * @param index - an integer to compare to the player's current coordinates
	 * @return boolean value of true or false depending on if the player has been hit
	 */
	public boolean BotIsHit(int index){
		if(thePlayer.getMyTopY() >= theBarriers.get(index).getMyBotY()){
			return false;
		}
		return true;
	}
	/**
	 * Method used to determine if the player is on the ground or not
	 * Print line also included in if-statement and else to print to the console
	 * @param index - an integer value to compare to the player's coordinates
	 * @return boolean of true or false, true if player is on ground
	 */
	public boolean onGround(int index){

		if(this.TopIsHit(index)){
			System.out.println("onGround");
			return true;
		}
		System.out.println("Not on ground");
		return false;
	}
	/**
	 * Method checks to see if the player has been hit by the second fish
	 * If true, health is subtracted
	 * The player's coordinates are set backwards to (15, 150)
	 * @param index - an integer to compare to the player's current coordinates
	 * @return boolean value of true or false depending on if the player has been hit
	 */
	public boolean isHitEnemyTwo(int index){
		if((thePlayer.getMyRightX() >= theFish.getMyEnemyLeftX())  && (thePlayer.getMyLeftX() <= theFish.getMyEnemyRightX()) && (thePlayer.getMyBotY() >= theFish.getMyEnemyTopY()) && (thePlayer.getMyTopY() <= theFish.getMyEnemyBotY())){
			subtractHealth(25);
			myG.drawString("Health: " + (thePlayer.getHealth()) + "%", 15, 225);
			myG.setColor(Color.red);
			myG.fillRect(13, 213, (thePlayer.getHealth()), 15);
			thePlayer.setHitCords(15, 150);
			return true;
		}

		return false;
	}
	/**
	 * Method checks to see if the player has been hit by "theOtherFish" enemy
	 * If true, health is subtracted
	 * The player's coordinates are set backwards to (15, 150)
	 * @param index - an integer to compare to the player's current coordinates
	 * @return boolean value of true or false depending on if the player has been hit
	 */
	public boolean isHitEnemy(int index){
		if((thePlayer.getMyRightX() >= theOtherFish.getMyEnemyLeftX())  && (thePlayer.getMyLeftX() <= theOtherFish.getMyEnemyRightX()) && (thePlayer.getMyBotY() >= theOtherFish.getMyEnemyTopY()) && (thePlayer.getMyTopY() <= theOtherFish.getMyEnemyBotY())){
			subtractHealth(30);
			myG.drawString("Health: " + (thePlayer.getHealth()) + "%", 15, 225);
			myG.setColor(Color.red);
			myG.fillRect(13, 213, (thePlayer.getHealth()), 15);
			thePlayer.setHitCords(15, 150);
			return true;
		}

		return false;
	}

	/**
	 * Method checks to see if the player has been hit by the third fish
	 * If true, health is subtracted
	 * The player's coordinates are set backwards to (15, 150)
	 * @param index - an integer to compare to the player's current coordinates
	 * @return boolean value of true or false depending on if the player has been hit
	 */
	public boolean isHitEnemyThree(int index){
		if((thePlayer.getMyRightX() >= theThirdFish.getMyEnemyLeftX())  && (thePlayer.getMyLeftX() <= theThirdFish.getMyEnemyRightX()) && (thePlayer.getMyBotY() >= theThirdFish.getMyEnemyTopY()) && (thePlayer.getMyTopY() <= theThirdFish.getMyEnemyBotY())){
			subtractHealth(20);
			myG.drawString("Health: " + (thePlayer.getHealth()) + "%", 15, 225);
			myG.setColor(Color.red);
			myG.fillRect(13, 213, (thePlayer.getHealth()), 15);
			thePlayer.setHitCords(15, 150);
			return true;
		}

		return false;
	}

	/**
	 * Method checks to see if the player has been hit by the fourth fish
	 * If true, health is subtracted
	 * The player's coordinates are set backwards to (15, 150)
	 * @param index - an integer to compare to the player's current coordinates
	 * @return boolean value of true or false depending on if the player has been hit
	 */
	public boolean isHitEnemyFour(int index){
		if((thePlayer.getMyRightX() >= theFourthFish.getMyEnemyLeftX())  && (thePlayer.getMyLeftX() <= theFourthFish.getMyEnemyRightX()) && (thePlayer.getMyBotY() >= theFourthFish.getMyEnemyTopY()) && (thePlayer.getMyTopY() <= theFourthFish.getMyEnemyBotY())){
			subtractHealth(15);
			myG.drawString("Health: " + (thePlayer.getHealth()) + "%", 15, 225);
			myG.setColor(Color.red);
			myG.fillRect(13, 213, (thePlayer.getHealth()), 15);
			thePlayer.setHitCords(15, 150);
			return true;
		}

		return false;
	}
	/**
	 * Method checks to see if the player has been hit by the fifth fish
	 * If true, health is subtracted
	 * The player's coordinates are set backwards to (15, 150)
	 * @param index - an integer to compare to the player's current coordinates
	 * @return boolean value of true or false depending on if the player has been hit
	 */
	public boolean isHitEnemyFive(int index){
		if((thePlayer.getMyRightX() >= theFifthFish.getMyEnemyLeftX())  && (thePlayer.getMyLeftX() <= theFifthFish.getMyEnemyRightX()) && (thePlayer.getMyBotY() >= theFifthFish.getMyEnemyTopY()) && (thePlayer.getMyTopY() <= theFifthFish.getMyEnemyBotY())){
			subtractHealth(10);
			myG.drawString("Health: " + (thePlayer.getHealth()) + "%", 15, 225);
			myG.setColor(Color.red);
			myG.fillRect(13, 213, (thePlayer.getHealth()), 15);
			thePlayer.setHitCords(15, 150);
			return true;
		}

		return false;
	}
	/**
	 * This method is invoked when it is necessary to subtract a value (num) from the player's health
	 * The health is deducted by the parameter and then reset as the new value
	 * @param num - an integer to decrease the health
	 */
	public void subtractHealth(int num){
		int theHealth = thePlayer.getHealth();
		theHealth = theHealth - num;
		thePlayer.setHealth(theHealth);
	}

	/**
	 * Getter methods that return myG and thePlayer
	 */
	public Graphics getG() {
		return myG;
	}
	public Player getPlayer(){
		return thePlayer;
	}
}


