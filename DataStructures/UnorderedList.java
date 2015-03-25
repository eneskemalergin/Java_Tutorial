// Author : Enes Kemal Ergin
/*
	UnorderedListADT interface which extends ListADT
*/

public interface UnorderedListADT<T> extends ListADT<T>{
	public void addToFront(T element);
	public void addToRear(T element);
	public void addAfter(T element, T targer);
}