
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class JavaList {

	public static void main(String[] args) {

		
		Scanner scan= new Scanner(System.in);
		//I will use Linked List because it`s easy
		//to insert and remove
		List<Integer>myList=new LinkedList<>();
		
		int size=scan.nextInt();
		
		for(int i=0;i<size;i++)
		{
			myList.add(scan.nextInt());
		}
		int Q=scan.nextInt();
		
		for(int i=0;i<Q;i++)
		{
			String str=scan.next();
			if(str.equals("Insert"))
			{
				int index=scan.nextInt();
				int number=scan.nextInt();
				myList.add(index,number);
				
			}else if(str.equals("Delete"))
			{
				myList.remove(scan.nextInt());
			}
		}
		
		for(Integer i:myList)
		{
			System.out.print(i+" ");
		}
		
		scan.close();
	}

}
