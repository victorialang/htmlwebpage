import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import javax.swing.*;

/**
 * This the main drawing class of the project 
 * @author reidmather
 *
 */

/**
 * this is the main test world of the project, all of this was use to make sure anything we put in the game worked, thought it was important to leave due to that
 * @author joeyates
 *
 */

public class Components extends JComponent implements ActionListener, Levels{
	/**
	 * Instance variables
	 */
	private Player thePlayer = new Player(300, 250, 40, 50);
	private KevinBacon theBacon = new KevinBacon(922, 440, 80, 60, thePlayer);

	//Image of Kevin Bacon at the end
	private KevinBacon theBacon1 = new KevinBacon(1000, 300, 80, 60, thePlayer);
	private BufferedImage theBaconator = theBacon1.loadImageFromFile("KevinBacon.png");

	private int x = 900, y = 350, velX = 4;
	private Enemy theFish = new Enemy(900, 350, 200, 150);

	private Enemy theOtherFish = new Enemy(1, 300, 250, 100);
	private BufferedImage shamoo = new BufferedImage(x, y, velX);
	private BufferedImage blueWhale = new BufferedImage(x, y, velX);
	private ArrayList<BufferedImage> theFishes = new ArrayList<BufferedImage>();

	private ArrayList<Obstacles> theBarriers = new ArrayList<Obstacles>();
	private Obstacles background = new Obstacles(0, 0, 1450, 800);
	private Obstacles ceiling = new Obstacles(0,0, 1450, 200);
	private Obstacles seaFloor = new Obstacles(0, 600, 1450, 200);
	private Obstacles jump1 = new Obstacles(100, 400, 50, 50);
	private Obstacles jump2 = new Obstacles(300, 500, 25, 10);
	private Obstacles jump3 = new Obstacles(1300, 500, 70, 10);
	private Obstacles jump4 = new Obstacles(900, 500, 70, 10);
	private Obstacles jump5 = new Obstacles(700, 550, 40, 20);
	private Obstacles jump6 = new Obstacles(920, 450, 30, 10);
	private Obstacles wall = new Obstacles(100, 570, 50, 50);

