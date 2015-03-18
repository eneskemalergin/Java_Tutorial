// Author : Enes Kemal Ergin
/*
This Lesson includes;
	- String Class
	- Packages'
	- Random Class
	- Math Class
	- Formatting Output
	- 		
*/
	import java.util.Random;
	import java.util.Scanner;
	import java.text.NumberFormat;

public class Lesson4{
	public static void main(String[] args) {
		String sentence = "We can play with strings";
		String type1, type2, type3, type4;
		
		System.out.println("Original sentence: \"" + phrase + "\"");
		System.out.println("Length of String: " + phrase.Length());
		type1 = phrase.concat (", but not with atari machines.");
     	type2 = mutation1.toUpperCase();
      	type3 = mutation2.replace ('E', 'X');
      	type4 = mutation3.substring (3, 30);

      	System.out.println("type1: " + type1);
      	System.out.println("type2: " + type2);
      	System.out.println("type3: " + type3);
      	System.out.println("type4: " + type4);
	
		// import java.util.Random; go to line

        Random random = new Random();
        int num1;
        float num2;
        num1 = random.nextInt();
        System.out.println ("A random integer: " + num1);
        num1 = random.nextInt(10);
        System.out.println ("From 0 to 9: " + num1);
        num1 = random.nextInt(10) + 1;
        System.out.println ("From 1 to 10: " + num1);
        num1 = random.nextInt(15) + 20;
      	System.out.println ("From 20 to 34: " + num1);
 	    num1 = random.nextInt(20) - 10;
      	System.out.println ("From -10 to 9: " + num1);
      	num2 = random.nextFloat();
      	System.out.println ("A random float (between 0-1): " + num2);
      	num2 = random.nextFloat() * 6;  // 0.0 to 5.999999
      	num1 = (int)num2 + 1;
      	System.out.println ("From 1 to 6: " + num1);

      	int a, b, c;  // ax^2 + bx + c
      	double discriminant, root1, root2;
      	Scanner scan = new Scanner (System.in);
      	System.out.print ("Enter the coefficient of x squared: ");
      	a = scan.nextInt();
      	System.out.print ("Enter the coefficient of x: ");
      	b = scan.nextInt();
      	System.out.print ("Enter the constant: ");
      	c = scan.nextInt();
      	// Use the quadratic formula to compute the roots.
      	// Assumes a positive discriminant.
      	discriminant = Math.pow(b, 2) - (4 * a * c);
      	root1 = ((-1 * b) + Math.sqrt(discriminant)) / (2 * a);
      	root2 = ((-1 * b) - Math.sqrt(discriminant)) / (2 * a);
      	System.out.println ("Root #1: " + root1);
      	System.out.println ("Root #2: " + root2);

     	final double TAX_RATE = 0.06;

		int quantity;
      	double subtotal, tax, totalCost, unitPrice;
      	Scanner scan = new Scanner (System.in);
      	NumberFormat fmt1 = NumberFormat.getCurrencyInstance();
      	NumberFormat fmt2 = NumberFormat.getPercentInstance();
      	System.out.print ("Enter the quantity: ");
      	quantity = scan.nextInt();
      	System.out.print ("Enter the unit price: ");
      	unitPrice = scan.nextDouble();
      	subtotal = quantity * unitPrice;
      	tax = subtotal * TAX_RATE;
      	totalCost = subtotal + tax;
      	// Print output with appropriate formatting
      	System.out.println ("Subtotal: " + fmt1.format(subtotal));
      	System.out.println ("Tax: " + fmt1.format(tax) + " at "
                         	 + fmt2.format(TAX_RATE));
      	System.out.println ("Total: " + fmt1.format(totalCost));
      }
}
