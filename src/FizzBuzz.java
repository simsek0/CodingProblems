package HackerRank;

public class FizzBuzz {

	public static void main(String[] args) {
//		FizzBuzz. Print numbers from 1 to 100
//		- if a number is divisible by 3 print Fizz
//		- if a number is divisible by 5 print Buzz
//		- if a number is divisible by both 3 and 5 print FizzBuzz
		
		for(int i = 1; i <= 100; i++) {
			
			if(i % 3 == 0 & i % 5 == 0) {
				
				System.out.println(i+ " FizBuzz");
			}
			else if(i % 3 == 0) {
				System.out.println(i+ " Fiz");
			}
			else if(i % 5 == 0) {
				System.out.println(i+ " Buzz");
			}
		
			
			
		}
		
		

	}

}
