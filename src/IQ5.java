package HackerRank;

public class IQ5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Write a java program to reverse String
		//Reverse a string word by word?
		System.out.println(method1("mufasa"));
		
		//Using StringBuffer
		StringBuffer sb=new StringBuffer("Neotech");
		sb.reverse(); //StringBuffer is mutable
		System.out.println("The reversed string buffer is -> "+sb);

		
		System.out.println("-----------------");
		
		String longStr="bye bye java hello selenium";
		String [] words = longStr.split(" ");
	
		for(int i=words.length-1;i>=0;i--)
		{
			System.out.print(words[i]+" ");
		}
	}

	static String method1(String str)
	{
		//this method will reverse the string
		String str2="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			str2 +=str.charAt(i);
		}
		return str2;
	}
}
