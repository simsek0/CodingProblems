package HackerRank;
//Mufasa Simsek
//8.10/2021
import java.util.*;
import java.lang.*;

public class JavaLoop2 {

	public static void main(String [] args)
	{
		 Scanner in = new Scanner(System.in);
	        int t=in.nextInt();
	        
	        for(int i=0;i<t;i++)
	        {
	            int a = in.nextInt();
	            int b = in.nextInt();
	            int n = in.nextInt();
	       
	            int num=a;
	            
	            for(int j=0;j<n;j++)
	            {
	            	num += Math.pow(2, j)*b;
	            	System.out.print(num+" ");
	            	
	            }
	         System.out.println();
	        
	        }
	        in.close();
		
	}
}
