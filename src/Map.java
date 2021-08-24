

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;




public class Map {

	public static void main(String[] args) {
/*
		https://www.hackerrank.com/challenges/phone-book/problem
	
	
*/
		HashMap<String, Integer> hash = new HashMap<String, Integer>();
	      Scanner in = new Scanner(System.in);
	      int n=in.nextInt();
	      in.nextLine();
	      for(int i=0;i<n;i++)
	      {
	         String name=in.nextLine();
	         int phone=in.nextInt();
	          hash.put(name, phone);
	         in.nextLine();
	      }
	      while(in.hasNext())
	      {
	         String s=in.nextLine();
	          if (hash.containsKey(s)) {
	              System.out.println(s + "=" + hash.get(s));
	          }else if(s.equals("q"))
	          {
	        	  break;
	          }
	          else {
	              System.out.println("Not found");
	          }
	      }
		

		
		
		
		//	Set<Entry<String, Integer>> entries = months.entrySet();
		//	Iterator<Entry<String, Integer>> it = entries.iterator();


		
		
	}
}
