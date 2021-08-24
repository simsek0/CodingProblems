

import java.util.Arrays;

public class IQ7 {

	public static void main(String[] args) {

		//Write a java program to find the second largest number in the array
		// Maximum and minimum number in the array
		
		int [] numbers = {1,25,5,90,-1,89,74,125,25,100};
		
		//1st way , using Array.sort();
		//This method will sort the array
		Arrays.sort(numbers);
		
		// The smallest number is the first element in the array
		System.out.println("Smallest is -> "+numbers[0]);
		
		// The largest number is the last element in the array
		System.out.println("Largest is -> "+numbers[numbers.length-1]);
		
		//Second largest
		System.out.println("Second largest ->"+numbers[numbers.length-2]);
		
		System.out.println("--------------");
		
		//without sorting
		int numbers2[] = {1,25,5,90,-1,89,74,125,25,100};
		
		int biggest=0;
		int smallest=0;
		int secondBiggest=0;
		
		for(Integer i:numbers2)
		{
			if(i>biggest)
			{
				biggest=i;
			}
			else if(i<smallest)
			{
				smallest=i;
			}
			else if(i>secondBiggest && i<biggest)
			{
				secondBiggest=i;
			}
		}
		
		System.out.println("biggest="+biggest+
						   "\nsecondBiggest="+secondBiggest+
						   "\nsmallest="+smallest);
		
		
	}

}
