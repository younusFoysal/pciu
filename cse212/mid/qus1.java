package array;
import java.util.*;

class Sum {
	public int sumarray(int[] myarray) {
		int sum = 0;
		for (int i = 0; i < myarray.length; i++) {
			sum = sum + myarray[i];
		}
		return sum;
	}
}


class Avg {
	public float avgarray(int[] myarray) {
		int sum = 0;
		for (int i = 0; i < myarray.length; i++) {
			sum = sum + myarray[i];
		}
		
		float avg=(float)(sum/myarray.length);
		return avg;
	}
}


public class Array {
	public static void main(String args[]) {

		int[] myArray = { 43, 54, 23, 65, 78, 85, 88, 92, 10 };
		System.out.println("Input Array:" + Arrays.toString(myArray));

		Sum obj1 = new Sum();
		System.out.println("Sum of the given array is: " + obj1.sumarray(myArray));

		Avg obj2 = new Avg();
		System.out.println("Average of the given array is: " + obj2.avgarray(myArray));

	}
}
