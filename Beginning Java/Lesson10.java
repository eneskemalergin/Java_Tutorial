// Author : Enes Kemal Ergin
/*
This Lesson includes;
	- Static Variables
	- Static Methods
	- Dependecy
*/
public class Lesson10{
	public static void main(String[] args) {
		// Static variables:
			// When they initialized they can be used 
			// class_name.variable_name <- will give variable's value.
		// Static methods:
			// Math class is static methods.
			// you need to call like:
				// class_name.method_name 
	
		// We defined Reflection class, which has static variable : count
			// and static method: getCount()
		Reflection obj;
		obj = new Reflection("Reflection is inevitable!");
		System.out.println(obj);

		obj = new Reflection("Talk is cheap, show me the code!");
		System.out.println(obj);

		obj = new Reflection("This is the last thing you will hear from me!");
		System.out.println(obj);

		System.out.println("# of Sentences: " + Reflection.getCount());

		/*
		 	Dependecy is a relationship between classes, because 
		 	classes can relay on each other. This may cause some problem 
		 	if you are working with more than 10 classes, oh my!
		 	So understanding dependacy is very important.
		*/
		RationalNumber r1 = new RationalNumber (6, 8);
		RationalNumber r2 = new RationalNumber (1, 3);
		RationalNumber r3, r4, r5, r6, r7;
		
		System.out.println ("First rational number: " + r1);
		System.out.println ("Second rational number: " + r2);
		
		if (r1.isLike(r2))
			System.out.println ("r1 and r2 are equal.");
		else
			System.out.println ("r1 and r2 are NOT equal.");
		r3 = r1.reciprocal();
		System.out.println ("The reciprocal of r1 is: " + r3); 	
		r4 = r1.add(r2);
		r5 = r1.subtract(r2);
		r6 = r1.multiply(r2);
		r7 = r1.divide(r2);
		
		System.out.println ("r1 + r2: " + r4);
		System.out.println ("r1 - r2: " + r5);
		System.out.println ("r1 * r2: " + r6);
		System.out.println ("r1 / r2: " + r7);
	}	
}