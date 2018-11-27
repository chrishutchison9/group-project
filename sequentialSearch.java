package project1302;

public class sequentialSearch {
	public static int sequentialSearch(int[] x, int target2) {
		
		int size = x.length;
		for(int i=0;i<size;i++){
		if(x[i] == target2){
		return i;
		}
		}
		return -1;
		}
}
