package HackerRank;


public class Palindrome {

	
	// Write a Java program to find whether a string is palindrome or not.
 
	// Anna is palindrome
	static boolean  palindrome(String word) {
		
		word = word.toLowerCase();
		
		char[] arr = word.toCharArray();
		String empty = "";
		for(int i = arr.length-1; i >= 0; i--) {
			
			empty = empty + arr[i];
		}
		
		return empty.equals(word);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(palindrome("Mark"));
	}

}
