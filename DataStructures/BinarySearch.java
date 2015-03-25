// Author : Enes Kemal Ergin
/*	
	BinarySearch Algorithm
*/

public boolean binarySearch(Object[] data, int min, int max, Object target){
	boolean found = false;
	int midpoint = (min+max) / 2; 

	if(data[midpoint].compareTo(target) == 0)
		found = true;
	else if(data[midpoint].compareTo(target) > 0){
		if (min < midpoint - 1)
			found = binarySearch(data, min, midpoint-1, target);
	}
	else if (midpoint + 1 <= max)
		found = binarySearch(data, midpoint+1, max, target);

	return found
}