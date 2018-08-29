package inheritance;

import java.util.Scanner;

public class P4 {

	public static void main(String[] args) {
		book b = new book();
		tape t = new tape();
		b.Getpubdata();
		b.Getdata();
		t.Getpubdata();
		t.Getdata();
		b.Putdata();
		t.Putdata();

	}

}
class publication{
	String t;
	int price;
	
	Scanner s = new Scanner(System.in);
	
	public void Getpubdata() {
		System.out.println("Enter the title of publications : ");
	    t = s.next();
	    System.out.println("Enter the price of publications : ");
	    price = s.nextInt();
	}
}
class book extends publication{
	int pageCount;
	
	Scanner s = new Scanner(System.in);
	
	public void Getdata() {
	    System.out.println("Enter the page count of publi : ");
	    pageCount = s.nextInt();
	}
	public void Putdata() {
		System.out.println("The title of publication : "+t);
	    System.out.println("The price of publication : "+price);
	    System.out.println("The page count of publication : "+pageCount);
	}
}
class tape extends publication{
	int time;
	
	Scanner s = new Scanner(System.in);
	
	public void Getdata() {
	    System.out.println("Enter the running of publi... in minutes : ");
	    time = s.nextInt();
	}
	
	public void Putdata() {
		System.out.println("The title of publi : "+t);
	    System.out.println("The price of publi : "+price);
	    System.out.println("The running of publi... in minutes  "+time);
	}
}

