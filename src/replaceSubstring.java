

public class replaceSubstring {
	
	//Write a Java program to replace the SubString with another string.

	String  method1(String sentence) {
		
		sentence = sentence.replaceAll(sentence.substring(2,4),sentence.substring(6,7));
		
		return sentence;
	}
	
	//I love you --- i ve you!
	public static void main(String[] args) 
	{
		
		
		replaceSubstring obj = new replaceSubstring();
		String word = obj.method1("I love you!");
		System.out.println(word);
		
	}

}
