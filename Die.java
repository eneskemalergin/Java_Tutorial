// Author : Enes Kemal Ergin
/*
	This is Die class to support Lesson 6
*/
	
// This is Die class which we will use in main
public class Die{
	private final int MAX = 6;
	private int faceValue;

	// Constructor :  Sets the initial face value
	public Die(){
		faceValue = 1;
	}

	/*
		Following public things called methods. They are functions in Java
	*/
	public int roll(){ // Returns integer, without parameters
		faceValue = (int)(Math.random() * MAX) + 1;
		return faceValue;
	}

	public void setFaceValue(int value){ // Returns nothing(void), int parameter 
		faceValue = value;
	}

	public int getFaceValue(){ // Returns Integer, without parameter
		return faceValue;
	}

	// Returns a string representation of this die.
	public String toString(){ // Returns String , without parameter
		String result = Integer.toString(faceValue);
		return result;
	}
}
