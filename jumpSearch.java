package project1302;

public class jumpSearch {
	 public static int jumpSearch(int[] x, int a)
	    {
	        int n = x.length;
	 
	        // Finding block size to be jumped
	        int step = (int)Math.floor(Math.sqrt(n));
	 
	        // Finding the block where element is
	        // present (if it is present)
	        int prev = 0;
	        while (x[Math.min(step, n)-1] < a)
	        {
	            prev = step;
	            step += (int)Math.floor(Math.sqrt(n));
	            if (prev >= n)
	                return -1;
	        }
	 
	        // Doing a linear search for x in block
	        // beginning with prev.
	        while (x[prev] < a)
	        {
	            prev++;
	 
	            // If we reached next block or end of
	            // array, element is not present.
	            if (prev == Math.min(step, n))
	                return -1;
	        }
	 
	        // If element is found
	        if (x[prev] == a)
	            return prev;
	 
	        return -1;
	    }
}
