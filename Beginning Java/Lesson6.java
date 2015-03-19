// Author : Enes Kemal Ergin
/*
This Lesson includes;
	- Anatomy of a Class
	- Encapsulation
	- 
*/


public class Lesson6{
	public static void main(String[] args){
		Die die1, die2; // Initializing objects from Die
		int sum;

		die1 = new Die(); // Creating objects
		die2 = new Die(); // Creating objects

		die1.roll();
		die2.roll();
		System.out.println("Die1: " + die1);
		System.out.println("Die2: " + die2);

		die1.roll(); // No parameters
		die2.setFaceValue(4); // parameter required

		System.out.println ("Die One: " + die1 + ", Die Two: " + die2);
		sum = die1.getFaceValue() + die2.getFaceValue();
        System.out.println ("Sum: " + sum);
        sum = die1.roll() + die2.roll();
        System.out.println ("Die One: " + die1 + ", Die Two: " + die2);
        System.out.println ("New sum: " + sum);
	}

}