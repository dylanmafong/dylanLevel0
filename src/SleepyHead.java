
import javax.swing.JOptionPane;

public class SleepyHead {

	public static void main(String[] args) {

		boolean isWeekday, isVacation = false;
		int x = JOptionPane.showConfirmDialog(null, "Is it a weekday?", "", JOptionPane.YES_NO_OPTION);
		if (x == 0) {
			isWeekday = true;
			int y = JOptionPane.showConfirmDialog(null, "Is it a vacation?", "", JOptionPane.YES_NO_OPTION);
			if (y == 0) {
				isVacation = true;

			} else {
				isVacation = false;
				
			}
		} else {
			isWeekday = false;
		}
		 if(isWeekday&&!isVacation) {
		JOptionPane.showMessageDialog(null, "get up lazy bones");
		 
		 }
		 
		 
		 
		if(isVacation&&isWeekday) {
		JOptionPane.showMessageDialog(null, "Sleep in");
		}
		if(!isWeekday) {
			JOptionPane.showMessageDialog(null, "Sleep in");
		}
		/*
		 * Ask the user for these values using JOptionPane.showConfirmDialog(null,
		 * "is it a weekday?", "", JOptionPane.YES_NO_OPTION);
		 */

		/*
		 * Print “sleep in” if it is a vacation or a weekend. If it’s a weekday, print
		 * “get up lazybones!” If it is a weekday, and we are on vacation, print “sleep
		 * in”.
		 */
	}
	}
