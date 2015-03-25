// Author : Enes Kemal Ergin
/*
	Reflection Class
	This clas will print whatever you put, after you finish writing all 
	things it will count for you...
*/

public class Reflection{
	private String phrase;
	private  static int count = 0;

	public Reflection (String str){
		phrase = str;
		count++;
	}

	public String toString(){
		return phrase;
	}

	// Static Method
	public static int getCount(){
		return count;
	}
}