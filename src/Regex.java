package HackerRank;

import java.util.regex.*;
import java.util.*;
class Regex{
	public static void main(String [] args)
	{
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			String IP = in.next();
			System.out.println(IP.matches(new Solution().pattern));
		}
	}
}

class Solution {
	String num="([01]?\\d{1,2}|2[0-4]\\d|25[0-5])";
	String pattern = num+"."+num+"."+num+"."+"."+num;
}