	private Graphics myG;
	private int gravityTracker = 0;
	//private Rocks aRock = new Rocks(600,600, this);
	Timer t = new Timer(5, this);
	/**
	 * Draws the objects to the screen:
	 * Barriers
	 * Health bar
	 */
	public void paintComponent(Graphics g){
		myG = g;
		theBarriers.add(ceiling);
		theBarriers.add(seaFloor);
		theBarriers.add(jump1);
		theBarriers.add(jump2);
		theBarriers.add(jump3);
		theBarriers.add(jump4);
		theBarriers.add(jump5);
		theBarriers.add(jump6);
		theBarriers.add(wall);

		theFishes.add(shamoo);

		theFishes.add(blueWhale);

		myG.setColor(Color.BLUE);
		myG.fillRect(background.getMyLeftX(), background.getMyTopY(), background.getMyWidth(), background.getMyHeight());
		myG.setColor(Color.BLACK);
		myG.fillRect(ceiling.getMyLeftX(), ceiling.getMyTopY(), ceiling.getMyWidth(), ceiling.getMyHeight());
		myG.fillRect(seaFloor.getMyLeftX(), seaFloor.getMyTopY(), seaFloor.getMyWidth(), seaFloor.getMyHeight());
		myG.fillRect(jump1.getMyLeftX(), jump1.getMyTopY(), jump1.getMyWidth(), jump1.getMyHeight());
		myG.fillRect(jump2.getMyLeftX(), jump2.getMyTopY(), jump2.getMyWidth(), jump2.getMyHeight());
		myG.fillRect(jump3.getMyLeftX(), jump3.getMyTopY(), jump3.getMyWidth(), jump3.getMyHeight());
		myG.fillRect(jump4.getMyLeftX(), jump4.getMyTopY(), jump4.getMyWidth(), jump4.getMyHeight());
		myG.fillRect(jump5.getMyLeftX(), jump5.getMyTopY(), jump5.getMyWidth(), jump5.getMyHeight());
		myG.fillRect(jump6.getMyLeftX(), jump6.getMyTopY(), jump6.getMyWidth(), jump6.getMyHeight());
		myG.fillRect(wall.getMyLeftX(), wall.getMyTopY(),  wall.getMyWidth(), wall.getMyHeight());

		//Loads in the Player and draws it in window
		BufferedImage goldie = thePlayer.loadImageFromFile("scuba.png");
		myG.drawImage(goldie, thePlayer.getMyLeftX(), thePlayer.getMyTopY(), thePlayer.getWidth(), thePlayer.getHeight(), null);

		//Loads in Kevin Bacon and draws it in window
		BufferedImage Kevin = theBacon.loadImageFromFile("KevinBacon.png");
		myG.drawImage(Kevin,theBacon.getMyLeftX(), theBacon.getMyTopY(), theBacon.getWidth(), theBacon.getHeight(), null);

		blueWhale = theFish.loadImageFromFile("blueWhale.png");
		myG.drawImage(blueWhale, theOtherFish.getMyEnemyLeftX(), theOtherFish.getMyEnemyTopY(), theOtherFish.getWidth(), theOtherFish.getHeight(), null);

		t.start();

		//Checks if the Player's health is 0 to end game
		if(thePlayer.getHealth() <= 0){
			GameOver();
		}
		//sand
		for(int i = 0; i < 1500; i += 7) {
			for(int j = 0; j < 220; j += 7) {
				if (( j <= 15)  ) { // ONE
					myG.setColor(Color.BLACK);
					myG.fillRect(i, j+570, 6, 6);
					myG.setColor(new Color(255,211,155));
					myG.fillRect(i, j+570, 5, 5);
				}
				if((j >= 15 ) && (j <= 40)) { //TWO
					myG.setColor(Color.BLACK);
					myG.fillRect(i, j+570, 6, 6);
					myG.setColor(new Color(244,164,96));
					myG.fillRect(i, j+570, 5, 5);
				}
				if((j >= 40) && (j <= 62)) { //THREE	
					myG.setColor(Color.BLACK);
					myG.fillRect(i, j+570, 6, 6);
					myG.setColor(new Color(255,165,79));
					myG.fillRect(i, j+570, 5, 5);
				}
				if((j >= 62) && (j <= 80)) { //FOUR
					myG.setColor(Color.BLACK);
					myG.fillRect(i, j+570, 6, 6);
					myG.setColor(new Color(238,154,73));
					myG.fillRect(i, j+570, 5, 5);
				}
				if((j >= 80) && (j <= 100)) { //FIVE
					myG.setColor(Color.BLACK);
					myG.fillRect(i, j+570, 6, 6);
					myG.setColor(new Color(210,105,30));
					myG.fillRect(i, j+570, 5, 5);
				}
				if((j >= 100) && (j <= 120)) { //SIX
					myG.setColor(Color.BLACK);
					myG.fillRect(i, j+570, 6, 6);
					myG.setColor(new Color(139,69,19));
					myG.fillRect(i, j+570, 5, 5);
				}
				if((j >= 120) && (j <= 142)) { //SEVEN
					myG.setColor(Color.BLACK); 
					myG.fillRect(i, j+570, 6, 6);
					myG.setColor(new Color(92,51,23));
					myG.fillRect(i, j+570, 5, 5);
				}
				if((j >= 142) && (j <= 164)) { //EIGHT
					myG.setColor(Color.BLACK);
					myG.fillRect(i, j+570, 6, 6);
					myG.setColor(new Color(92,64,51));
					myG.fillRect(i, j+570, 5, 5);
				}
				if((j >= 164) && (j <= 186)) { //NINE
					myG.setColor(Color.BLACK);
					myG.fillRect(i, j+570, 6, 6);
					myG.setColor(new Color(38,38,38));
					myG.fillRect(i, j+570, 5, 5);
				}
				if((j >= 186) && (j <= 215)) { //TEN
					myG.setColor(Color.BLACK);
					myG.fillRect(i, j+570, 6, 6);
					myG.setColor(new Color(3,3,3));
					myG.fillRect(i, j+570, 5, 5);
				}
			}
		}

		//Draws the Health Bar
		g.setColor(Color.darkGray);
		g.fillRect(10, 210, 105, 20);
		myG.setColor(Color.red);
		myG.fillRect(13, 213, (thePlayer.getHealth()), 15);
		g.setColor(Color.WHITE);
		g.drawString("Health: " + thePlayer.getHealth() + "%" , 15, 225);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		theBacon1.moveEnd(theBaconator);
		repaint();
	}

