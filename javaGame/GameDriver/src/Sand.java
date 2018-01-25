import java.awt.*;
/**
 * This class creates Sand
 * @author lang, mather, sandoval, yates
 *
 */
public class Sand  {
	/**
	 * Instance variable
	 */
	Levels myLevels;

	/**
	 * Default constructor
	 */
	public Sand(Levels aLevel) {
		myLevels = aLevel;
	}

	public void drawSand() {
		Graphics g = myLevels.getG();
		for(int i = 0; i < 1500; i += 7) {
			for(int j = 0; j < 220; j += 7) {
				if (( j <= 15)  ) { // ONE
					g.setColor(Color.BLACK);
					g.fillRect(i, j+700, 6, 6);
					g.setColor(new Color(255,211,155));
					g.fillRect(i, j+700, 5, 5);
				}
				if((j >= 15 ) && (j <= 40)) { //TWO
					g.setColor(Color.BLACK);
					g.fillRect(i, j+700, 6, 6);
					g.setColor(new Color(244,164,96));
					g.fillRect(i, j+700, 5, 5);
				}
				if((j >= 40) && (j <= 62)) { //THREE	
					g.setColor(Color.BLACK);
					g.fillRect(i, j+700, 6, 6);
					g.setColor(new Color(255,165,79));
					g.fillRect(i, j+700, 5, 5);
				}
				if((j >= 62) && (j <= 80)) { //FOUR
					g.setColor(Color.BLACK);
					g.fillRect(i, j+700, 6, 6);
					g.setColor(new Color(238,154,73));
					g.fillRect(i, j+700, 5, 5);
				}
				if((j >= 80) && (j <= 100)) { //FIVE
					g.setColor(Color.BLACK);
					g.fillRect(i, j+700, 6, 6);
					g.setColor(new Color(210,105,30));
					g.fillRect(i, j+700, 5, 5);
				}
				if((j >= 100) && (j <= 120)) { //SIX
					g.setColor(Color.BLACK);
					g.fillRect(i, j+700, 6, 6);
					g.setColor(new Color(139,69,19));
					g.fillRect(i, j+700, 5, 5);
				}
				if((j >= 120) && (j <= 142)) { //SEVEN
					g.setColor(Color.BLACK); 
					g.fillRect(i, j+700, 6, 6);
					g.setColor(new Color(92,51,23));
					g.fillRect(i, j+700, 5, 5);
				}
				if((j >= 142) && (j <= 164)) { //EIGHT
					g.setColor(Color.BLACK);
					g.fillRect(i, j+700, 6, 6);
					g.setColor(new Color(92,64,51));
					g.fillRect(i, j+700, 5, 5);
				}
				if((j >= 164) && (j <= 186)) { //NINE
					g.setColor(Color.BLACK);
					g.fillRect(i, j+700, 6, 6);
					g.setColor(new Color(38,38,38));
					g.fillRect(i, j+700, 5, 5);
				}
				if((j >= 186) && (j <= 215)) { //TEN
					g.setColor(Color.BLACK);
					g.fillRect(i, j+700, 6, 6);
					g.setColor(new Color(3,3,3));
					g.fillRect(i, j+700, 5, 5);
				}
			}
		}	
	}
}

