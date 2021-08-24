

public class IQ4 {

	public static void main(String [] args)
	{
		//Find out how many alpha characters are present in a String?
		//Find number of words in string?
		
		String str = "dfg%^&DF3434 ere @#67";
		
		//Let`s replace the characters that are not letters with nothing
		str=str.replaceAll("[^a-zA-Z]","");
		
		System.out.println(str);
		System.out.println("Number of alpha characters = "+str.length());
		
		System.out.println("----------");
		String str2="bye bye java hello Selenium";
		System.out.println(str2);
		
		
		//words.length is a property of array
		String [] words = str2.split(" ");
		System.out.println("Number of words in the string is = "+words.length);
	
		for(int i=0;i<words.length;i++)
		{
			System.out.println(words[i]);
		}
		
		System.out.println("-------");
		for(String s:words)
		{
			System.out.println(s);
		}
	}
}
