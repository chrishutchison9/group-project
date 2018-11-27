package project1302;

public class binarySearch {
	public static int binarySearch(int[] x, int target) {
	    int min = 0;
	    int max = x.length - 1;

	    while (min <= max) {
	        int mid = (min + max) / 2;
	        if (x[mid] < target) {
	            min = mid + 1;
	        } else if (x[mid] > target) {
	            max = mid - 1;
	        } else {
	           return mid;  // target found
	        }
	    }

	    return -(min + 1);    // target not found
	}
}