package qus4;

public class Pattern {
	public static void main(String[] args) {

		for (int i = 0; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println("");
		}
		for (int i = 5; i >= 0; i--) {
			for (int j = 1; j <= i - 1; j++) {
				System.out.print(j);
			}
			System.out.println("");
		}
	}

}



Output:


1
12
123
1234
12345
1234
123
12
1

