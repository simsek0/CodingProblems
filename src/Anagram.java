
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;
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
		
		HashMap<Integer, Integer> map1=new HashMap<Integer,Integer>();
		

		Set<Entry<Integer,Integer>> set=new HashSet();
		set=map1.entrySet();
		
			
		
		
		return Arrays.equals(a, b);
		
	}

}
