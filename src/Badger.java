
public class Badger {
	public static void main(String[] args) {
		String b = "Badger ";
		String m = "Mushroom ";
		String s = " A Snake";
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(b + b + b + b);
			}
			if (i < 3) {
				System.out.println(m + m);
			} else {
				System.out.println(s + s + s + s);
			}
		}
	}
}
