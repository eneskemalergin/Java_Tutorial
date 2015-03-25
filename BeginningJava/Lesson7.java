// Author : Enes Kemal Ergin
/*
This Lesson includes;
	- Boolean Expression
	- Equality and Relational Operators
	- Logical Operators
	- If - else statements
*/
import java.util.Random;
import java.util.Scanner;
public class Lesson7{
	/*
		Boolean Expressions are essential for conditional statements which
		we will talk about here;
			- Looping
			- Decision Making
	*/
	public static void main(String[] args) {
		
		// Booleans
		Boolean bool1 = true;
		Boolean bool0 = false;
		System.out.println("1 is equal to  :" + bool1);
		System.out.println("0 is equal to  :" + bool0);

		// Equality and Realtional Operators
		int num1 = 1;
		int num2 = 2;
		System.out.println("is it equal :" + (num1 == num2));
		System.out.println("is it not equal :" + (num1 != num2));		
		System.out.println("is it less than or equal :" + (num1 <= num2));
		System.out.println("is it less than :" + (num1 < num2));
		System.out.println("is it greater than or equal :" + (num1 >= num2));
		System.out.println("is it greater than :" + (num1 >= num2));
		
		// If - else Statements

		final int MINOR = 18;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age = scan.nextInt();

		System.out.println("You entered: " + age);
		if (age < MINOR) {
			System.out.println("Youth is wonderful thing, enjoy it!");
		}
		else{
			System.out.println("Age is a state of mind.");
		}

		// Guessing Game

		final int MAX = 10;
      	int answer, guess;
      	Random generator = new Random();
      	answer = generator.nextInt(MAX) + 1;
      	System.out.print ("I'm thinking of a number between 1 and "
                        + MAX + ". Guess what it is: ");
      	guess = scan.nextInt();
      	if (guess == answer)
         	System.out.println ("You got it! Good guessing!");
		else
      	{
         	System.out.println ("That is not correct, sorry.");
        	System.out.println ("The number was " + answer);
		}
	}
}