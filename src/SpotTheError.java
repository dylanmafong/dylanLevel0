import javax.print.attribute.standard.JobKOctetsProcessed;
import javax.swing.JOptionPane;

public class SpotTheError {
	@SuppressWarnings("all") public static void main(String[] args) {
		String x = JOptionPane.showInputDialog(null, "Give me a number");
		int num = Integer.parseInt(x);
		for (int i = 0; i <num; i++) {
			System.out.println(num);
			
		}
	}
}
