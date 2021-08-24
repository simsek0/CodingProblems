package HackerRank;


public class ReverseAString {
	
	
	//Write a Java program to Reverse a String.
	static void method(String word) {
		
		for(int i = word.length() -1; i > 0; i--) {
			
			System.out.print(word.charAt(i));
		}
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			method("Lorem Lipsum.");

	}

}
