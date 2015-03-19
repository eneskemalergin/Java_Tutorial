// Author : Enes Kemal Ergin
/*
This Lesson includes;
	- While Statements
	- Nested While Loops
*/
import java.text.DecimalFormat;
import java.util.Scanner;

public class Lesson8{
	public static void main(String[] args) {
		int sum = 0, value, count = 0;
		double average;

		Scanner scan = new Scanner(System.in);
		System.out.print ("Enter an integer (0 to quit): ");
      	value = scan.nextInt();
      	while (value != 0)  // sentinel value of 0 to terminate loop
      	{
			count++;
         	sum += value;
         	System.out.println ("The sum so far is " + sum);
         	System.out.print ("Enter an integer (0 to quit): ");
         	value = scan.nextInt();
      	}
      	System.out.println ();
      	if (count == 0)
         	System.out.println ("No values were entered.");
		else
      	{
         	average = (double)sum / count;
         	DecimalFormat fmt = new DecimalFormat ("0.###");
         	System.out.println ("The average is " + fmt.format(average));
		}

		// Nested While Loops
		String str, another = "y";
        int left, right;
        while (another.equalsIgnoreCase("y")) // allows y or Y
        {
            System.out.println ("Enter a potential palindrome:");
            str = scan.nextLine();
            left = 0;
            right = str.length() - 1;
         	while (str.charAt(left) == str.charAt(right) && left < right)
        	{
				left++;
				right--; 
			}
            System.out.println();
        if (left < right)
        	System.out.println ("That string is NOT a palindrome.");
		else
        	System.out.println ("That string IS a palindrome.");
     System.out.println();
     System.out.print ("Test another palindrome (y/n)? ");
     another = scan.nextLine();
	}
}