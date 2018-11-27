package project1302;

public class insersionSort {
	public static int[] insertionSort(int[] a) {
		int[] sorted = a;
		    for (int j = 2; j < a.length; j++) {

		        int key = sorted[j];
		        int i = j - 1;

		        while (i > 0 && sorted[i] > key) {
		            sorted[i + 1] = sorted[i];
		            i--;
		        }
		        a[i + 1] = key;
		    }
		    return sorted;
		}
		}
