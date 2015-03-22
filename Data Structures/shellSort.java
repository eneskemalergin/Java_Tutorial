// Author : Enes Kemal Ergin
/*	
	ShellSort implementation
*/

public void shellsort (Object[] data) {
	int i, j, k, h, hCnt, increments[] = new int[20];
	// create an appropriate number of increments h
	for (h = 1, i = 0; h < data.length; i++) {
		increments[i] = h;
		h = 3*h + 1;
	}
	// loop on the number of different increments h
	for (i--; i >= 0; i--) {
		h = increments[i];
		// loop on the number of subarrays h-sorted in ith pass
		for (hCnt = h; hCnt < 2*h; hCnt++) {
			// insertion sort for subarray containing every hth element
			// of array data
			for (j = hCnt; j < data.length; ) {
				Comparable tmp = (Comparable)data[j];
				k = j;
				while (k-h >= 0 && tmp.compareTo(data[k-h]) < 0) {
					data[k] = data[k-h];
					k -= h;
				}
				data[k] = tmp;
				j += h;
			}
		}
	}
}