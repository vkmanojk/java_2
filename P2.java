package eval;

import java.util.*;

public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double grade;
		boolean check;
		String ch="y";
		Grad g = new Grad();
		UGrad ug = new UGrad();
		Scanner in = new Scanner(System.in);
		do 
		{
			System.out.println("*************** Class Grad *********************");
			System.out.println("Enter the following details:");
			g.input();
			System.out.println("Enter the student's grade: ");
			grade=in.nextDouble();
			while(grade<0 || grade>100)
			{
				System.out.println("Please enter a valid grade: ");
				grade=in.nextDouble();
			}
			
			System.out.println("*************** Student of Class Grad *********************");
			g.output();		
			if(g.isPassed(grade))
				System.out.println("The student passed with a grade of "+grade+"!!!");
			else 
				System.out.println("The student failed with a grade of "+grade+"!!!");
			System.out.println("Do you want to continue ? (y/n)");
			ch=in.next();
		}while(ch.equalsIgnoreCase("y"));
		do 
		{
			System.out.println("*************** Class UnderGrad *********************");
			System.out.println("Enter the following details:");
			ug.input();
			System.out.println("Enter the student's grade: ");
			grade=in.nextDouble();
			while(grade<0 || grade>100)
			{
				System.out.println("Please enter a valid grade: ");
				grade=in.nextDouble();
			}
			
			System.out.println("*************** Student of Class UnderGrad *********************");
			ug.output();		
			if(ug.isPassed(grade))
				System.out.println("The student passed with a grade of "+grade+"!!!");
			else 
				System.out.println("The student failed with a grade of "+grade+"!!!");
			
			
			System.out.println("Do you want to continue ? (y/n)");
			ch=in.next();
		}while(ch.equalsIgnoreCase("y"));
		
	}

}

abstract class Student
{
	String name,address;
	int id,age;
	double grade;
	Scanner in = new Scanner(System.in);
	abstract public boolean isPassed(double grade);
	
	public void input()
	{
		System.out.println("Enter Student id: ");
		id=in.nextInt();
		System.out.println("Enter Student's name: ");
		name=in.next();
		System.out.println("Enter Student's age: ");
		age=in.nextInt();
		System.out.println("Enter Student's address: ");
		address=in.next();
	}
	
	public void setgrade(double g)
	{
		grade=g;
	}
	public void output()
	{
		System.out.println("ID            :"+id);
		System.out.println("Name          :"+name);
		System.out.println("Age           :"+age);
		//System.out.println("Grade         :"+grade);
		System.out.println("Address       :"+address);
	}
	
}

class Grad extends Student
{
	public boolean isPassed(double grade)
	{
		setgrade(grade);
		if(grade>70)
			return true;
		return false;
	}
}

class UGrad extends Student
{
	public boolean isPassed(double grade)
	{
		setgrade(grade);
		if(grade>80)
			return true;
		return false;
	}
}