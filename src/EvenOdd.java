package HackerRank;

public class EvenOdd {

	public static void main(String[] args) {
//		Even or Odd. Write a method that will accept one int as an argument. 
//		The method will print Even if the number is even and Odd if the number is odd.
		
		
		evenOdd(10);
	}
	
	public static void evenOdd(int num) {
		
		if(num % 2 == 0) {
			System.out.println(num + " is even number");
		}
		else {
			System.out.println(num + " is odd number");
		}
	}

}
