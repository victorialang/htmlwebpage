import java.io.*;
import sun.audio.*;
import java.awt.*;
import javax.swing.*;

/**
 * This is the world class that sets up all of the levels
 * The levels are created, titled, and add things into them
 * @author lang, mather, sandoval, yates
 *
 */
public class World {
	/**
	 * Instance variables
	 */
	JFrame theWorld = new JFrame();
	JFrame theLevel1 = new JFrame();
	JFrame theLevel2 = new JFrame();
	JFrame theLevel3 = new JFrame();
	Components physicalObjects = new Components();
	World1 level1 = new World1();
	World2 level2 = new World2();
	World3 level3 = new World3();

	/**
	 * This initializes the world
	 * Physical objects are added to the world
	 * KeyListeners are added to the physical objects
	 * The title is set as "Project NX- Please understand"
	 */

	public void intializeWorld(){
		theWorld.setSize(600, 2000);
		theWorld.setTitle("Project NX- Please understand");
		theWorld.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		theWorld.add(physicalObjects);
		theWorld.setVisible(true);
		theWorld.addKeyListener(new KeyController(physicalObjects));
		while(true){
			SwingUtilities.updateComponentTreeUI(theWorld);
			theWorld.setSize(600, 2000);
			theWorld.setTitle("Project NX- Please understand");
			theWorld.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			theWorld.add(physicalObjects);
			theWorld.setVisible(true);
			theWorld.addKeyListener(new KeyController(physicalObjects));
			while(true){
				SwingUtilities.updateComponentTreeUI(theWorld);
			}
		}
	}	
	/**
	 * This initializes the 3 levels
	 * Each level has a set size, title, and keyListener
	 * Various components are added to the user interface
	 */
	public void intializeWorld2(){
		int theCord = level1.getPlayer().getMyRightX();
		int theCord2 = level2.getPlayer().getMyRightX();
		int theCord3 = level3.getPlayer().getMyRightX();
		theLevel1.setSize(600, 2000);
		theLevel1.setTitle("Project NX- Please understand");
		theLevel1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		theLevel1.add(level1);
		theLevel1.setVisible(true);
		theLevel1.addKeyListener(new KeyController(level1));
		while(theCord <= 1475){ 
			SwingUtilities.updateComponentTreeUI(theLevel1);
			theLevel1.setSize(600, 2000);
			theLevel1.setTitle("Project NX- Please understand");
			theLevel1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			theLevel1.add(level1);
			theLevel1.setVisible(true);
			theLevel1.addKeyListener(new KeyController(level1));
			while(theCord <= 1475){ 
				SwingUtilities.updateComponentTreeUI(theLevel1);
				theCord = level1.getPlayer().getMyRightX();
			}
		}
		theLevel2.setSize(600, 2000);
		theLevel2.setTitle("Project NX- Please understand");
		theLevel2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		theLevel2.add(level2);
		theLevel2.setVisible(true);
		theLevel2.addKeyListener(new KeyController(level2));
		while(theCord2 <= 1475){
			SwingUtilities.updateComponentTreeUI(theLevel2);
			theLevel2.setSize(600, 2000);
			theLevel2.setTitle("Project NX- Please understand");
			theLevel2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			theLevel2.add(level2);
			theLevel2.setVisible(true);
			theLevel2.addKeyListener(new KeyController(level2));
			while(theCord2 <= 1475){
				SwingUtilities.updateComponentTreeUI(theLevel2);
				theCord2 = level2.getPlayer().getMyRightX();
			}
		}
		theLevel3.setSize(600, 2000);
		theLevel3.setTitle("Project NX- Please understand");
		theLevel3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		theLevel3.add(level3);
		theLevel3.setVisible(true);
		theLevel3.addKeyListener(new KeyController(level3));
		while(theCord3 <= 1475){
			SwingUtilities.updateComponentTreeUI(theLevel3);
			theLevel3.setSize(600, 2000);
			theLevel3.setTitle("Project NX- Please understand");
			theLevel3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			theLevel3.add(level3);
			theLevel3.setVisible(true);
			theLevel3.addKeyListener(new KeyController(level3));
			while(theCord3 <= 1475){
				SwingUtilities.updateComponentTreeUI(theLevel3);
				theCord3 = level3.getPlayer().getMyRightX();
			}
		}
	}
}
