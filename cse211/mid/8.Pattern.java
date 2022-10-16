package qus8;

public class Pattern8 {
	public static void main(String[] args) {
		int a = 7, i, j;
		for (i = 1; i <= a; i++) {
			for (j = 0; j < i; j++) {
				System.out.print(i);
			}
			System.out.println(" ");
		}
	}
}


Output: 
1 
22 
333 
4444 
55555 
666666 
7777777 

