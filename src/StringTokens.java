import java.util.Scanner;
import java.util.StringTokenizer;

//Mufasa Simsek
//8/24/2021
//https://www.hackerrank.com/challenges/java-string-tokens/problem
public class StringTokens {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
    
        StringTokenizer token=new StringTokenizer(s," !,?.\\_'@");
        System.out.println(token.countTokens());
        while(token.hasMoreElements())
        {
        	System.out.println(token.nextToken());
        }
        scan.close();
		
	}

}
