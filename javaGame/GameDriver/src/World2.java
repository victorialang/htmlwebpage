import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import javax.swing.JComponent;
import javax.swing.Timer;
/**
 * This is the second world class -- also the second level
 * @author lang, mather, sandoval, yates
 */

public class World2 extends JComponent implements ActionListener, Levels {
	/**
	 * Instance variables
	 */
	private Player thePlayer = new Player(15, 650, 40, 50);
	private KevinBacon theBacon = new KevinBacon(1500, 300, 80, 60, thePlayer);
	private BufferedImage theBaconator = theBacon.loadImageFromFile("KevinBacon.png");
	private ArrayList<Obstacles> theBarriers = new ArrayList<Obstacles>();
	private Graphics myG;
	private Obstacles myBackGround = new Obstacles(0, 0, 2880, 800);
	private Obstacles startPlatform = new Obstacles(0, 700, 60, 100);
	private Obstacles startCeiling = new Obstacles(0, 0, 60, 575);
	private Obstacles firstOutCrop = new Obstacles(60, 535, 40, 40);
	private Obstacles firstWall = new Obstacles(210, 200, 80, 700);
	private Obstacles secondOutCrop = new Obstacles(170, 650, 60, 40);
	private Obstacles thirdOutCrop = new Obstacles(170, 425, 60, 40);
	private Obstacles fourthOutCrop = new Obstacles(60, 315, 50, 40);
	private Obstacles fifthOutCrop = new Obstacles(170, 225, 60, 40);
	private Obstacles theSecondWall = new Obstacles(280, 350, 100, 600);
	private Obstacles theThirdWall = new Obstacles(380, 475, 100, 500);
	private Obstacles theFourthWall = new Obstacles(480, 575, 100, 400);
	private Obstacles theFifthWall = new Obstacles(580, 650, 100, 300);
	private Obstacles firstWall2 = new Obstacles(210, 0, 80, 50);
	private Obstacles theSecondWall2 = new Obstacles(280, 0, 100, 100);
	private Obstacles theThirdWall2 = new Obstacles(380, 0, 100, 200);
	private Obstacles theFourthWall2 = new Obstacles(480, 0, 100, 300);
	private Obstacles theFifthWall2 = new Obstacles(580, 0, 100, 400);
	private Obstacles theMidWall = new Obstacles(680, 500, 900, 20 );

	private Obstacles firstWall3 = new Obstacles(710, 0, 80, 175);
	private Obstacles theSecondWall3 = new Obstacles(950, 0, 100, 200);
	private Obstacles theThirdWall3 = new Obstacles(1020, 0, 100, 350);
	private Obstacles theFourthWall3 = new Obstacles(1180, 0, 100, 405);
	private Obstacles theFifthWall3 = new Obstacles(1240, 0, 100, 390);
	private Obstacles theSixthWall = new Obstacles(1310,0, 80, 300);

	private Obstacles firstWall4 = new Obstacles(750, 620, 120, 300);
	private Obstacles theSecondWall4 = new Obstacles(930, 630, 100, 300);
	private Obstacles theThirdWall4 = new Obstacles(1040, 650, 100, 300);
	private Obstacles theFourthWall4 = new Obstacles(1200, 670, 100, 300);
	private Obstacles theFifthWall4 = new Obstacles(1270, 740, 100, 300);
	private Obstacles theSixthWall2 = new Obstacles(1350, 590, 80, 300);

	private ArrayList<BufferedImage> theFishes = new ArrayList<BufferedImage>();
	private Enemy theFish = new Enemy(125, 30, 20, 30);
	private Enemy theThirdFish = new Enemy(800, 550, 160, 70);
	private Enemy theFourthFish = new Enemy(100, 0, 100, 75);
	private Enemy theFifthFish = new Enemy(600, 50, 250, 155);
	private Enemy theSixthFish = new Enemy(900, 400, 350, 100);
	private BufferedImage lampFish = theFish.loadImageFromFile("lampFish.png");
	private BufferedImage clown = theFish.loadImageFromFile("clown.png");
	private BufferedImage turtle = theFish.loadImageFromFile("turtle.png");
	private BufferedImage clownTwo = theFish.loadImageFromFile("clown.png");
	private BufferedImage shark = theFish.loadImageFromFile("9.png");
	private BufferedImage scuba = thePlayer.loadImageFromFile("scuba.png");
	private Timer time = new Timer(5, this);

