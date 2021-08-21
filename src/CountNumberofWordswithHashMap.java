
import java.util.*;
public class CountNumberofWordswithHashMap {
	
	// Write a Java Program to count the number of words in a string using HashMap.


	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sen = "Hello, this me!";
		String[] arr = sen.split(" ");
		
		
	
		HashMap<Integer, String> hashmap = new HashMap<>();
		
		
		
		for(int i = 0; i < arr.length; i ++) {
			
		
			hashmap.put(i, arr[i]);
		}

		System.out.println(hashmap);
	}

}
