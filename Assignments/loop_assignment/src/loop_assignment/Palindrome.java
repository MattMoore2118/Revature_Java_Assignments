package loop_assignment;

public class Palindrome {

	public static void main(String[] args) {
		
		String word = "racecar";
		
		if (isPalindrome(word) == true) {
			System.out.println(word + " is a Palindrome");
		}
		else System.out.println(word + " is not a Palindrome");
	}
	
	public static boolean isPalindrome(String word) {
		int f=0, b=word.length()-1;
		while (f < b) {
			if (word.charAt(f) != word.charAt(b))
					return false;
			f++;
			b--;
		}
		return true;
	}

}
