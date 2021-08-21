import java.util.Scanner;

public class ArrayGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Scanner scan = new Scanner(System.in);
	        int q = scan.nextInt();
	        while (q-- > 0) {
	            int n = scan.nextInt();
	            int leap = scan.nextInt();
	            
	            int[] game = new int[n];
	            for (int i = 0; i < n; i++) {
	                game[i] = scan.nextInt();
	            }

	            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
	        }
	        scan.close();
	    
	}

	public static boolean canWin(int leap,int[] game)
	{
		return true;

	
	}
}
