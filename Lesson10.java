// Author : Enes Kemal Ergin
/*
This Lesson includes;
	- Static Variables
	- Static Methods
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
	}	
}