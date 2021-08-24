


import java.util.HashSet;
import java.util.Set;

public class DuplicatedChar {

	
	
	//Write a Java Program to find the duplicate characters in a string.

	public static void main(String[] args) {
		
		
		
		String sen = "Hello, this is me!";
		char[] arr = sen.toCharArray();
		char[] array;
				
		Set<Character> set = new HashSet<>();
		
 		for(int i = 0; i < arr.length; i++) {
 			
 			
 			set.add(arr[i]);
 		}
		
		System.out.print(set);	
		
		
		

	}

}
