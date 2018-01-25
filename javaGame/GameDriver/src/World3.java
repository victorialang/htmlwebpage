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
 * This is the third level
 * More obstacles are found here
 * The main character is the same
 * @author lang, mather, sandoval, yates
 *
 */

public class World3 extends JComponent implements ActionListener, Levels {
	/**
	 * Instance variables
	 */

	private Player thePlayer = new Player(15, 500, 40, 50);
	private KevinBacon theBacon = new KevinBacon(1500, 300, 80, 60, thePlayer);

	//Image when Player loses all health
	private BufferedImage theBaconator = theBacon.loadImageFromFile("KevinBacon.png");

	//Image when Player finishes the Game
	private BufferedImage thePlayer1 = thePlayer.loadImageFromFile("scuba.png");

	private BufferedImage Kevin = theBacon.loadImageFromFile("KevinBacon.png");
	private ArrayList<Obstacles> theBarriers = new ArrayList<Obstacles>();
	private Graphics myG;
	private Obstacles myBackGround = new Obstacles(0, 0, 2880, 800);
	private Obstacles myStart = new Obstacles(0, 550, 150, 40);
	private Obstacles myStartBot = new Obstacles(150, 550, 40, 250);
	private Obstacles jump1 = new Obstacles(245, 500, 100, 30);
	private Obstacles jump2 = new Obstacles(370, 450, 50, 30);
	private Obstacles jump3 = new Obstacles(490, 400, 200, 20);
	private Obstacles overHang = new Obstacles(500, 0, 30, 300);
	private Obstacles overHang2 = new Obstacles(280, 0, 30, 300);
	private Obstacles overHang3 = new Obstacles(740, 0, 30, 300);
	private Obstacles overHang4 = new Obstacles(1040, 0 , 30, 350);
	private Obstacles BaconHang = new Obstacles(890, 350 , 180, 30);
	private Obstacles cliff = new Obstacles(750, 550 , 45, 250);
	private Obstacles cliff2 = new Obstacles(850, 600 , 45, 200);
	private Obstacles cliff3 = new Obstacles(950, 690 , 45, 150);
	private Obstacles cliff4 = new Obstacles(1050, 700 , 45, 100);
	private Obstacles cliff5 = new Obstacles(1150, 750 , 45, 50);
	private Obstacles end = new Obstacles(1250, 750 , 200, 50);
	private Obstacles endOverHang = new Obstacles(1250, 0, 200, 550);
	private Obstacles maze1 = new Obstacles(0, 100, 150, 40);
	private Obstacles maze2 = new Obstacles(150, 100, 10, 150);
	private Obstacles maze3 = new Obstacles(0, 100, 20, 150);
	private Obstacles maze4 = new Obstacles(260, 360, 30, 250);
	private Obstacles maze5 = new Obstacles(560, 420, 20, 250);
	private Obstacles maze6 = new Obstacles(960, 580, 200, 25);
	private Obstacles maze7 = new Obstacles(890, 460, 200, 25);



