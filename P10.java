package lab4;
import java.util.*;
public class P10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		stack a = new stack();
		stack b = new stack();
		System.out.println("Enter the size of the stack: ");
		//a.n=scan.nextInt();
		a.input();
		System.out.println("Enter Stack elements: ");
		for(int i=0;i<a.n;++i)
		{
			int p=scan.nextInt();
			a.push(p);
		}
		System.out.println("Enter the size of the stack: ");
		//b.n=scan.nextInt();
		b.input();
		System.out.println("Enter Stack elements: ");
		for(int i=0;i<b.n;++i)
		{
			int p=scan.nextInt();
			b.push(p);
		}
		int max=a.cmpmax(b);
		System.out.println("MAX: "+max);
	}

}
class stack
{
	Scanner scan = new Scanner(System.in);
	int n=10;
	int[] data=new int[n];
	int top=-1;
	int s=0;
	void input()
	{
		n=scan.nextInt();
	}
	void push(int p)
	{
		if(s==n)
		{
			System.out.println("Overflow");
		}
		else
		{
			top=top+1;
			data[top]=p;			
			s++;
		}
	}
	int pop()
	{
		if(top==-1)
		{
			System.out.println("Underflow");
			return -1;
		}
		else
		{
			int temp=data[top];
			data[top--]=-1;
			s--;
			return temp;
		}
	}
	int cmpmax(stack s)
	{
		int max=this.pop();
		if(max<s.pop())
		{
			max=s.pop();
			System.out.println("Stack 2");
		}
		else System.out.println("Stack 1");
		return max;
	}
}
