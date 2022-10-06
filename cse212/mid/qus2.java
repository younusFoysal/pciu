package fact;
import java.util.*;

public class Fact {
	static int factorial(int n) {
		if (n == 0)
			return 1;
		else
			return (n * factorial(n - 1));
	}

	
	
	public static void main(String args[]) {
		int fact = 1;
		
		Scanner input =new Scanner(System.in);
		System.out.print("Enter The number to get Factorial : "); 
        int number = input.nextInt(); 
		
		
        fact = factorial(number);
		System.out.println("Factorial of " + number + " is: " + fact);
	}
}
