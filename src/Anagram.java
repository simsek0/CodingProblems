import java.util.*;
public class Anagram {

	public static void main(String[] args) {
		
		
		// An anagram is when all the letters in one string exist in another 
		// but the order of letters does not matter. Write a method that will accept 
		// two string arguments and will return true if they are anagram and false if they are not.
		// isAnagram("listen", "silent")     -> true

		
		System.out.println(anagrom("listen","silent"));
	}
	
	public static boolean anagrom(String word1, String word2) {
		
		char[] a = word1.toCharArray();
		char[] b = word2.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		
		
		
		
		return Arrays.equals(a, b);
		
	}

}
