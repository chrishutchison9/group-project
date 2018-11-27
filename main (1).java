package project1302;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		insersionSort insort= new insersionSort();
		quickSort qsort = new quickSort();
		selectionSort selectsort = new selectionSort();
		bubbleSort bsort = new bubbleSort();
		binarySearch bsearch = new binarySearch();
		sequentialSearch ssearch = new sequentialSearch();
		jumpSearch jsearch = new jumpSearch();
		
		Random rand = new Random();
		int min = 1;
		int max = 1000000;
		int[] x = new int[100000];
		
	    for (int i = 0; i < x.length; i++) {
	      x[i] = rand.nextInt((max - min) + 1) + min;
	    }
		
		for(int i = 0; i < x.length; i++)
	    {
	        System.out.print(x[i] +" ");
	    }
		
		//mock data ---------------
		int low = 0;
		int high = 8 - 1;

		
		//-------------------------
		long startTime = System.nanoTime();
		methodToTime();
		qsort.quickSort(x, low, high);;
		long endTime = System.nanoTime();
		long duration = (endTime-startTime);
		System.out.println("Quick sort time is "+ duration*0.000001 +" millisecond ");
	//	System.out.println("Quick sort time is "+ duration +" millisecond ");
/*		
		for(int i = 0; i < x.length; i++)
	    {
	        System.out.print(x[i] +" ");
	    }
*/
long startTime2 = System.nanoTime();
methodToTime();
insort.insertionSort(x);
long endTime2 = System.nanoTime();
long duration2 = (endTime2-startTime2);
System.out.println("insertion sort time is "+ duration2*0.000001 +" millisecond");

long startTime3 = System.nanoTime();
methodToTime();
selectsort.doSelectionSort(x);
long endTime3 = System.nanoTime();
long duration3 = (endTime3-startTime3);
System.out.println("selection sort time is "+ duration3*0.000001 +" millisecond");

long startTime4 = System.nanoTime();
methodToTime();
bsort.bubbleSort(x);
long endTime4 = System.nanoTime();
long duration4 = (endTime4-startTime4);
System.out.println("bubble sort time is "+ duration4*0.000001 +" millisecond");

long startTime5 = System.nanoTime();
methodToTime();
//Scanner sc=new Scanner(System.in);
System.out.println("Enter a number to search for ");
int target = sc.nextInt();
bsearch.binarySearch(x, target);
long endTime5 = System.nanoTime();
long duration5 = (endTime5-startTime5);
System.out.println("binary search time is "+ duration5*0.000001 +" millisecond");

long startTime6 = System.nanoTime();
methodToTime();
//Scanner sc=new Scanner(System.in);
System.out.println("Enter a number to search for ");
int target2 = sc.nextInt();
ssearch.sequentialSearch(x, target2);
long endTime6 = System.nanoTime();
long duration6 = (endTime6-startTime6);
System.out.println("sequential search time is "+ duration6*0.000001 +" millisecond");

long startTime7 = System.nanoTime();
methodToTime();
//Scanner sc=new Scanner(System.in);
System.out.println("Enter a number to search for ");
int a = sc.nextInt();
jsearch.jumpSearch(x, a);
long endTime7 = System.nanoTime();
long duration7 = (endTime7-startTime7);
System.out.println("sequential search time is "+ duration7*0.000001 +" millisecond");
	}

	private static void methodToTime() {
		// TODO Auto-generated method stub
		
	}
	}
