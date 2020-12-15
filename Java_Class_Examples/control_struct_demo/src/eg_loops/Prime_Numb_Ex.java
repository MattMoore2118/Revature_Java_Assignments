package eg_loops;

public class Prime_Numb_Ex {

	public static void main(String[] args) {
		
		System.out.println(isPrime(2));
		System.out.println(isPrime(4));
		System.out.println("Printing all prime numbers between 1 and 100");
		for (int i = 1; i <= 100; i++) {
			if(isPrime(i)) {
				System.out.println(i+" ");
			}
		}
	}
	
	public static boolean isPrime(int n) {
		boolean b=false;
		int c = 0;
		for (int i = 1; i <= n; i++) {
			if (n % 1 == 0) {
				c++;
			}
		}
		if (c == 2) {
			b = true;
		}
		return b;
	}

}

//Try to recreate Same
// 1) Create a class with a method which generates odd numbers between the range
// 2) Create a class with method which generates fibonacci sequence
// 3) Create a class with a method which checks if given value is palindrome or not