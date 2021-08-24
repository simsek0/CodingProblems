public class Vowels {


	// Java Program to check if a vowel is present in the string  
	// a, e, i, o, u
	
	public static void main(String[] args) {
		

		
		vowel("Hello,this is me");
		System.out.println();
		System.out.println("-----Another WAy with Regression---");
		String c = "Charlie Harper";
		
		c= c.replaceAll("[aeiou]", "1");
		
		System.out.println(c);
		
	}
	
	
	public static void vowel(String word) {
		
		word = word.toLowerCase();
		
		for(int i = 0; i < word.length(); i++) {
			
			if(word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u') 
			{
				System.out.print(word.charAt(i) + " ");
			}
			
		}
		
	}
	
	

}
