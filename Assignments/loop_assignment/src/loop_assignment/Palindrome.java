package loop_assignment;

public class Palindrome {

	public static void main(String[] args) {
		String word = "tacocaT";
		if (isPalindrome(word.toLowerCase()) == true) {
			System.out.println(word + " is a palindrome");
		}
		else System.out.println(word.toLowerCase() + " is not a palindrome");
	}
	
	public static boolean isPalindrome(String word) {
		int front=0, back=word.length()-1;
		while (front < back) {
			if (word.charAt(front) != word.charAt(back))
					return false;
			front++;
			back--;
		}
		return true;
	}
}
