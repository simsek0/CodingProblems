package HackerRank;


public class FrequencyofChar {

	//Write a Java program to find the frequency of character in a string.
	
	int frequency(String word) {
		
		char frequencyOfM = 'm';
		int frequencyNumber = 0;
		
		for(int i = 0; i < word.length(); i++) 
		{
			if(frequencyOfM == word.charAt(i)) {
				
				++frequencyNumber;
			}
		}
		
		return frequencyNumber;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FrequencyofChar obj = new FrequencyofChar();
		int freq = obj.frequency("Lorem Lipsum");
		
		System.out.println(freq);
	}

}
