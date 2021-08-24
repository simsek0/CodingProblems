package HackerRank;


public class ReverseOrderofWords {
	
	// Write a Java program to reverse the order of words in a string.
	String method(String word) {
		
		String[] array = word.split(" ");
		String empty = "";
		
		for(int i = array.length-1; i > 0; i--) {
			
			empty = empty + array[i] + " ";
		}
		
		return empty;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		ReverseOrderofWords obj = new ReverseOrderofWords();
		String word1 = "Lorem Ipsum is simply dummy text of the printing and typesetting industry.";
		
		System.out.println(obj.method(word1));
		
	}

}
