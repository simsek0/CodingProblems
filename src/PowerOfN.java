package HackerRank;

public class PowerOfN {

	public static void main(String[] args) {
		
		
		// to check if given number is power of three
		System.out.println(power(5));
	}
	
	public static boolean power(int num) {
		// 3 9 27 
		
		
		while(num % 3 == 0) {
			
			num = num / 3;
			
		}
		
		return  num == 1;
	}

}
