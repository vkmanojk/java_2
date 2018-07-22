package lab4;

import java.util.*;
public class P11 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n,i;
		System.out.println("Enter the number of customers: ");
		n=scan.nextInt();
		
		
		int flag;
		String ch="Y";
		Consumer[] C = new Consumer[n];
		for(i=0;i<n;++i)
		{
			C[i]=new Consumer();
		}
		while(ch.equalsIgnoreCase("y")){
		System.out.println("***************** MENU ******************");
		System.out.println("1.Input customer details");
		System.out.println("2.Search for customer details");
		System.out.println("3.Print bill");
		System.out.println("4.List of customer's who has to pay the bill");
		System.out.println("5.Display customer details");
		System.out.println("Enter your choice:");
		int choice=scan.nextInt();
		switch(choice)
		{
		case 1:
		System.out.println("Input");
			for(i=0;i<n;++i)
			{
				C[i].input();
			}
			System.out.println("Customer input successful...");
			break;
		case 2:
			System.out.println("Enter customer id to be searched: ");
			int item=scan.nextInt();
			flag=C[0].search(C, item);
			if(flag!=-1)
			{
			C[flag].display();
			}
			else
			System.out.println("Not found...");
			System.out.println("Successfully searched...");
			break;
		case 3:
			System.out.println("Print bill");
			System.out.println("Enter customer id: ");
			item=scan.nextInt();
			flag=C[0].search(C, item);
			if(flag!=-1)
			{
				C[flag].bill();
			}
			else
				System.out.println("Not found...");
			break;
		case 4: 
			System.out.println("List of customer's who has to pay the bill");
			System.out.println("Enter amount: ");
			float price=scan.nextFloat();
			C[0].paybill(C, price);
			break;
		case 5:
			System.out.println("Display customer details ");
			for(i=0;i<n;++i)
			{
				C[i].display();
			}	
		}
		}
		//scan.close();
	}
}


class Consumer
{
	int id,lmr,cr,unit;
	float amount;
	Scanner scan=new Scanner(System.in);
	
	public Consumer()
	{
		id=0;
		lmr=0;
		cr=0;
		unit=0;
		amount=300.0f;
	}
	
	public void input()
	{
		System.out.println("Enter customer id: ");
		this.id=scan.nextInt();
		System.out.println("Enter customer's lmr: ");
		this.lmr=scan.nextInt();
		System.out.println("Enter customer's cr: ");
		this.cr=scan.nextInt();
		calculate();
	}
	
	public int search(Consumer[] C, int item)
	{
		int flag=-1;
		for(int i=0;i<C.length;++i)
		{
			if(item==C[i].id)
			{
				flag=i;
				break;
			}
		}
		return flag;
	}
	public void calculate()
	{
		unit=cr-lmr;
		int var;
		if(unit<=150)
		{
			amount+=(unit*0.5);
		}
		else if(unit<=300)
		{
			var=unit-150;
			amount+=(var+100);
		}
		else if(unit<=450)
		{
			var=2*(unit-300);
			amount+=(200+var);
		}
		else
		{
			var=3*(unit-400);
			amount+=(300+var);
		}
	}
	
	public void display()
	{
		System.out.println("Customer's id      :  "+id);
		System.out.println("Customer's LMR     :  "+lmr);
		System.out.println("Customer's CR      :  "+cr);
		System.out.println("Total no. of units :  "+unit);
		System.out.println("Total amount       :  "+amount);
	}
	
	public void bill()
	{
		System.out.println("********** BILL **********");
		System.out.println("Customer's id      :  "+id);
		System.out.println("Customer's LMR     :  "+lmr);
		System.out.println("Customer's CR      :  "+cr);
		System.out.println("Total no. of units :  "+unit);
		System.out.println("Amount to be paid  :  "+amount);
	}
	public void paybill(Consumer[] C,float price)
	{
		for(int i=0;i<C.length;++i)
		{
			if(C[i].amount>=price)
			{
				C[i].display();
			}				
		}
	}
	//scan.close();
}