	public boolean isHit(int index){
		if((thePlayer.getMyRightX() <= theBarriers.get(index).getMyLeftX()) ||
				(thePlayer.getMyLeftX() >= theBarriers.get(index).getMyRightX()) || 
				(thePlayer.getMyBotY() <= theBarriers.get(index).getMyTopY()) ||
				(thePlayer.getMyTopY() >= theBarriers.get(index).getMyBotY())){
			return false;
		}
		System.out.println("Hit");
		subtractHealth();
		myG.drawString("Health: " + (thePlayer.getHealth()) + "%", 15, 225);
		myG.setColor(Color.red);
		myG.fillRect(13, 213, (thePlayer.getHealth()), 15);
		System.out.println(thePlayer.getHealth());
		return true;

	}

	public void subtractHealth(){
		int theHealth = thePlayer.getHealth();
		theHealth = theHealth - 2;
		thePlayer.setHealth(theHealth);
	}

	public void GameOver(){
		myG.setColor(Color.WHITE);
		myG.fillRect(0,0, 2880, 1800);
		myG.setColor(Color.BLACK);
		myG.setFont(new Font("TimesRoman", Font.BOLD, 100)); 
		myG.drawString(" **GAME OVER!** ", 225, 225);

		myG.drawImage(theBaconator, theBacon1.getMyLeftX(), theBacon1.getMyTopY(), theBaconator.getWidth(), theBaconator.getHeight(), null);
		theBacon1.moveEnd(theBaconator);
	}

	public boolean rightIsHit(int index){
		if(thePlayer.getMyRightX() <= theBarriers.get(index).getMyLeftX()){
			return false;
		}
		return true;
	}

	public boolean LeftIsHit(int index){
		if(thePlayer.getMyLeftX() >= theBarriers.get(index).getMyRightX()){
			return false;
		}
		return true;
	}

	public boolean TopIsHit(int index){
		if(thePlayer.getMyBotY() <= theBarriers.get(index).getMyTopY()){
			return false;
		}
		return true;
	}

	public boolean BotIsHit(int index){
		if(thePlayer.getMyTopY() >= theBarriers.get(index).getMyBotY()){
			return false;
		}
		return true;
	}

	public boolean isHitEnemy(int index){
		if((thePlayer.getMyRightX() >= theOtherFish.getMyEnemyLeftX())  && (thePlayer.getMyLeftX() <= theOtherFish.getMyEnemyRightX()) && (thePlayer.getMyBotY() >= theOtherFish.getMyEnemyTopY()) && (thePlayer.getMyTopY() <= theOtherFish.getMyEnemyBotY())){
			System.out.println("hit all");
			return true;
		}
		return false;
	}
	/**
	 * Getter methods for player and Graphics object
	 */
	public Graphics getG() {
		return myG;
	}

	public Player getPlayer(){
		return thePlayer;
	}
	/**
	 * Methods that must be implemented for components class
	 */
	@Override
	public void keyPressed(KeyEvent e) {

	}
	@Override
	public void keyReleased(KeyEvent e) {

	}
}