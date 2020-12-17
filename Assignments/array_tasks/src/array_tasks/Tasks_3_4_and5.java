package array_tasks;

import java.util.Arrays;

public class Tasks_3_4_and5 {

	public static void main(String[] args) {
				//Task 3 Evens and Odds
				int ar[]= {12,33,11,2,344,11,12,11,22,25};
				int ar_odd[]=new int[ar.length];
				int ar_even[]=new int[ar.length];
				for(int i=0; i<ar.length; i++) {
					if(ar[i]%2 <= 0) {
						ar_even[i] = ar[i];
					}else {
						ar_odd[i] = ar[i];
					}
				}
				System.out.println("Evens in ar: "+ Arrays.toString(ar_even));
				System.out.println("Odds in ar: "+ Arrays.toString(ar_odd));
				
				//Task 4 Sums of Even and Odds
				int sum_even = 0;
				int sum_odd = 0;
				for(int i=0; i<ar.length; i++) {
					sum_even = ar_even[i]+sum_even;
					sum_odd = ar_odd[i]+sum_odd;
				}
				if(sum_even > sum_odd) {
					System.out.println("The max sum is the array of even numbers : "+sum_even);
				}
				if(sum_even < sum_odd) {
					System.out.println("The max sum is the array of odd numbers : "+sum_odd);
				}
				if(sum_even == sum_odd) {
					System.out.println("The max sum of odd and even arrays is equal : "+sum_even);
				}
				
				//Task 5 Max and Min
				Arrays.sort(ar);
				int min = ar[0];
				int max = ar[ar.length-1];
				System.out.println("Max is: "+max+ "\nMin is: "+min);
				
			}


	}

