public class Fibonacci {

	public static void main(String[] args) {
		
	// Print Fibonacci Sequence 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144	
		
	
		fibo(10);
		

	}

	
	public static void fibo(int i) {
		
		int first = 1;
		int second = 1;
		
		int counter = 1;
		
		while(counter < i) 
		{
			System.out.println(second + "-> "+ counter );
		
			int twoofThem = first + second;
			first = second;
			second = twoofThem;
			
			counter++;
		}
		
	}
	
	
	
	
	
		
	
	
	
	
}
