public class PrimeNumbers {

	public static void main(String[] args) {
		
		// Print prime numbers btw 1 and 20
		
		for(int i=2; i <= 36; i++) {
			
			
			if(i == 2 || i == 3) {
				System.out.println(i + "  a prime number");
			}
			else {
				
				if(i % 2 == 0 || i % 3 == 0) {
					
					System.out.println(i + " not a prime number");
				}
				
				else {
					System.out.println(i + "  a prime number");
				}
			}
		
			
			
		}
		

	}

}
