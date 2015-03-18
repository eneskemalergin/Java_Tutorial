// Author : Enes Kemal Ergin
/*
This Lesson includes;
	- Aggregation
	- Interfaces
*/
import java.util.Scanner;

public class Lesson11{

	/*
		Some objects are made up other objects. Aggregation is a piece of code
		which represents more than 1 classes' come together

		We define aggregat bject as any object that contains references to 
		other objects as instance data.


	*/
	public static void main(String[] args) {
	
		// Following code uses both Student and Address Classes
		Address school = new Address ("800 Lancaster Ave.", "Villanova",
			"PA", 19085);
		Address jHome = new Address ("21 Jump Street", "Lynchburg",
			"VA", 24551);
		Student john = new Student ("John", "Smith", jHome, school);
		Address mHome = new Address ("123 Main Street", "Euclid", "OH",
			44132);
		Student marsha = new Student ("Marsha", "Jones", mHome, school);
		
		System.out.println (john);
		System.out.println ();
		System.out.println (marsha);
	
	/*
		Interface is a collection of constants and abstract methods.
		Abstract method is a method that does not have an implementation	
	*/

		// Mini Quiz using Complexity interface and Question class
	
		Question q1, q2;
		String possible;
		Scanner scan = new Scanner (System.in);
		q1 = new Question ("What is the capital of Jamaica?", "Kingston");
		q1.setComplexity (4);
		
		q2 = new Question ("Which is worse, ignorance or apathy?",
							"I don't know and I don't care");
		q2.setComplexity (10);
		
		System.out.print (q1.getQuestion());
		System.out.println (" (Level: " + q1.getComplexity() + ")");
		possible = scan.nextLine();
		if (q1.answerCorrect(possible))
			System.out.println ("Correct");
		else
			System.out.println ("No, the answer is " + q1.getAnswer());
		
		System.out.println();
		System.out.print (q2.getQuestion());
		System.out.println (" (Level: " + q2.getComplexity() + ")");
		possible = scan.nextLine();
		if (q2.answerCorrect(possible))
			System.out.println ("Correct");
		else
		System.out.println ("No, the answer is " + q2.getAnswer());	
	}
}	