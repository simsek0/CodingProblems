

public class Testing7 {

	
	// Write a java program to find the duplicate characters in a string.
	
    // Great responsibility
	
	static String duplicate(String sentence) {
		
		sentence = sentence.toLowerCase();
		char[] arr = sentence.toCharArray();
		String empty= "";
		for(int i = 0; i < arr.length; i++) 
		{
			
			for(int j = i+1; j < arr.length; j++) 
			{
				if (arr[i] == arr[j]) {
					
					empty = arr[j] + "";
					break;
				}
			}
			
		}
		
		return empty;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		System.out.println(duplicate("Great Responsibility"));

	}

}
