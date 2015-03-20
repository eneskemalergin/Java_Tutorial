// Author : Enes Kemal Ergin
/*
	Stack Interface
*/
package jss2;
import jss2.*;
public interface StackADT<T>{
	
	public void push (T element);
	public T pop();
	public T peek();
	public boolean isEmpty();
	public int size();
	public String toString();
}
