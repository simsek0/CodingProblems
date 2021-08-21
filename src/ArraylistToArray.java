
import java.util.*;

public class ArraylistToArray {

	public static void main(String[] args) {
		
		
		
		// convert arraylist to array
		  
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(3);
		numbers.add(5);
		numbers.add(5);
		numbers.add(5);
		numbers.add(2);
		System.out.println(numbers);
		
		
		int[] array = new int[numbers.size()];
		
		
		for(int i = 0; i < numbers.size(); i++) {
			
			array[i] = numbers.get(i);
		}
		
		for(int i = 0; i < array.length; i++) {
			
			System.out.print(array[i]+ " ");
		}
		
		
		

	}

}
