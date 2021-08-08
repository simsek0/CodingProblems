package HackerRank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class TagContentExtractor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner in = new Scanner (System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0)
		{
			String line = in.nextLine();
			
			int first=line.indexOf('<');
			int second=line.indexOf('>');
			
			StringBuffer str1=new StringBuffer("");
			
			String str=line.substring(first, second);
		
			str1.insert(0, str);
			str1.insert(first+1, "/");
			
			if(line.contains(str1))
			{
				
				while(line.contains(str))
				{
					line=line.substring(second+1);
				}
				
				String singleString = str1.toString();
				System.out.println(line.substring(0,line.indexOf(singleString)));
			}
			else
			{
				System.out.println("None");
			}
			
			testCases--;
		}
	}

}
