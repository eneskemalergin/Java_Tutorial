// Author : Enes Kemal Ergin
/*
	Circular Array implementation of Queues
*/

package jss2;
import jss2.exceptions.*;
import java.util.Iterator;
public class CircularArrayQueue<T> implements QueueADT<T>{

	private final int DEFAULT_CAPACITY = 100;
	private int front, rear, count;
	private T[] queue;

	// Constructor 1: Initialized empty queue with Default capacity
	public CircularArrayQueue(){
		front = rear count = 0;
		queue = (T[])(new Object[DEFAULT_CAPACITY]);
	}

	// Constructor 2: Initialized empty queue with given size
	public CircularArrayQueue(int initialCapacity){
		front = rear = count = 0;
		queue = ( (T[]))(new Object[initialCapacity]);
	}

	// Adds specified element to the rear of queue
	public void enqueue(T element){
		if (size() == queue.length)
			expandCapacity();
		queue[rear] = element;
		rear = (rear + 1) % queue.length;
		count++;
	}

	// Expands Capacity when it needed
	public void expandCapacity(){
		T[] larger = (T[])(new Object[queue.length * 2]);

		for(int scan = 0; scan < count; scan++){
			larger[scan] = queue[front];
			front = (front+1) % queue.length;
		}
		front = 0;
		rear = count;
		queue = larger;
	}

	// 
	public T dequeue() throws EmptyCollectionException(){
		if( isEmpty())
			throw new EmptyCollectionException("Queue is Empty already!");

		T result  = queue[front];
		queue[front] = null;
		front = (front + 1) % queue.length;
		count--;
		return result;
	}

	// Returns the first item in the queue
   	public T first() throws EmptyCollectionException
   	{
      	if (isEmpty())
         	throw new EmptyCollectionException ("queue"); 

      	return queue[front];
   	}

	// Returns True if queue is empty.
   	public boolean isEmpty()
    {
      	return (count == 0);
   	}	

   	// Returns string form of queue
   	public String toString()
  	{
	    String result = "";
	    int scan = 0;
	 
	    while(scan < count)
	    {
	     	if(queue[scan]!=null)
	     	{
	       		result += queue[scan].toString()+"\n";
	     	}
	    	scan++;
	    }

	    return result;

  	}
}