	private ArrayList<BufferedImage> theFishes = new ArrayList<BufferedImage>();
	private Enemy theFish = new Enemy(900, 0, 100, 150);
	private Enemy theSecondFish = new Enemy(900, 300, 350, 200);
	private BufferedImage scuba = thePlayer.loadImageFromFile("scuba.png");
	private BufferedImage magi = theFish.loadImageFromFile("magikarp.png");
	private BufferedImage bone = theFish.loadImageFromFile("boneShark.png");
	private Timer time = new Timer(5, this);
	/**
	 * This method is used to put the graphics onto the JFrame
	 * Barriers are first added as design -- cliffs
	 * Enemies are added along with the main character
	 * Sand is loaded onto the screen through for loops
	 * Health bar is available here
	 */
	public void paintComponent(Graphics g){
		myG = g;
		theBarriers.add(myStart);
		theBarriers.add(myStartBot);
		theBarriers.add(jump1);
		theBarriers.add(jump2);
		theBarriers.add(jump3);
		theBarriers.add(overHang);
		theBarriers.add(overHang2);
		theBarriers.add(overHang3);
		theBarriers.add(BaconHang);
		theBarriers.add(cliff);
		theBarriers.add(cliff2);
		theBarriers.add(cliff3);
		theBarriers.add(cliff4);
		theBarriers.add(cliff5);
		theBarriers.add(end);
		theBarriers.add(endOverHang);
		theBarriers.add(maze1);
		theBarriers.add(maze2);
		theBarriers.add(maze3);
		theBarriers.add(maze4);
		theBarriers.add(maze5);
		theBarriers.add(maze6);
		theBarriers.add(maze7);
		theBarriers.add(overHang4);
		theFishes.add(magi);
		theFishes.add(bone);
		myG.setColor(Color.BLUE);
		myG.fillRect(myBackGround.getMyLeftX(), myBackGround.getMyTopY(), myBackGround.getMyWidth(), myBackGround.getMyHeight());
		myG.setColor(Color.BLACK);

		myG.fillRect(myStart.getMyLeftX(), myStart.getMyTopY(), myStart.getMyWidth(), myStart.getMyHeight());
		myG.fillRect(myStartBot.getMyLeftX(), myStartBot.getMyTopY(), myStartBot.getMyWidth(), myStartBot.getMyHeight());
		myG.fillRect(jump1.getMyLeftX(), jump1.getMyTopY(), jump1.getMyWidth(), jump1.getMyHeight());
		myG.fillRect(jump2.getMyLeftX(), jump2.getMyTopY(), jump2.getMyWidth(), jump2.getMyHeight());
		myG.fillRect(jump3.getMyLeftX(), jump3.getMyTopY(), jump3.getMyWidth(), jump3.getMyHeight());
		myG.fillRect(overHang.getMyLeftX(), overHang.getMyTopY(), overHang.getMyWidth(), overHang.getMyHeight());
		myG.fillRect(overHang2.getMyLeftX(), overHang2.getMyTopY(), overHang2.getMyWidth(), overHang2.getMyHeight());
		myG.fillRect(overHang3.getMyLeftX(), overHang3.getMyTopY(), overHang3.getMyWidth(), overHang3.getMyHeight());
		myG.fillRect(overHang4.getMyLeftX(), overHang4.getMyTopY(), overHang4.getMyWidth(), overHang4.getMyHeight());
		myG.fillRect(BaconHang.getMyLeftX(), BaconHang.getMyTopY(), BaconHang.getMyWidth(), BaconHang.getMyHeight());
		myG.fillRect(cliff.getMyLeftX(), cliff.getMyTopY(), cliff.getMyWidth(), cliff.getMyHeight());
		myG.fillRect(cliff2.getMyLeftX(), cliff2.getMyTopY(), cliff2.getMyWidth(), cliff2.getMyHeight());
		myG.fillRect(cliff3.getMyLeftX(), cliff3.getMyTopY(), cliff3.getMyWidth(), cliff3.getMyHeight());
		myG.fillRect(cliff4.getMyLeftX(), cliff4.getMyTopY(), cliff4.getMyWidth(), cliff4.getMyHeight());
		myG.fillRect(cliff5.getMyLeftX(), cliff5.getMyTopY(), cliff5.getMyWidth(), cliff5.getMyHeight());
		myG.fillRect(maze1.getMyLeftX(), maze1.getMyTopY(), maze1.getMyWidth(), maze1.getMyHeight());
		myG.fillRect(maze2.getMyLeftX(), maze2.getMyTopY(), maze2.getMyWidth(), maze2.getMyHeight());
		myG.fillRect(maze3.getMyLeftX(), maze3.getMyTopY(), maze3.getMyWidth(), maze3.getMyHeight());
		myG.fillRect(maze4.getMyLeftX(), maze4.getMyTopY(), maze4.getMyWidth(), maze4.getMyHeight());
		myG.fillRect(maze5.getMyLeftX(), maze5.getMyTopY(), maze5.getMyWidth(), maze5.getMyHeight());
		myG.fillRect(maze6.getMyLeftX(), maze6.getMyTopY(), maze6.getMyWidth(), maze6.getMyHeight());
		myG.fillRect(maze7.getMyLeftX(), maze7.getMyTopY(), maze7.getMyWidth(), maze7.getMyHeight());
		myG.fillRect(end.getMyLeftX(), end.getMyTopY(), end.getMyWidth(), end.getMyHeight());
		myG.fillRect(endOverHang.getMyLeftX(), endOverHang.getMyTopY(), endOverHang.getMyWidth(), endOverHang.getMyHeight());

		myG.drawImage(Kevin, theBacon.getMyLeftX(), theBacon.getMyTopY(), theBacon.getWidth(), theBacon.getHeight(), null);
		myG.drawImage(scuba, thePlayer.getMyLeftX(), thePlayer.getMyTopY(), thePlayer.getWidth(), thePlayer.getHeight(), null);
		myG.drawImage(magi, theFish.getMyEnemyLeftX(), theFish.getMyEnemyTopY(), theFish.getWidth(), theFish.getHeight(), null);
		myG.drawImage(bone, theSecondFish.getMyEnemyLeftX(), theSecondFish.getMyEnemyTopY(), theSecondFish.getWidth(), theSecondFish.getHeight(), null);

		time.start();	



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
				time.start();
			}

