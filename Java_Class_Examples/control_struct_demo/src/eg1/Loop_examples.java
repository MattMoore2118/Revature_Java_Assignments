package eg1;

public class Loop_examples {

	public static void main(String[] args) {
		
		for (int i=0; i < 10; i++) {
			System.out.println("i = "+i);
		}
		
		for (int i=0, j=10; i < 10; i++, j--) {
			System.out.println("i = "+i+" j = "+j);
		}
		
		System.out.println("Printing all even numbers between 1 and 50");
		for (int i=1; i<=50; i++) {
			if (i%2==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		int x=0;
		while (x!=10) {
			System.out.println("x = "+x);
			x++;
		}
		
		System.out.println("Value of x before do while = "+x);
		do {
			System.out.println("I will be executed once for sure... I am exit controlled");
		}while(x!=10);
	

	}

}
