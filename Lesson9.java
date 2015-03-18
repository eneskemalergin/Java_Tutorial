// Author : Enes Kemal Ergin
/*
This Lesson includes;
	- Switch Statements
	- Conditional Operator
	- do while Statement
	- for statement
	- Nested loops
*/

import java.util.Scanner;
public class Lesson9{
	public static void main(String[] args) {
		int grade, category;

		Scanner scan = new Scanner(System.in);
		System.out.print ("Enter a numeric grade (0 to 100): ");
      	grade = scan.nextInt();
      	category = grade / 10;
      	System.out.print ("That grade is ");
      	switch (category)
      	{
         	case 10:
            	System.out.println ("a perfect score. Well done.");
            	break;
         	case 9:
            	System.out.println ("well above average. Excellent.");
            	break;
         	case 8:
            	System.out.println ("above average. Nice job.");
            	break;
			case 7:
               System.out.println ("average.");
               break;
            case 6:
               System.out.println ("below average. You should see the");
               System.out.println ("instructor to clarify the material "
                                  + "presented in class.");
               break;
            default:
               System.out.println ("not passing.");
         }

    	int total = 100;
    	final int MAX = 75;

    	int total1 = (total > MAX) ? total + 1 : total * 2;
    	System.out.println("Total before after: " + total + ", " + total1);
    	/*
    	 The statement in 45th line is same as;

		if (total > MAX) 
		total = total + 1;
		else
		total = total * 2; 
    	*/ 
		int number, lastDigit, reverse = 0;
      	System.out.print ("Enter a positive integer: ");
      	number = scan.nextInt();
		do
      	{
         	lastDigit = number % 10;
         	reverse = (reverse * 10) + lastDigit;
         	number = number / 10;
      	}
      	while (number > 0);
      	
      	System.out.println ("That number reversed is " + reverse);		

      	final int PER_LINE = 5;
        int value, limit, mult, count = 0;
        System.out.print ("Enter a positive value: ");
        value = scan.nextInt();
        System.out.print ("Enter an upper limit: ");
        limit = scan.nextInt();
        System.out.println ();
        System.out.println ("The multiples of " + value + " between " +
                         value + " and " + limit + " (inclusive) are:");
        for (mult = value; mult <= limit; mult += value)
        {
            System.out.println(mult + "\t");
			count++;
         	if (count % PER_LINE == 0)
            	System.out.println();
        }

        // Prints stars from 1 to 10 in 10 lines
		final int MAX_ROWS = 10;
        for (int row = 1; row <= MAX_ROWS; row++)
        {
        	for (int star = 1; star <= row; star++)
            	System.out.print ("*");
            
            System.out.println();
         }

	}
}
