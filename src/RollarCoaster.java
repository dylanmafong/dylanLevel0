import javax.swing.JOptionPane;

public class RollarCoaster {
public static void main(String[] args) {
	   String tall = JOptionPane.showInputDialog("how tall are you");
	   int tal = Integer.parseInt(tall);
	   if(tal < 4) {
		   JOptionPane.showMessageDialog(null, "go back to preschool");
	   }else {
		   JOptionPane.showMessageDialog(null, "enjoy the ride");
	   }
}
}
