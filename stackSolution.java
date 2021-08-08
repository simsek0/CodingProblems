package HackerRank;
import java.util.*;
public class stackSolution {

	
	
	

	static boolean findout(String str) {
		Stack<Character> myStack = new Stack<Character>();
		boolean cond=true;

		char [] array = str.toCharArray();
		
		for(char i:array)
		{
			
			if(i=='(' || i=='{' || i=='[')
			{
				myStack.push(i);
			}
			else if(myStack.isEmpty())
			{
				return false;
			}
			else
			{
				if(i==')' && myStack.pop() == '(' ||
				   i==']' && myStack.pop() == '[' ||
				   i=='}' && myStack.pop() == '{')
				{
					cond=true;
				}
				else
				{
					return false;
				}
 			}
		}
		
			return myStack.isEmpty();
		}
		public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext())
		{
			String input = sc.next();
			System.out.println(findout(input));
		}
	}
}