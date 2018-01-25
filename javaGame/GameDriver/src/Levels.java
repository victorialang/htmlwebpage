import java.awt.Graphics;
import java.awt.event.KeyEvent;
/**
 * This is an interface to define levels
 * @author lang, mather, sandoval, yates
 *
 */

public interface Levels {
	/**
	 * Methods that must be implemented in classes that implement this interface
	 */
	public Graphics getG();
	public void keyPressed(KeyEvent e);
	public void keyReleased(KeyEvent e);
	public Player getPlayer();
}
