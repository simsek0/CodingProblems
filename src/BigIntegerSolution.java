
import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan =new Scanner(System.in);
		
		BigInteger A,B;

		A=scan.nextBigInteger();
		B=scan.nextBigInteger();
		
		System.out.println(A.add(B)+"\n"+A.multiply(B));
		
	}

}
