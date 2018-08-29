package inheritance;



import java.util.Scanner;

class patient{
	Scanner s = new Scanner(System.in);
	String name;
	String disease;
	
	class date{
		int date;
		int month;
		int year;
	}
	
	date DOA = new date();
	date DOD = new date();
	
	void input() {
		System.out.println("Enter the name of the patient : ");
		name = s.next();
		System.out.println("Enter the name of the disease of the patient : ");
		disease = s.next();
		System.out.println("Enter the Date Of Admission of the patient : ");
		DOA.date = s.nextInt();
		DOA.month = s.nextInt();
		DOA.year = s.nextInt();
		System.out.println("Enter the Date Of Discharge of the patient : ");
		DOD.date = s.nextInt();
		DOD.month = s.nextInt();
		DOD.year = s.nextInt();
	}
	
	void display() {
		System.out.println("The name of the patient : "+name);
		System.out.println("The name of the disease of the patient : "+disease);
		System.out.println("The Date Of Admission of the patient : "+DOA.date+" "+DOA.month+" "+DOA.year);
		System.out.println("The Date Of Discharge of the patient : "+DOD.date+" "+DOD.month+" "+DOD.year);
	}
}

class patientAge extends patient{
	int age;
	
	Scanner s = new Scanner(System.in);
	
	void input() {
		super.input();
		System.out.println("Enter the Age of the patient : ");
		age = s.nextInt();
	}
	
	void display() {
		super.display();
		System.out.println("The Age of the patient : "+age);
	}
}

public class P5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		patientAge p[] = new patientAge[10];
		for(int i = 0; i < 10; i++) {
			p[i] = new patientAge();
		}
		int n;
		System.out.println("Enter the No. of patients : ");
		n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			System.out.println("Patient : "+(i+1));
			p[i].input();
		}
		System.out.println("The Pediatric patients are : ");
		for(int i = 0; i < n; i++) {
			if(p[i].age <= 12) {
				System.out.println("Patient : "+(i+1));
				p[i].display();
			}
		}
	}

}
