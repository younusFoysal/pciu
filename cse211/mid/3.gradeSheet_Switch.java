package grades;

import java.util.Scanner;


public class Student {
	public static void main(String[] args) {
	      // score (0-100)
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter marks: ");
		int marks = input.nextInt();
		
	      String grade = null;
	      
	      switch(marks/10) {
	        // for >= 90
	        case 10:
	        case 9:
	           grade = "A";
	           break;
	        // for >= 80 and <90
	        case 8:
	           grade = "B";
	           break;
	        // for >= 70 and <80
	        case 7:
	           grade = "C";
	           break;
	        // for >= 60 and <70
	        case 6:
	           grade = "D";
	           break;
	        // for >= 50 and <60
	        case 5:
	           grade = "E";
	           break;
	        // for < 50
	        default:
	           grade = "F";
	           break;
	      }
	      
	      // display result
	      System.out.println("Grade = " + grade);
	   }

}




OutPut: 
Enter marks: 
87
Grade = B




