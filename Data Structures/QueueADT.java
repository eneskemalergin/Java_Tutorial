// Author : Enes Kemal Ergin
/*
	Queue Interface
*/
package jss2;
import jss2.*;

public interface QueueADT<T>{
		
		public void enqueue(T element);
		public T dequeue();
		public T first();
		public boolean isEmpty();
		public int size();
		public String toString();
	}