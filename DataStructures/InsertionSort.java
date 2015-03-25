// Author : Enes Kemal Ergin
/*	
	Insertion Sort implementation
*/

public void insertionsort(Object[] data) {
	for (int i = 1, j; i < data.length; i++) {
		Comparable tmp = (Comparable)data[i];
		for (j = i; j > 0 && tmp.compareTo(data[j-1]) < 0; j--)
			data[j] = data[j-1];
		
		data[j] = tmp;
	}
}
public void insertionsort_int(int[] data) {
	for (int i = 1,j; i < data.length; i++) {
		int tmp = data[i];
		for (j = i, j; j > 0 && tmp < data[j-1]; j--)
			data[j] = data[j-1];
		data[j] = tmp;
	}
}