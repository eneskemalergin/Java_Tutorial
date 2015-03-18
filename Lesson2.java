// Author : Enes Kemal Ergin
/*
This Lesson includes;
	- Variables
	- Constant Decleration
	- Overriding
	- Arithmetic Operators
	- Incrementation, Decrementation
	- Data Conversion
	- Scanner Class and Getting Input
*/

// We need to call this for using scanner.
import java.util.Scanner;
public class Lesson2{
	public static void main (String[] args){

		// Variable types and how to declare them
		int integers = 100;
		double floats = 1.5;
		double big_floats = 1243.756;
		char letter = 'A';
		char number = '7';
		// This is constant type declaration: You cannot override it.
		final int CONSTANT = 43;

		// Overriding
	  	int sides = 7;  // declaration with initialization
      	System.out.println ("A heptagon has " + sides + " sides.");
      	sides = 10;  // assignment statement
      	System.out.println ("A decagon has " + sides + " sides.");
		sides = 12;
      	System.out.println ("A dodecagon has " + sides + " sides.");

      	// TempConverter
      	final int BASE = 32;
      	final double CONVERSION_FACTOR = 9.0/5.0;

      	double fahrenheitTemp;
      	int celciusTemp = 24; 
      	fahrenheitTemp = celciusTemp * CONVERSION_FACTOR + BASE;

      	System.out.println("Celcius Temperature: " + celciusTemp);
      	System.out.println("Fahrenheit Equivalent: " + fahrenheitTemp);

      	int num1 = 1;
      	++num1; // Pre incrementation
      	System.out.println(num1);
      	System.out.println(num1++);// Post incrementation
      	System.out.println(num1--);// Pre decrementation
      	System.out.println(--num1); // Post Decrementation

		/*
		from byte to char
		from short to byte or char
		from char to byte or short
		from int to byte, short, or char
		from long to byte, short, char, or int
		from float to byte, short, char, int, or long
		from double to byte, short, char, int, long, or float
		*/
      	String input;
      	// Look at 11th line
		// this statement will make sense after learning Object Oriented
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your input: ");
		input = scan.nextLine();

		System.out.println ("You entered: \"" + input + "\"");
	}
}
