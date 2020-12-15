package loop_assignment;

public class Palindrome {

	public static void main(String[] args) {
		String word = "tacocaT"; 
		if (isPalindrome(word.toLowerCase()) == true) { // checking if word above when all lower-case is a palindrome
			System.out.println(word + " is a palindrome");
		}
		else System.out.println(word.toLowerCase() + " is not a palindrome");
	}
	
	public static boolean isPalindrome(String word) {
		int front=0, back=word.length()-1; // two indexes one starting from the front and the other from the back
		while (front < back) { 
			if (word.charAt(front) != word.charAt(back)) // comparing the character at the front to the one at the back
					return false; // if they are different return false
			front++; // add 1 to index at the front
			back--; // subtract 1 from index at the back so that they move towards each other
		}
		return true; // if characters at the same place at front and back are same return true
	}
}
