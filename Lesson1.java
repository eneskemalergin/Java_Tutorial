// Author : Enes Kemal Ergin
/*
This Lesson includes;
	- System.out.println
	- System.out.print
	- String Concatenation
	- Addition
	- Escape Sequences
*/


public class Lesson1{
	public static void main(String[] args) {
		System.out.println("This will print and go to new line");
		System.out.print("This will print but won't go to new line");
		System.out.println(""); // You can use it to go to new line
		System.out.println("We can concatenate two strings" + " by using plus symbol");
		System.out.println("A numeric value can be concatenated to string" + 54);
		System.out.println("1 an 0 concatenated" + 1 + 0);
		System.out.println("1 and 0 added" + (1+0));
		System.out.println ("Roses are red,\n\tViolets are blue,\n" +
         "Sugar is sweet,\n\tBut I have \"commitment issues\",\n\t" +
         "So I'd rather just be friends\n\tAt this point in our " +
         "relationship.");

	}
} 