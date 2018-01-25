import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
/**
 * @author lang, mather, sandoval, yates
 */
public class KeyController extends KeyAdapter{
	Levels myGame;
	public KeyController(Levels someGame){
		myGame = someGame;
	}
	public void keyPressed(KeyEvent e){
		myGame.keyPressed(e);
	}
	public void keyReleased(KeyEvent e){
		myGame.keyReleased(e);
	}


}
