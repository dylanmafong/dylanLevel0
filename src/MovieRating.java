import javax.swing.JOptionPane;

public class MovieRating {
	public static void main(String[] args) {
		 String number=JOptionPane.showInputDialog(null, "How old are you");
		int num=Integer.parseInt(number);
		if (num >= 18) {
			JOptionPane.showMessageDialog(null, "You can go to any movie you want");
		}
		if ( num >=0&&num <= 17) {
			JOptionPane.showMessageDialog(null,"You can go to any movie you want, but you have to go to rated R movies with a parent");
		}
		if (num < 0) {
			JOptionPane.showMessageDialog(null, "ERROR!");
		}
	}
}
