// Author : Enes Kemal Ergin
/*
	Array implementation of Stack
*/
package jss2;
import jss2.exceptions.*;

public class ArrayStack<T> implements StackADT<T>{

	private final int DEFAULT_CAPACITY = 100;
	private int top;
	private T[] stack;

	// Constructor 1: Creates an empty stack with default capacity
	public ArrayStack(){
		top = 0;
		stack = (T[])(new Object[DEFAULT_CAPACITY]);
	}

	// Constructor 2: Creates and empty stack with given capacity
	public ArrayStack(int initialCapacity){
		top = 0;
		stack = (T[])(new Object[initialCapacity]);
	}

	// This will push the given element into stack
	public void push(T element){
		if(size() == stack.length)
			expandCapacity();
		stack[top]  = element;
		top++;
	}

	// In case of capacity error this method extends the stack.
	private void expandCapacity(){
		T[] larger = (T[])(new Object[stack.length*2]);

		for (int index = 0; index < stack.length; index++)
			larger[index] = stack[index];

		stack = larger;
	}

	// Removes and returns the top element of the stack.
	public T pop() throws EmptyCollectionException{
		if(isEmpty())
			throw new EmptyCollectionException("Stack is already empty");
		top--;
		T result = stack[top];
		stackp[top] = null;

		return result;
	}

	public T peek() throws EmptyCollectionException{
		if (isEmpty())
			throw new EmptyCollectionException("Nothing to see here");

		return  stack[top-1];
	}

	// Checks if stack is empty or not
	public boolean isEmpty(){
		return(top == 0);
	}

	// Returns the size of a Stack
	public int size(){
		return top;
	}

   // Returns a string representation of the stack. 
   public String toString()
   {
      String result = "";

      for (int scan=0; scan < top; scan++) 
         result = result + stack[scan].toString() + "\n";

      return result;
   }

}
