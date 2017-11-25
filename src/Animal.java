import javax.swing.JOptionPane;

public class Animal {
public static void main(String[] args) {
	String animal = JOptionPane.showInputDialog("give me an animal");
	if(animal.equals("dog")) {
		JOptionPane.showMessageDialog(null,"dogs go wolf");
	}
	else if(animal.equals("cat")) {
		JOptionPane.showMessageDialog(null,"cats go meow");
	}else {
		JOptionPane.showMessageDialog(null, "I don't know that animal");
	}
	
}
}
