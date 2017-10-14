+import javax.swing.JOptionPane;

public class NumberSorter {
	public static void main(String[] args) {
		String NumberOne = JOptionPane.showInputDialog("give me your first number");
		String NumberTwo = JOptionPane.showInputDialog("give me your second number");
		String NumberThree = JOptionPane.showInputDialog("give me your third number number");

		int int1 = Integer.parseInt(NumberOne);
		int int2 = Integer.parseInt(NumberTwo);
		int int3 = Integer.parseInt(NumberThree);
		if (int1 < int2 && int1 < int3) {
			System.out.println(NumberOne);

			if (int2 < int3) {
				System.out.println(NumberTwo);
				System.out.println(NumberThree);
			} else {
				System.out.println(NumberThree);
				System.out.println(NumberTwo);

			}
		}
		if (int2 < int1 && int2 < int3) {
			System.out.println(NumberTwo);

			if (int1 < int3) {
				System.out.println(NumberOne);
				System.out.println(NumberThree);

			} else {
				System.out.println(NumberThree);
				System.out.println(NumberOne);
			}
		}
		if (int3 < int1 && int3 < int2) {
			System.out.println(NumberThree);
			if (int2 < int1) {
				System.out.println(NumberTwo);
				System.out.println(NumberOne);
			}
			else {		
				System.out.println(NumberOne);
				System.out.println(NumberTwo);	}
		}
	}
}
