


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StaticInitializer {

	static int B;
	static int H;
	static boolean flag;
	
	//static will get executed..
	static  {
		Scanner scan = new Scanner(System.in);
		B=scan.nextInt();
		H=scan.nextInt();
	
		if(B>0 && H>0)
		{
			flag=true;
		}
		else
		{
			flag=false;
			System.out.println("java.lang.Exception: Breadth and height must be positive");
		}
	
	}
	public static void main(String[] args) {
		
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}

}
