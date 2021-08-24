package HackerRank;


public class SecondLargest {

	// Write a Java program to find the second largest value from the given array.

	int maxNumber(int[] arr) {
		
		
		int max = 0;
		int second = 0;
		for(int i = 0; i < arr.length; i++) 
		{
			
			
			if(max < arr[i]) 
			{
			    second = max;
				max = arr[i];
				
			}
			else if(second < arr[i]) 
			{
				second = arr[i];
			}
		}
		
		
		return second;
	}
	
	public static void main(String[] args) {
		
		SecondLargest obj = new SecondLargest();
		
		int[] arrays = {20,13,15,31,9};
		
		System.out.println(obj.maxNumber(arrays));


	}

}
