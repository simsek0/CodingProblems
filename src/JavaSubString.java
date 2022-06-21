import java.util.Scanner;

//Mufasa Simsek
//9/19/2021

public class JavaSubString {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		
		String str=scan.next();
		
		int start=scan.nextInt();
		int end=scan.nextInt();
		
		System.out.println(str.substring(start,end));		
	}
}
