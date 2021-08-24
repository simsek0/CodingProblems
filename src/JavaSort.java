

import java.util.*;
//Mufasa simsek
//8/24
//https://www.hackerrank.com/challenges/java-sort/problem

public class JavaSort {

	public static void main(String[] args)
	{

		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		
		List<Student> studentList = new ArrayList<Student>();
		while(testCases>0){

			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();
			
			Student st = new Student(id, fname, cgpa);
			studentList.add(st);
			testCases--;
		}
      
		ArrayList <Student> myList = new ArrayList<>();
		
		myList.addAll(studentList);
		
		Iterator<Student> it=myList.iterator();
		double greatest=0;
		int index=0;
		while(it.hasNext())
		{
			double number=it.next().getCgpa();
			
			if(number>greatest)
			{
				
			}
		}
		
		
      	for(Student st: studentList){
			System.out.println(st.getFname());
		}
	}
}


class Student
{
	private int id;
	private String fName;
	private double cgpa;
	
	public Student(int id,String fName,double cgpa)
	{
		super();
		this.id=id;
		this.fName=fName;
		this.cgpa=cgpa;
	}
	public int getId()
	{
		return id;
	}
	public String getFname()
	{
		return fName;
	}
	public double getCgpa()
	{
		return cgpa;
	}
}