package eval;

import java.util.*;

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		fulltime f = new fulltime();
		f.input();
		System.out.println("Enter the number of hours the employee has worked:");
		f.hour=in.nextDouble();
		while(f.hour<0 || f.hour>240)
		{
			System.out.println("Please enter a valid time: ");
			f.hour=in.nextDouble();
		}
		f.computePay();
		System.out.println("***********************WORKER DETAIL*************************");
		f.display();
		
		hourly h = new hourly();
		h.input();
		System.out.println("Enter the number of hours the employee has worked:");
		h.hour=in.nextDouble();
		while(h.hour<0 || h.hour>60)
		{
			System.out.println("Please enter a valid time: ");
			h.hour=in.nextDouble();
		}
		h.computePay();
		System.out.println("***********************WORKER DETAIL*************************");
		h.display();
	}

}

abstract class worker 
{
	public String name;
	public double s_rate,pay;
	public double hour;
	Scanner in = new Scanner(System.in);
	
	abstract public double computePay();
	
	public void input()
	{
		System.out.println("Enter employee name: ");
		name=in.next();
	}
	
	public void display()
	{
		System.out.println("Name       :"+name);
		System.out.println("Salary rate:"+s_rate);
		System.out.println("Pay        :"+pay);
	}
}

class fulltime extends worker
{
	fulltime()
	{
		System.out.println("*************************FULL TIME WORKERS ***********************");
		super.s_rate=100.0;
	}
	public double computePay()
	{
		pay=hour*100;
		return pay;
	}
}

class hourly extends worker
{
	hourly()
	{
		System.out.println("*************************HOURLY WORKERS ***********************");
		super.s_rate=50;
	}
	public double computePay()
	{
		pay=hour*60;
		return pay;
	}
}