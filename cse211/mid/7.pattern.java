package qus7;

public class Pattern7 {
	public static void main(String[] args) {

		for (int i = 7; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}


Output:
7 7 7 7 7 7 7 
6 6 6 6 6 6 
5 5 5 5 5 
4 4 4 4 
3 3 3 
2 2 
1 

