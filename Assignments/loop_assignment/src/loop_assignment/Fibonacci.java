package loop_assignment;

public class Fibonacci {
	public static void main(String[] args) {
		
		Fib(20);
		
	}
	
	public static void Fib(int n) {
		int x=0, y=1, count = 0;
		while (count < n) {
			System.out.println(x+ " ");
			int z = x+y;
			x = y;
			y = z;
			count = count+1;
		}
	}

}
