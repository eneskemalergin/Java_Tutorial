// Author : Enes Kemal Ergin
/*	
	Selection Sort implementation
*/

public void swap(Object[] a, int e1, int e2);

public void selectionsort(Object[] data) {
	int i,j,least;
	for (i = 0; i < data.length-1; i++) {
		for (j = i+1, least = i; j < data.length; j++)
			if (((Comparable)data[j]).compareTo(data[least]) < 0)
				least = j;
			if i != least)
				swap(data,least,i);
	}
}

public void swap(Object[] a, int e1, int e2) {
	Object tmp = a[e1]; a[e1] = a[e2]; a[e2] = tmp;
}