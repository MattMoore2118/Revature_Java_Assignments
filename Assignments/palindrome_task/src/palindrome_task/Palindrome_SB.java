package palindrome_task;

public class Palindrome_SB {

	public static void main(String[] args) {
		
		String s;
		for(int i=1000; i <= 9999; i++) {
			s=i +"";
			if (new StringBuffer(s).reverse().toString().equals(s)) {
				System.out.println(s+" is a Palindrome");
				}
			
			}
	}
}