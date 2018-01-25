import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 * This class tests various colors that are used for creation of seaweed
 * It also tests the creation of the sand
 * @author Lang
 */

public class TestDriverHolder {
	public static void main(String[] args) {
		Color myColor = new Color(0,255,0);
		Color lightGreen = new Color(112,219,147);
		Color darkGreen = new Color(46,139,87);
		Color seaGreen = new Color(0,100,0);
		Color middleGreen = new Color(34,139,34);
		Color midGreen = new Color(46,139,87);
		Color moreGreen = new Color (46,139,87);
		Color aGreen = new Color(0,128,0);
		Color someGreen = new Color(0,238,118);
		Color green = new Color(105,139,34);
		Color theGreen2 = new Color (110,139,61);
		Color aColor = new Color(0,0,255);

		JFrame myFrame = new JFrame("My World");
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setSize(2880, 1800);
		JPanel myPane = new JPanel(new FlowLayout());
		myFrame.add(myPane);



		Textures theText = new Textures();

	}
}