// Author : Enes Kemal Ergin
/*	
	BubbleSort implementation
*/

public void swap(Object[] a, int e1, int e2) {
	Object tmp = a[e1]; a[e1] = a[e2]; a[e2] = tmp;
}

public void bubblesort(Object[] data) {
	for (int i = 0; i < data.length-1; i++)
		for (int j = data.length-1; j > i; --j)
			if (((Comparable)data[j]).compareTo(data[j-1]) < 0)
				swap(data,j,j-1);
}