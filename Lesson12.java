// Author : Enes Kemal Ergin
/*
This Lesson includes;
	- Array Elements
	- Declaring and Using Arrays
	- 
*/
public class Lesson12{
	public static void main(String[] args) {
		final int LIMIT = 15, MULTIPLE = 10;
		int[] list = new int[LIMIT]; // Arrays
		for(int index = 0; index < LIMIT; index++)
			list[index] = index * MULTIPLE;

		list[5] = 999;

		for(int value: list)
			System.out.print(value + " ");
		System.out.println();


	}
}
