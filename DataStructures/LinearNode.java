// Author : Enes Kemal Ergin
/*
	Creates nodes for linked list.
*/
	
public class LinearNode<T>{
	
	// Reference to next node in list 
	private LinearNode<T> next;

	// Element stored at this node
	private T element;

	// Constructor 1: Creates empty node
	public LinearNode(){
		next = null;
		element = null;
	}

	// Constructor 2: Creates node storing specified element
	public LinearNode(T elem){
		next = null;
	}

	// Follower Node
	public LinearNode<T> getNext(){
		return next;
	}

	// Following Node
	public void setNext(LinearNode<T> node){
		next = node;
	}

	// Storage Node
	public T getElement(){
		return this.element;
	}

	// Set element to storage
	public void setElement(T elem){
		element = elem;
	}
}