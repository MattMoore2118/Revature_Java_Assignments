package loop_assignment;

public class Fibonacci {
	public static void main(String[] args) {
		
		Fib(10);
		
	}
	
	public static void Fib(int n) { //function that takes integer n and creates fib sequence
		int x=0, y=1, count = 0;
		while (count < n) { // while beneath integer n we continue
			System.out.print(x+ " ");
			int z = x+y; // change the third variable to an addition of the first two
			x = y; // change the 1st to the 2nd 
			y = z; // change the 2nd to the 3rd 
			count = count+1; // add to the count so that we only go up to n
		}
	}

}
