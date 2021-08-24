package HackerRank;

public class IQ6 {

	//Write a Java Program to find whether a String is palindrom or not?
	
	public static void main(String [] args)
	{
		String original="Anna";
		String reversed = IQ5.method1(original);
		System.out.println(original+" <-> "+reversed);
		
		if(original.equalsIgnoreCase(reversed))
		{
			System.out.println(original + " is a Palindrome!");
		
		}
		else
		{
			System.out.println(original +" is NOT a palindrome");
			
		}
	
	}
}
