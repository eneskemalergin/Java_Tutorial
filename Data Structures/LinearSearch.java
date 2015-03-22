// Author : Enes Kemal Ergin
/*	
	LinearSearch Algorithm
*/

public boolean linearSearch(Object[] data, int min, int max, Object target){
	int index = min;
	boolean found = False;

	while(!found && index <= max){
		if(data[index].compareTo(trget) == 0)
			found = true;
		index++;
	}
	return found;
}