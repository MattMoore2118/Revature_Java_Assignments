package loop_assignment;

public class Odd_Number {
	
	public static void main(String[] args) {
		
		System.out.println("Printing all odd numbers between 1 and 100");
		for (int i = 1; i <= 100; i++) {
			if(i%2!=0) {
				System.out.print(i+" ");
			}
/* Used same method of even numbers except changed line 9
 * so that if the remainder does not equal 0 it is printed
 */
		
		}

	}

}