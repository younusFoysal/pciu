package over;




//Program to Overriding 
class Animal {
	void eat() {
		System.out.println("eating...");
	}
}

class Dog extends Animal {
	void eat() {
		System.out.println("eating bread...");
	}
}





public class Over {

	// Program to overload three methods with the same name
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
		
		// Overloading
		Over ob = new Over();
		System.out.println(ob.add(15, 25));
		System.out.println(ob.add(15, 25, 35));
		System.out.println(ob.add(11.5, 22.5));
		
		
		// Overriding 
		Dog obj = new Dog();
		obj.eat();
	}
}



// ## Output:


40
75
34.0
eating bread...