	private Rocks myRockNine = new Rocks(290, 400, this);
	private Rocks myRockTen = new Rocks(250, 380, this);
	private Rocks myRockEleven = new Rocks(280, 490, this);
	private Rocks myRockTwelve = new Rocks(230, 470, this);
	private Rocks myRockThirteen = new Rocks(430, 170, this);
	private Rocks myRockFourteen = new Rocks(200, 50, this);
	private Rocks myRockFifteen = new Rocks(390, 90, this);
	private Rocks myRockSixteen = new Rocks(500, 120, this);
	private Rocks myRockSevenTeen = new Rocks(550, 150, this);
	private Rocks myRockEightTeen = new Rocks(580, 220, this);

	/**
	 * This method paints the graphics on the screen
	 * Barriers, enemies, textures and health bars are drawn
	 */
	public void paintComponent(Graphics g){
		myG = g;
		theBarriers.add(startPlatform);
		theBarriers.add(startCeiling);
		theBarriers.add(firstOutCrop);
		theBarriers.add(firstWall);
		theBarriers.add(secondOutCrop);
		theBarriers.add(thirdOutCrop);
		theBarriers.add(fourthOutCrop);
		theBarriers.add(fifthOutCrop);
		theBarriers.add(theSecondWall);
		theBarriers.add(theThirdWall);
		theBarriers.add(theFourthWall);
		theBarriers.add(theFifthWall);
		theBarriers.add(firstWall2);
		theBarriers.add(theSecondWall2);
		theBarriers.add(theThirdWall2);
		theBarriers.add(theFourthWall2);
		theBarriers.add(theFifthWall2);
		theBarriers.add(theMidWall);
		theBarriers.add(firstWall3);
		theBarriers.add(theSecondWall3);
		theBarriers.add(theThirdWall3);
		theBarriers.add(theFourthWall3);
		theBarriers.add(theFifthWall3);
		theBarriers.add(theSixthWall);
		theFishes.add(lampFish);
		theFishes.add(clown);


		myG.setColor(Color.BLUE);
		myG.fillRect(myBackGround.getMyLeftX(), myBackGround.getMyTopY(), myBackGround.getMyWidth(), myBackGround.getMyHeight());
		myG.setColor(Color.BLACK);
		myG.fillRect(startPlatform.getMyLeftX(), startPlatform.getMyTopY(), startPlatform.getMyWidth(), startPlatform.getMyHeight());
		myG.fillRect(startCeiling.getMyLeftX(), startCeiling.getMyTopY(), startCeiling.getMyWidth(), startCeiling.getMyHeight());
		myG.fillRect(firstOutCrop.getMyLeftX(), firstOutCrop.getMyTopY(), firstOutCrop.getMyWidth(), firstOutCrop.getMyHeight());
		myG.fillRect(firstWall.getMyLeftX(), firstWall.getMyTopY(), firstWall.getMyWidth(), firstWall.getMyHeight());
		myG.fillRect(secondOutCrop.getMyLeftX(), secondOutCrop.getMyTopY(), secondOutCrop.getMyWidth(), secondOutCrop.getMyHeight());
		myG.fillRect(thirdOutCrop.getMyLeftX(), thirdOutCrop.getMyTopY(), thirdOutCrop.getMyWidth(), thirdOutCrop.getMyHeight());
		myG.fillRect(fourthOutCrop.getMyLeftX(), fourthOutCrop.getMyTopY(), fourthOutCrop.getMyWidth(), fourthOutCrop.getMyHeight());
		myG.fillRect(fifthOutCrop.getMyLeftX(), fifthOutCrop.getMyTopY(), fifthOutCrop.getMyWidth(), fifthOutCrop.getMyHeight());
		myG.fillRect(theSecondWall.getMyLeftX(), theSecondWall.getMyTopY(), theSecondWall.getMyWidth(), theSecondWall.getMyHeight());
		myG.fillRect(theThirdWall.getMyLeftX(), theThirdWall.getMyTopY(), theThirdWall.getMyWidth(), theThirdWall.getMyHeight());
		myG.fillRect(theFourthWall.getMyLeftX(), theFourthWall.getMyTopY(), theFourthWall.getMyWidth(), theFourthWall.getMyHeight());
		myG.fillRect(theFifthWall.getMyLeftX(), theFifthWall.getMyTopY(), theFifthWall.getMyWidth(), theFifthWall.getMyHeight());

		myG.fillRect(firstWall2.getMyLeftX(), firstWall2.getMyTopY(), firstWall2.getMyWidth(), firstWall2.getMyHeight());
		myG.fillRect(theSecondWall2.getMyLeftX(), theSecondWall2.getMyTopY(), theSecondWall2.getMyWidth(), theSecondWall2.getMyHeight());
		myG.fillRect(theThirdWall2.getMyLeftX(), theThirdWall2.getMyTopY(), theThirdWall2.getMyWidth(), theThirdWall2.getMyHeight());
		myG.fillRect(theFourthWall2.getMyLeftX(), theFourthWall2.getMyTopY(), theFourthWall2.getMyWidth(), theFourthWall2.getMyHeight());
		myG.fillRect(theFifthWall2.getMyLeftX(), theFifthWall2.getMyTopY(), theFifthWall2.getMyWidth(), theFifthWall2.getMyHeight());
		myG.fillRect(theMidWall.getMyLeftX(), theMidWall.getMyTopY(), theMidWall.getMyWidth(), theMidWall.getMyHeight());

		myG.fillRect(firstWall3.getMyLeftX(), firstWall3.getMyTopY(), firstWall3.getMyWidth(), firstWall3.getMyHeight());
		myG.fillRect(theSecondWall3.getMyLeftX(), theSecondWall3.getMyTopY(), theSecondWall3.getMyWidth(), theSecondWall3.getMyHeight());
		myG.fillRect(theThirdWall3.getMyLeftX(), theThirdWall3.getMyTopY(), theThirdWall3.getMyWidth(), theThirdWall3.getMyHeight());
		myG.fillRect(theFourthWall3.getMyLeftX(), theFourthWall3.getMyTopY(), theFourthWall3.getMyWidth(), theFourthWall3.getMyHeight());
		myG.fillRect(theFifthWall3.getMyLeftX(), theFifthWall3.getMyTopY(), theFifthWall3.getMyWidth(), theFifthWall3.getMyHeight());
		myG.fillRect(theSixthWall.getMyLeftX(), theSixthWall.getMyTopY(), theSixthWall.getMyWidth(), theSixthWall.getMyHeight());

		myG.fillRect(firstWall4.getMyLeftX(), firstWall4.getMyTopY(), firstWall4.getMyWidth(), firstWall4.getMyHeight());
		myG.fillRect(theSecondWall4.getMyLeftX(), theSecondWall4.getMyTopY(), theSecondWall4.getMyWidth(), theSecondWall4.getMyHeight());
		myG.fillRect(theThirdWall4.getMyLeftX(), theThirdWall4.getMyTopY(), theThirdWall4.getMyWidth(), theThirdWall4.getMyHeight());
		myG.fillRect(theFourthWall4.getMyLeftX(), theFourthWall4.getMyTopY(), theFourthWall3.getMyWidth(), theFourthWall4.getMyHeight());
		myG.fillRect(theFifthWall4.getMyLeftX(), theFifthWall4.getMyTopY(), theFifthWall3.getMyWidth(), theFifthWall4.getMyHeight());
		myG.fillRect(theSixthWall2.getMyLeftX(), theSixthWall2.getMyTopY(), theSixthWall2.getMyWidth(), theSixthWall2.getMyHeight());


		myG.drawImage(scuba, thePlayer.getMyLeftX(), thePlayer.getMyTopY(), thePlayer.getWidth(), thePlayer.getHeight(), null);
		myG.drawImage(lampFish, theFish.getMyEnemyLeftX(), theFish.getMyEnemyTopY(), theFish.getWidth(), theFish.getHeight(), null);
		myG.drawImage(turtle, theThirdFish.getMyEnemyLeftX(), theThirdFish.getMyEnemyTopY(), theThirdFish.getWidth(), theThirdFish.getHeight(), null);
		myG.drawImage(clown, theFourthFish.getMyEnemyLeftX(), theFourthFish.getMyEnemyTopY(), theFourthFish.getWidth(), theFourthFish.getHeight(), null);
		myG.drawImage(clownTwo, theFifthFish.getMyEnemyLeftX(), theFifthFish.getMyEnemyTopY(), theFifthFish.getWidth(), theFifthFish.getHeight(), null);		
		myG.drawImage(shark, theSixthFish.getMyEnemyLeftX(), theSixthFish.getMyEnemyTopY(), theSixthFish.getWidth(), theSixthFish.getHeight(), null);
		time.start();

		myRockTen.drawRock();
		myRockEleven.drawRock();
		myRockNine.drawRock();
		myRockTen.drawRock();
		myRockEleven.drawRock();
		myRockTwelve.drawRock();
		myRockThirteen.drawRock();
		myRockFourteen.drawRock();
		myRockFifteen.drawRock();
		myRockSixteen.drawRock();
		myRockSevenTeen.drawRock();
		myRockEightTeen.drawRock();

		//Draws the Health Bar
		myG.setColor(Color.darkGray);
		myG.fillRect(10, 10, 105, 20);
		myG.setColor(Color.red);
		myG.fillRect(13, 13, (thePlayer.getHealth()), 15);
		myG.setColor(Color.WHITE);
		myG.drawString("Health: " + thePlayer.getHealth() + "%" , 15, 25);

		//sand
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

			//Checks if the Player's health is 0 to end game
			if(thePlayer.getHealth() <= 0){
				GameOver();
			}

			//Checks if the Player goes out of bounds (upper and lower bounds)
			if((thePlayer.getMyBotY() >= 825) || (thePlayer.getMyTopY() <= -55)){
				GameOver();
			}
			time.start();

		}
	}
	/**
	 * this was used to make the enemies used using the move methods from enemy using an action listener
	 */
	@Override
	public void actionPerformed(ActionEvent arg0) {
		theFish.moveEnemyDown(3, 3, -45, 0);
		theThirdFish.moveEnemyLeft(1, 1, 1600, 1450);
		theFourthFish.moveEnemyDiaginal(-100, 0, 0, -100);
		theFifthFish.moveEnemyRight(4, 4, -100, -370);
		theSixthFish.moveEnemyLeft(3, 3, 1780, 1450);
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
				if(this.isHitEnemy(j) || this.isHitEnemyThree(j) || this.isHitEnemyFour(j) || this.isHitEnemyFive(j) || this.isHitEnemySix(j)){
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
				if(this.isHitEnemy(j) || this.isHitEnemyThree(j) || this.isHitEnemyFour(j) || this.isHitEnemyFive(j) || this.isHitEnemySix(j)){
				}
			}
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
				if(this.isHitEnemy(j) || this.isHitEnemyThree(j) || this.isHitEnemyFour(j) || this.isHitEnemyFive(j) || this.isHitEnemySix(j)){
				}
			}
			thePlayer.moveDown();
			theBacon.move();
		}
		else if( key == KeyEvent.VK_UP){
			thePlayer.setFallingSpeed(-5);
			thePlayer.moveRight();
			for(int i = 0; i<theBarriers.size(); i++){
				if(this.isHit(i) && this.BotIsHit(i)){
					thePlayer.setFallingSpeed(5);
					thePlayer.moveRight();
				}
			}
			for(int j = 0; j < theFishes.size(); j++){
				if(this.isHitEnemy(j) || this.isHitEnemyThree(j) || this.isHitEnemyFour(j) || this.isHitEnemyFive(j) || this.isHitEnemySix(j)){
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
	 * This method is invoked when it is necessary to subtract a value (num) from the player's health
	 * The health is deducted by the parameter and then reset as the new value
	 * @param num - an integer to degrease the health
	 */
	public void subtractHealth(int num){
		int theHealth = thePlayer.getHealth();
		theHealth = theHealth - num;
		thePlayer.setHealth(theHealth);
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
	 * Method checks to see if the player has been hit by the fish enemy
	 * If true, health is subtracted
	 *  * The player's coordinates are set backwards to (15, 650)
	 * @param index - an integer to compare to the player's current coordinates
	 * @return boolean value of true or false depending on if the player has been hit
	 */
	public boolean isHitEnemy(int index){
		if((thePlayer.getMyRightX() >= theFish.getMyEnemyLeftX())  && (thePlayer.getMyLeftX() <= theFish.getMyEnemyRightX()) && (thePlayer.getMyBotY() >= theFish.getMyEnemyTopY()) && (thePlayer.getMyTopY() <= theFish.getMyEnemyBotY())){
			subtractHealth(35);
			myG.drawString("Health: " + (thePlayer.getHealth()) + "%", 15, 225);
			myG.setColor(Color.red);
			myG.fillRect(13, 213, (thePlayer.getHealth()), 15);
			thePlayer.setHitCords(15, 650);
			return true;
		}

		return false;
	}

	/**
	 * Method checks to see if the player has been hit by the second fish
	 * If true, health is subtracted
	 * The player's coordinates are set backwards by 100
	 * @param index - an integer to compare to the player's current coordinates
	 * @return boolean value of true or false depending on if the player has been hit
	 */

	/**
	 * Method checks to see if the player has been hit by the third fish enemy
	 * If true, health is subtracted
	 *  * The player's coordinates are set backwards to (15, 650)
	 * @param index - an integer to compare to the player's current coordinates
	 * @return boolean value of true or false depending on if the player has been hit
	 */
	public boolean isHitEnemyThree(int index){
		if((thePlayer.getMyRightX() >= theThirdFish.getMyEnemyLeftX())  && (thePlayer.getMyLeftX() <= theThirdFish.getMyEnemyRightX()) && (thePlayer.getMyBotY() >= theThirdFish.getMyEnemyTopY()) && (thePlayer.getMyTopY() <= theThirdFish.getMyEnemyBotY())){
			subtractHealth(30);
			myG.drawString("Health: " + (thePlayer.getHealth()) + "%", 15, 225);
			myG.setColor(Color.red);
			myG.fillRect(13, 213, (thePlayer.getHealth()), 15);
			thePlayer.setHitCords(15, 650);
			return true;
		}

		return false;
	}

	/**
	 * Method checks to see if the player has been hit by the fourth fish enemy
	 * If true, health is subtracted
	 *  * The player's coordinates are set backwards to (15, 650)
	 * @param index - an integer to compare to the player's current coordinates
	 * @return boolean value of true or false depending on if the player has been hit
	 */
	public boolean isHitEnemyFour(int index){
		if((thePlayer.getMyRightX() >= theFourthFish.getMyEnemyLeftX())  && (thePlayer.getMyLeftX() <= theFourthFish.getMyEnemyRightX()) && (thePlayer.getMyBotY() >= theFourthFish.getMyEnemyTopY()) && (thePlayer.getMyTopY() <= theFourthFish.getMyEnemyBotY())){
			subtractHealth(25);
			myG.drawString("Health: " + (thePlayer.getHealth()) + "%", 15, 225);
			myG.setColor(Color.red);
			myG.fillRect(13, 213, (thePlayer.getHealth()), 15);
			thePlayer.setHitCords(15, 650);
			return true;
		}

		return false;
	}
	/**
	 * Method checks to see if the player has been hit by the fifth fish enemy
	 * If true, health is subtracted
	 *  * The player's coordinates are set backwards to (15, 650)
	 * @param index - an integer to compare to the player's current coordinates
	 * @return boolean value of true or false depending on if the player has been hit
	 */
	public boolean isHitEnemyFive(int index){
		if((thePlayer.getMyRightX() >= theFifthFish.getMyEnemyLeftX())  && (thePlayer.getMyLeftX() <= theFifthFish.getMyEnemyRightX()) && (thePlayer.getMyBotY() >= theFifthFish.getMyEnemyTopY()) && (thePlayer.getMyTopY() <= theFifthFish.getMyEnemyBotY())){
			subtractHealth(20);
			myG.drawString("Health: " + (thePlayer.getHealth()) + "%", 15, 225);
			myG.setColor(Color.red);
			myG.fillRect(13, 213, (thePlayer.getHealth()), 15);
			thePlayer.setHitCords(15, 650);
			return true;
		}

		return false;
	}
	/**
	 * Method checks to see if the player has been hit by the sixth fish
	 * If true, health is subtracted
	 *  * The player's coordinates are set backwards to (15, 650)
	 * @param index - an integer to compare to the player's current coordinates
	 * @return boolean value of true or false depending on if the player has been hit
	 */
	public boolean isHitEnemySix(int index){
		if((thePlayer.getMyRightX() >= theSixthFish.getMyEnemyLeftX())  && (thePlayer.getMyLeftX() <= theSixthFish.getMyEnemyRightX()) && (thePlayer.getMyBotY() >= theSixthFish.getMyEnemyTopY()) && (thePlayer.getMyTopY() <= theSixthFish.getMyEnemyBotY())){
			subtractHealth(20);
			myG.drawString("Health: " + (thePlayer.getHealth()) + "%", 15, 225);
			myG.setColor(Color.red);
			myG.fillRect(13, 213, (thePlayer.getHealth()), 15);
			thePlayer.setHitCords(15, 650);
			return true;
		}
		return false;
	}
	/**
	 * Getter methods which return the value of myG and thePlayer
	 */
	public Graphics getG() {
		return myG;
	}
	public Player getPlayer(){
		return thePlayer;
	}
}
