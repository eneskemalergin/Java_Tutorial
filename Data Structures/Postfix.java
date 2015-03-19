// Author : Enes Kemal Ergin
/*
	Postfix Evaluator
	Dependencies :
		- PostfixEvaluator.java
*/
package jss2;
import java.util.Scanner;

public class Postfix{
	// Reads and evaluates multiple postfix expressions
	public static void main(String[] args) {
		String expression, again;
		int result;
		try{
			Scanner in = new Scaner(System.in);
		
		do{
			PostfixEvaluator evaluator = new PostfixEvaluator();
			System.out.println("Enter a valid postfix expression: ");
			expression = in.nextLine();

			result = evaluator.evaluate(expression);
			System.out.println();
			System.out.println("That expression equals " + result);

			System.out.print ("Evaluate another expression [Y/N]? ");
			again = in.nextLine();
			System.out.println();
		}

		while(again.equalsIgnoreCase("y"));
		}
		catch(Exception IOException)
		{
			System.out.println("Input exception reported");
		}
	}
}