package grades;

import java.util.Scanner;

public class Marks {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter percentage marks:");
		double percentage = scan.nextDouble();

		if(percentage >= 80){
			System.out.println("Excellent: Grade A+");
		}else if(percentage < 80 && percentage >= 75){
			System.out.println("Very Good: Grade A");
		}else if(percentage < 75 && percentage >= 70){
			System.out.println("Good: Grade A-");
		}else if(percentage < 70 && percentage >= 65){
			System.out.println("Satisfactory: Grade B+");
		}else if(percentage < 65 && percentage >= 60){
			System.out.println("Work Hard: Grade B");
		}else if(percentage < 60 && percentage >= 55){
			System.out.println("Work Hard: Grade B-");
		}else if(percentage < 55 && percentage >= 50){
			System.out.println("Work Hard: Grade C+");
		}else if(percentage < 50 && percentage >= 45){
			System.out.println("Work Hard: Grade C");
		}else if(percentage < 45 && percentage >= 40){
			System.out.println("Work Hard: Grade D");
		}else if(percentage < 40 && percentage == 40){
			System.out.println("Just Passed: Grade F");
		}else {
			System.out.println("Failed!");
		}
	}

}


// ## Output:
Enter percentage marks:
77
Very Good: Grade A
