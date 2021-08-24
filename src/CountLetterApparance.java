package HackerRank;
import java.util.LinkedHashMap;
import java.util.Map;

public class CountLetterApparance {

	public static void main(String[] args) {
		
//		Write a method that will accept a string as an argument. 
//		The method will count the number of appearances of each char and return map. 
//		The key will be a letter and the value will be a number of 
//		appearances in the string. See input and output in the example.
		
		Map<Character,Integer> map = counter("helllo");
		System.out.println(map);
		

	}
	
	public static Map<Character,Integer> counter(String word){
		
		Map<Character, Integer> mapi = new LinkedHashMap<>();
		
		for(int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			
			if(mapi.containsKey(ch)) {
				
				mapi.put(ch, mapi.get(ch) +1);
			}
			else {
				mapi.put(ch, 1);
			}
			
			
		}
		
		
		return mapi;
	}

}
