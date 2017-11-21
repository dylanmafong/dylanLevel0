import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {

		// 1. Watch the first 2 minutes of this movie: http://vimeo.com/2485018

		// 2. On paper, write all the numbers that get printed when you run this class

		// 4,4,1,3,1,4,2,2,4,4,3,4,3
		// 3. Use the randomNumber to give the user a random compliment.
		for (int i = 0; i < 10; i++) {

			int randomNumber = new Random().nextInt(5);
			System.out.println(randomNumber);
			if (randomNumber == 0) {
				JOptionPane.showMessageDialog(null, "you look very good today");
			} else if (randomNumber == 1) {
				JOptionPane.showMessageDialog(null, "you are very nice");
			} else if (randomNumber == 2) {
				JOptionPane.showMessageDialog(null, "you are wearing a very nice shirt");
			} else if (randomNumber == 3) {
				JOptionPane.showMessageDialog(null, "those are very cool shoes you have on");
			} else if (randomNumber == 4) {
				JOptionPane.showMessageDialog(null, "you are very awesome");
			} else if (randomNumber == 5) {
				JOptionPane.showMessageDialog(null, "your hair look very nice");
			} else if (randomNumber == 6) {
				JOptionPane.showMessageDialog(null, "you are very nice");
			}

			// 4. Repeat all the code above 10 times

			// 5. Find someone to test out your program. They will like it :)
		}
	}
}
