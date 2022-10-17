//Write a Java program to calculate area of circle using constructor.

package findarea;

import java.util.Scanner;
public class Area
{
	double area;
	Area(double r)
	{
	 area= (3.1416*r*r);

	}
}
class AreaOfCircle 
{
   public static void main(String args[]) 
    {   
      Scanner s= new Scanner(System.in);
      System.out.println("Enter the radius:");
      double rad= s.nextDouble();      
      Area  a=new Area(rad);
      System.out.println("Area of Circle is: " + a.area);      
   }
 }


//---------------------------------------
Output: 
Enter the radius:
4
Area of Circle is: 50.26544
