

public class Factorial {

	public static void main(String[] args) {
		
		// Find factorial of an integer?
		
		factorial(5);
		
		

	}
	
	public static void factorial(int num) {
		
		int multiple = 1;
		for(int i = num ; i >= 1; i--) {
			
			System.out.print(i+ " ");
			
			multiple = multiple * i;
		}
		System.out.println("\n"+multiple);
	}

}
