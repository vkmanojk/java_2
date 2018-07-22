package lab4;
import java.util.Scanner;

public class P12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter the total number of different books available in the store");
		int max = 5;
		int count = 0;
		int ch =1;
		int input;
		String bnm;
		String auth;
		boolean isPresent = false;
		
		store[] s = new store[max];
			
		do{
			System.out.println("Menu");
			System.out.println("1.Add a new book");
			System.out.println("2.Search a book");
			System.out.println("3.Display all the details");
			System.out.println("4.To check for shortage of books");
			input=sc.nextInt();
			switch(input){
			case 1:s[count++] = new store();
				s[count-1].addBook();
			break;
			case 2:
				System.out.println("Enter book name and author name");
				bnm = sc.next();
				auth = sc.next();
				for(int i=0;i<count;i++){
				if(s[i].title.equals(bnm) && s[i].author.equals(auth)){
					s[i].book();
					isPresent=true;
				}
			}
				if(!isPresent){
					System.out.println("Sorry the book is not available");
				}
			break;
			case 3:for(int i=0;i<count;i++){
				s[i].display();
			}break;
			case 4:for(int i=0;i<count;i++){
				if(s[i].checkShortage()){
					System.out.println("Alert: Book"+" "+s[i].title+" "+"less than ten");
				}else{
					System.out.println("You have sufficient number of copies of book"+" "+s[i].title);
				}
			}
				break;
			default:System.out.println("Please enter correct details");
			}
			System.out.println("Do you want to continue(0/1)???");
			ch=sc.nextInt();
		}while(ch==1);
		
		sc.close();
	}
}

class store{
	String author;
	String title;
	int price;
	String publisher;
	int count; 	
	int reqcop=0;
	Scanner sc = new Scanner(System.in);
	
	store(){
		System.out.println("Object successfully created");
	}
	
	public void addBook(){
		System.out.println("Enter book name");
		this.title=sc.nextLine();
		System.out.println("Enter author name");
		this.author=sc.nextLine();
		System.out.println("Enter publisher name");
		this.publisher=sc.nextLine();
		System.out.println("Enter Stock Position");
		this.count=sc.nextInt();
		System.out.println("Enter price");
		this.price=sc.nextInt();
	}
	
	
	public void book(){
		this.display();
		System.out.println("Enter the number of copies required");
		this.reqcop=sc.nextInt();
		if(!isAvailable(this.reqcop)){
			System.out.println("Sorry only"+" "+this.count+" copies available");
		}else{
			this.count=this.count-this.reqcop;
			if(this.checkShortage()){
				System.out.println("Alert: Book"+" "+this.title+" "+"less than ten");
			}
			this.bill(this.reqcop);
		}
	}
	
	public void bill(int c){
		System.out.println("Your purchase");
		System.out.println("Book Name :"+" "+this.title);
		System.out.println("Number of copies :"+" "+c);
		System.out.println("Total cost :"+" "+(c * this.price));
		System.out.println("Thank you for purchasing!!!");
		
	}
	
	public void display(){
		System.out.println("Book name is "+" "+this.title);
		System.out.println("Author name is "+" "+this.author);
		System.out.println("Price of book is "+" "+this.price);
		System.out.println("Published by "+" "+this.publisher);
		System.out.println("Total number of available copies are "+" "+this.count);
	}
	
	public boolean isAvailable(int c){
		return (c<=this.count);
	}
	
	public boolean checkShortage(){
		return (this.count<10);
	}
}
