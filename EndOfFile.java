package HackerRank;

import java.util.*;
import java.io.*;
public class EndOfFile {

	public static void main(String[] args) throws FileNotFoundException {

		
		Scanner sc=new Scanner(System.in);
		String file ="C:/Users/18329/Downloads/new2.txt";
				
		file=sc.next();
		Scanner scan =new Scanner(new File(file));

		while(scan.hasNext())
		{
			System.out.println(scan.next());
		}
	}

}
