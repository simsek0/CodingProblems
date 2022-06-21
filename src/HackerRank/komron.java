package HackerRank;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class komron {

	public static void main(String[] args) {
		
		System.out.println(function("dustin"));
		
	}
	
	public static boolean function(String str)
	{
		
		int length=str.length();
		Map<Character,Integer> map=new HashMap<>();
		
		
		for(int i=0;i<length;i++)
		{
			if(map.containsKey(str.charAt(i)))
			{
				int value=map.get(str.charAt(i));
				value++;
				map.put(str.charAt(i),value);
			}
			else
			{
				map.put(str.charAt(i),1);
			}
		}
		int num=map.get(str.charAt(0));
		for(int i=1;i<length;i++)
		{
			if(num != map.get(str.charAt(i)))
			{
				return false;
			}
		}
		
		return true;

	}
}
