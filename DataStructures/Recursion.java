// Author : Enes Kemal Ergin
/*
	Recursion Practice in Java
*/

public class Recursion{
	
	public static void main(String[] args) {
		
	}

	// Recursion is sophisticated way of iterating over things. 
	// In most cases even more useful...
	public int sum(int num){
		int result;
		if(num == 1)
			result = 1;
		else
			result = num + sum(num-1);
		return result;
	}
}