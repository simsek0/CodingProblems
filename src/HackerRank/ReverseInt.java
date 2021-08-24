package HackerRank;
public class ReverseInt {
	
	public static void main(String[] args) {
			
		// 12345 print it 54321
		
		int num1 = 123;
		int reverse = 0;
		while(num1 != 0) {
			
			reverse = reverse * 10;
			reverse = reverse + num1 % 10;
			// 3 - > 32 -> 321 
			num1 = num1 / 10;
			// 12 - > 1 -> 0
			
		}
		
	    System.out.println(reverse + " ");
	
	
	
	}

}
