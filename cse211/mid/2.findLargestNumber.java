//Find the largest number in an Array using Constructor

package largest;

import java.util.Arrays;

public class Largest {
	int lgst;
	public Largest(int[] a, int total){  
		Arrays.sort(a);  
		lgst = a[total-1];;  
		}

}

class LargestofArray {
	public static void main(String args[]) {
		int a[] = { 1, 2, 5, 6, 3, 2 };
		int b[] = { 44, 66, 99, 77, 33, 22, 55 };
		
		
		Largest a1 = new Largest(a, a.length);
		Largest b1 = new Largest(b, b.length);
		System.out.println("Largest: " + a1.lgst);
		System.out.println("Largest: " + b1.lgst);
	}
}

//-----------------------------------------------//
Output:
Largest: 6
Largest: 99
