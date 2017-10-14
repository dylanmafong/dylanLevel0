
import java.util.Random;

import javax.print.attribute.standard.JobKOctetsProcessed;
import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

/* Level 0 Practice: Coding  Exercise #1 */
public class CodingExercise {

	public static void main(String[] args) {
		Robot dylan = new Robot("mini");
		int Base = new Random().nextInt(5);
	
		if (Base == 0) {
			JOptionPane.showMessageDialog(null, "the batter is out");
		} else if (Base == 1) {
			JOptionPane.showMessageDialog(null, "the batter hit a single");
			dylan.setSpeed(50);
			dylan.turn(45);
			dylan.move(100);
		} else if (Base == 2) {
			JOptionPane.showMessageDialog(null, "the batter hit a double");
			dylan.setSpeed(50);
			dylan.turn(45);
			dylan.move(100);
			dylan.turn(-90);
			dylan.move(100);
		} else if (Base == 3) {
			JOptionPane.showMessageDialog(null, "the batter hit a triple");
			dylan.setSpeed(50);
			dylan.turn(45);
			dylan.move(100);
			dylan.turn(-90);
			dylan.move(100);
			dylan.turn(-90);
			dylan.move(100);
		} else if (Base == 4) {
			JOptionPane.showMessageDialog(null, "the batter hit a Home Run!");
			dylan.setSpeed(50);
			dylan.turn(45);
			dylan.move(100);
			dylan.turn(-90);
			dylan.move(100);
			dylan.turn(-90);
			dylan.move(100);
			dylan.turn(-90);
			dylan.move(100);
		}

	}

	// 1. Create a random number from 0 to 4 and store it in a ‘bases’ variable
	// 2. If the number is zero display a window that says “the batter is out”
	// 3. Otherwise display “the batter hit a ” and “single”, “double”, “triple” or “home run”
	// 4. Make the robot draw the path of the base runner. For example, if
	// the batter hit a double, draw a line from home plate to first and another line from
	// first to second. Home plate should be at the bottom and first should be on the
	// right. You do not need to draw the bases themselves or any other features.

}
