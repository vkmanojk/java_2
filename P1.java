package inheritance;

import java.util.*;

class employee {
	private int date;
	private int month;
	private int year;
	
	int am;
	int depCode;
	
	Scanner s = new Scanner(System.in);
	
	employee() {
		date = 0;
		month = 0;
		year = 0;
		depCode = 0;
		am = 01;
		
	}
	
	employee(int a, int b, int c, int d) {
		date = a;
		month = b;
		year = c;
		depCode = d;
		am = 01;
	}
	
	public void input() {
		System.out.println("Enter the Date of Birth : (In <dd mm yyyy> format)");
		date = s.nextInt();
		month = s.nextInt();
		year = s.nextInt();
		
		System.out.println("Enter the Departmrnt Code : ");
		depCode = s.nextInt();
	}
	
	public int calcpay(int m) {
		if (month == m) {
			return 100;
		}else {
			return 0;
		}
	}
	
	public void entCurMnth() {
		System.out.println("Enter the Current Month : ");
		am = s.nextInt();
	}
}

class boss extends employee {
	int p;
	Scanner s = new Scanner(System.in);
	
	boss(int a, int b, int c, int d, int e) {
		super(a,b,c,d);
		p = e;
	}
	
	boss(){
		p = 0;
	}
	
	public void pay() {
		System.out.println("Enter the Monthly pay : ");
		p = s.nextInt();
	}
	
	public void show() {
		System.out.println("Departmrnt Code : " + depCode);
		System.out.println("The Pay for cur month : " + (p+calcpay(am)));
	}
}

class pieceWorker extends employee {
	int p;
	Scanner s = new Scanner(System.in);
	
	pieceWorker(int a, int b, int c, int d, int e) {
		super(a,b,c,d);
		p = e;
	}
	
	pieceWorker(){
		p = 0;
	}
	
	public void pay() {
		System.out.println("Enter the Monthly pay : ");
		p = s.nextInt();
	}
	
	public void show() {
		System.out.println("Departmrnt Code : " + depCode);
		System.out.println("The Pay for cur month : " + (p+calcpay(am)));
	}
}

class hourlyWorker extends employee {
	int p;
	Scanner s = new Scanner(System.in);
	
	hourlyWorker(int a, int b, int c, int d, int e) {
		super(a,b,c,d);
		p = e;
	}
	
	hourlyWorker(){
		p = 0;
	}
	
	public void pay() {
		System.out.println("Enter the Monthly pay : ");
		p = s.nextInt();
	}
	
	public void show() {
		System.out.println("Departmrnt Code : " + depCode);
		System.out.println("The Pay for cur month : " + p+calcpay(am));
	}
}

class commissionWorker extends employee {
	int p;
	Scanner s = new Scanner(System.in);
	
	commissionWorker(int a, int b, int c, int d, int e) {
		super(a,b,c,d);
		p = e;
	}
	
	commissionWorker(){
		p = 0;
	}
	
	public void pay() {
		System.out.println("Enter the Monthly pay : ");
		p = s.nextInt();
	}
	
	public void show() {
		System.out.println("Departmrnt Code : " + depCode);
		System.out.println("The Pay for cur month : " + p+calcpay(am));
	}
}

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boss b = new boss(01,02,1999,1,50000);
		b.entCurMnth();
		b.show();
		
		pieceWorker p = new pieceWorker();
		p.input();
		p.pay();
		p.entCurMnth();
		p.show();
		
		hourlyWorker h = new hourlyWorker(04,05,2000,3,1000);
		h.entCurMnth();
		h.show();
		
		commissionWorker c = new commissionWorker();
		c.input();
		c.pay();
		c.entCurMnth();
		c.show();
	}

}