			//Checks when the player goes off to the right...to end the game
			if((thePlayer.getMyRightX()) >= 1475){
				myG.setColor(Color.YELLOW);
				myG.fillRect(0,0, 2880, 1800);
				myG.setColor(Color.BLACK);
				myG.setFont(new Font("TimesRoman", Font.BOLD, 100)); 
				myG.drawString("WINNER!", 225, 225);

				myG.drawImage(thePlayer1, thePlayer.getMyLeftX(), thePlayer.getMyTopY(), thePlayer.getWidth(), thePlayer.getHeight(), null);
				thePlayer.moveLeft();		
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		theFish.moveEnemyOtherLeft();
		theSecondFish.moveEnemyOtherLeft();
		repaint();
	}

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
				if(this.isHitEnemy(j) || this.isHitEnemyTwo(j) || this.isHitBacon(j)){
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
				if(this.isHitEnemy(j) || this.isHitEnemyTwo(j) || this.isHitBacon(j)){
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
				if(this.isHitEnemy(j) || this.isHitEnemyTwo(j) || this.isHitBacon(j)){
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
				if(this.isHitEnemy(j) || this.isHitEnemyTwo(j) || this.isHitBacon(j)){
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
	 * This method is invoked when it is necessary to subtract "2" from the player's health
	 * The health is deducted 2 and then reset as the new value
	 */
	public void subtractHealth(){
		int theHealth = thePlayer.getHealth();
		theHealth = theHealth - 2;
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
	 * The player's coordinates are set backwards by 10
	 * @param index - an integer to compare to the player's current coordinates
	 * @return boolean value of true or false depending on if the player has been hit
	 */
	public boolean isHitEnemy(int index){
		if((thePlayer.getMyRightX() >= theFish.getMyEnemyLeftX())  && (thePlayer.getMyLeftX() <= theFish.getMyEnemyRightX()) && (thePlayer.getMyBotY() >= theFish.getMyEnemyTopY()) && (thePlayer.getMyTopY() <= theFish.getMyEnemyBotY())){
			subtractHealth(25);
			myG.drawString("Health: " + (thePlayer.getHealth()) + "%", 15, 225);
			myG.setColor(Color.red);
			myG.fillRect(13, 213, (thePlayer.getHealth()), 15);
			thePlayer.setHitCords(15, 500);
			return true;
		}

		return false;
	}
	/**
	 * Method checks to see if the player has been hit by the second fish enemy
	 * If true, health is subtracted
	 * The player's coordinates are set backwards by 10
	 * @param index - an integer to compare to the player's current coordinates
	 * @return boolean value of true or false depending on if the player has been hit
	 */
	public boolean isHitEnemyTwo(int index){
		if((thePlayer.getMyRightX() >= theSecondFish.getMyEnemyLeftX())  && (thePlayer.getMyLeftX() <= theSecondFish.getMyEnemyRightX()) && (thePlayer.getMyBotY() >= theSecondFish.getMyEnemyTopY()) && (thePlayer.getMyTopY() <= theSecondFish.getMyEnemyBotY())){
			subtractHealth(30);
			myG.drawString("Health: " + (thePlayer.getHealth()) + "%", 15, 225);
			myG.setColor(Color.red);
			myG.fillRect(13, 213, (thePlayer.getHealth()), 15);
			thePlayer.setHitCords(15, 500);
			return true;
		}

		return false;
	}
	/**
	 * Method checks to see if the player has been hit by Kevin Bacon
	 * If true, health is subtracted
	 * The player's coordinates are set backwards by 10
	 * @param index - an integer to compare to the player's current coordinates
	 * @return boolean value of true or false depending on if the player has been hit
	 */
	public boolean isHitBacon(int index){
		if((thePlayer.getMyRightX() >= theBacon.getMyLeftX())  && (thePlayer.getMyLeftX() <= theBacon.getMyRightX()) && (thePlayer.getMyBotY() >= theBacon.getMyTopY()) && (thePlayer.getMyTopY() <= theBacon.getMyBotY())){
			subtractHealth(70);
			myG.drawString("Health: " + (thePlayer.getHealth()) + "%", 15, 225);
			myG.setColor(Color.red);
			myG.fillRect(13, 213, (thePlayer.getHealth()), 15);
			thePlayer.setHitCords(15, 500);
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
