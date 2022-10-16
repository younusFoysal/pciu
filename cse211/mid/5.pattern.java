package qus5;

public class Pattern5 {
	public static void main(String[] args) {

		for (int i = 0; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println("");
		}
		for (int i = 3; i >= 0; i--) {
			for (int j = 0; j <= i - 1; j++) {
				System.out.print(i);
			}
			System.out.println("");
		}
	}
}


Output:
1
22
333
4444
333
22
1


