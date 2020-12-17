package array_tasks;

public class Task_6_Palindrome {

	public static void main(String[] args) {
		int ar[]= {121,345,11,202,344,115,120,190,202,252};
		String s;
		for(int i=0; i < ar.length; i++) {
			s = ar[i]+"";
			if (new StringBuffer(s).reverse().toString().equals(s)) {
				System.out.println(ar[i]+" is a Palindrome");
			}else {
				System.out.println(ar[i]+" is not a Palindrome");
			}
		}


	}

}
