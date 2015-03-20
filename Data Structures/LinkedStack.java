// Author : Enes Kemal Ergin
/*
	Linked list implementation of Stacks	
		-> We will use StackADT<T> interface again here.
*/
package jss2;
import jss2.*;
public class LinkedStack<T> implements StackADT<T>{
	
	// number of elements storage
	private int count;

	// top stack pointer
	private linearNode<T> top;

	// The last stack  pointer
	private linearNode<T> last;

	// Constructor
	public LinkedStack(){
		count = 0;
		top = null;
	}

	// Adds element on top 
	public void push(T element){
		if( isEmpty() ){
            top = new LinearNode<T>(element);
            last = top;
        }
        else{
            LinearNode<T> newNode = new LinearNode<T>(element);
            last.setNext(newNode);
            last = newNode;
        }
        count++;
        System.out.println( element + " added to Stack.\n");
	}

	// Removes and returns element at the top
	public T pop() {
	LinearNode<T> removedNode = null;
    	
        if( isEmpty() ){
            System.out.println("The Stack is empty");
            return null;
        }
        else{
            LinearNode<T> currentNode = top;
            do{
                currentNode = currentNode.getNext();
            }while( ( removedNode = currentNode.getNext() ) != last);
            
            currentNode.setNext(null);
            last = currentNode;
            count--;
            System.out.println( removedNode.getElement() + " popped from Stack.\n");

            return removedNode.getElement();
        }
	}

	// Returns the top element
	public T peek() throws EmptyStackException
  	{
    	if (isEmpty())
      		throw new EmptyStackException(); 

	    return top.getElement();
  	}
	// It checks if it is empty.
	public boolean isEmpty(){
		return (top == 0);
	}

	// Returns the size of stack
  	public int size()
  	{
    	return count;
  	}

  	// Represents stack in string form.
  	public String toString()
  	{
	    String result = "";
	    LinearNode current = top;

	    while (current != null)
	    {
	      result = result + (current.getElement()).toString() + "\n";
	      current = current.getNext();
	    }

	    return result;
  	}
}
