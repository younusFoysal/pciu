

// ## overloading

package over;

public class Over {
	
	//Program to overload three methods with the same name
	public int add(int a, int b) {
		return (a + b);
	}

	public int add(int a, int b, int c) {
		return (a + b + c);
	}

	public double add(double a, double b) {
		return (a + b);
	}

	public static void main(String args[]) {
		Over ob = new Over();
		System.out.println(ob.add(15, 25));
		System.out.println(ob.add(15, 25, 35));
		System.out.println(ob.add(11.5, 22.5));
	}
}

// ## Output:
40
75
34.0



// ## overloading
  
class Vehicle{  
  void run(){System.out.println("Vehicle is running");}  
}  
 
class Bike2 extends Vehicle{  
  void run(){System.out.println("Bike is running safely");}  
  
  public static void main(String args[]){  
  Bike2 obj = new Bike2();   
  obj.run();   
  }  
}  

// ## Output:

Bike is running safely


