// Author : Enes Kemal Ergin
/*
	linked Implementation of a queue...	
*/

public class LinkedQueue<T> implements QueueADT<T>{
	private int count;
	private LinearNode<T> front, rear;

	// Constructor
	public LinkedQueue(){
		count = 0;
		front = rear = null;
	}

	// Adds specified element at the end(rear)
	public void enqueue(T element){
		// Needs to have LinearNode class
		LinearNode<T> node = new LinearNode<T>(element);

		if (isEmpty())
			front = node;
		else
			rear.setNext(node);

		rear = node;
		count++;
	}

	// Removes and returns element at the beginning
	public T dequeue() throws EmptyCollectionException
   	{
      	if (isEmpty())
         	throw new EmptyCollectionException ("Queue is Empty already!");

	     T result = front.getElement();
	     front = front.getNext();
	     count--;

	     if (isEmpty())
	     	rear = null;

	     return result;
   }

   // Returns the first element
   public T first() throws EmptyCollectionException
   {
   		if (isEmpty())
         	throw new EmptyCollectionException ("Nice Try!"); 

      	return front.getElement();
   }

   // Checks if queue is empty or not
   public boolean isEmpty()
   {
      return (count == 0);
   }

   // Returns the size of a queue
   public int size()
   {
      return count;
   }

   // Prints queue in string format
   public String toString()
   {
      String result = "";
      LinearNode<T> current = front;

      while (current != null)
      {
         result = result + (current.getElement()).toString() + "\n";
         current = current.getNext();
      }

      return result;
   }
}