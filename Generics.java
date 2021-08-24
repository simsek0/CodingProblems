package HackerRank;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

//Mufasa Simsek
//8/23/2021
//https://www.hackerrank.com/challenges/java-generics/problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign
public class Generics {

	public static void main(String[] args) {

		Printer myPrinter = new Printer();
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
        int count = 0;

        for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();

            if(name.equals("printArray"))
                count++;
        }

        if(count > 1)System.out.println("Method overloading is not allowed!");
      
		
	}


}
 class Printer
{
	
	
	public static <T> void printArray(T[] x)
	{
		for(T b:x)
		{
			System.out.println(b);
		}
		
	}
}