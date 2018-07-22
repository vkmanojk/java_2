package lab4;

import java.io.*;
import java.util.*;
import java.lang.*;

class P13
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s;
		char x;
		int l;
		int count=0;
		System.out.print("Enter your name: ");
		s=br.readLine();
		s=" "+s; 
		s=s.toUpperCase(); 
		l=s.length(); 
		System.out.print("Hello   ");
		for(int i=0;i<l;++i)
		{
			x=s.charAt(i);
			if(x==' ')
			{
				count++;
			}
		}
 
		for(int i=0;i<l;i++)
		{
			x=s.charAt(i);
			if(x==' ')
			{
				count--;				
				if(count==0)
				{
					for(int j=i+1;j<l;++j)
					{
						x=s.charAt(j);
						System.out.print(x);
					}
					break;
				}
				System.out.print(s.charAt(i+1)+".");
			}
			
		}
	}
}