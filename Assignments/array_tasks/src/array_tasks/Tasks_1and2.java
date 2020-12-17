package array_tasks;

import java.util.Arrays;

public class Tasks_1and2 {

	public static void main(String[] args) {
		//Task 1 Reverse
		int ar[]= {12,33,11,2,344,11,12,11,22,25};
		int ar_rev[]=new int[ar.length]; //new array same size as original ar
		System.out.println("ar in normal order: ");
		System.out.println(Arrays.toString(ar));
		for(int i=0; i < ar.length; i++) {
				ar_rev[(ar.length-1)-i]=ar[i];//replacing the last item in ar_rev with the first of ar
		}
		System.out.println("ar in reverse order: ");
		System.out.println(Arrays.toString(ar_rev));
				
		//Task 2 Delete Element
		int del = 7; //position in array that will be replaced with default value of 0
		ar[del-1] = 0;//must know array size to not exceed index bounds
		System.out.println("ar with specific element deleted: ");
		System.out.println(Arrays.toString(ar));

	}

}
