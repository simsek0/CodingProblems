import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateFromString {

	// Write a method that will accept one string argument and return it without duplicates. 
	// We will see two versions of this method.
	
	public static void main(String[] args) {
		

		
		Set<Character> printer = duplicated("Hello");
		
		for(Character el : printer) {
			System.out.print(el+ " ");
		}
		
	}
	
	
	public static Set<Character>  duplicated(String word) {
		
		Set<Character> set = new LinkedHashSet<>();
		
	
		for(int i = 0; i < word.length(); i++) {
			
			set.add(word.charAt(i));
			
			
		}
		
		return set;
	}

}
