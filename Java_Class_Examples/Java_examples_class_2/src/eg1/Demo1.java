package eg1;

public class Demo1 {

	public static void main(String[] args) {
		
		System.out.println(sumOfNumbers(10,2,1,3,4,45));
		System.out.println(sumOfNumbers(10, 5, 4, 2));
		
	}
	
	public static int sumOfNumbers(int ...a) {
		int sum=0;
		for(int i:a) {
			sum += i; //sum=sum+i
		}
		return sum;
	}

}
/*
 *  ... represents variable args
 *  it takes any number of values as input
 *  only rule is that it should be the last parameter of your method
*/