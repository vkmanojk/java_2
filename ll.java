//Count number of times a particular number occurred in linked lists

import java.util.*;
import java.lang.*;
import java.io.*;
 
class LinkedListTest {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
    	int testcases = Integer.parseInt(scan.nextLine());
		while (testcases>0) {
			    int operations= Integer.parseInt(scan.nextLine());		
	 		    ILL<Integer> list=new LL<Integer>();
	 		    String operation="";
	 		  
			   for(int i=0;i<operations;i++) {
			   if(scan.hasNextLine())	
		           operation= scan.nextLine();
					String[] temp = operation.split(" ");
					if (temp[0].equals("AF")) {
						list.addFirst(Integer.parseInt(temp[1]));
						list.printList();
					}
					else if (temp[0].equals("AL")) {
						list.addLast(Integer.parseInt(temp[1]));
						list.printList();
					}
					
					else if (temp[0].equals("RF")) {
						Integer t=list.removeFirst();
						System.out.println(t);
						if(t!=null) list.printList();
					}
					
					else if (temp[0].equals("CI")) {
					 	Integer count = list.countInteger(Integer.parseInt(temp[1]));
					 	System.out.println(count);
						//list.printList();
					}
					
					
									
				  
			  }
			  testcases--;
			}	//while loop end
		 scan.close();
		 }//static void main end
	}
 
class Node<E> {
	   private E element;
	   Node<E> next;
	   public Node(){
		   next=null;
	   }
	   public Node(E e){
		    element=e;
		    next=null;
		}
	    void setElement(E e){
	    	element=e;
	    }
	   E getElement(){
		   return element;
	   }
	   
	}
 
 
interface ILL<E> {
	void addFirst(E e);
	void addLast(E e);
	E removeFirst();
	void printList();
	int countInteger(E e);
}
 
class LL<E>  implements ILL<E>{
	private Node<E> head=null;
	private int sz=0;
	
	public void addFirst(E e){
	    Node temp=new Node(e);
	    sz++;
	   // if(sz==0)
	   // {
	   //     head = temp;
	   //     return;
	   // }
	    temp.next=head;
	    head=temp;
	    
	}
	
	public void addLast(E e){
	    Node t=new Node(e);
	    sz++;
	    if(sz==0)
	    {
	        head = t;
	        return;
	    }
	    Node temp;
	    for(temp=head;temp.next!=null;temp=temp.next);
	    temp.next=t;
	    
	}
	
	
	
	
	public E removeFirst() {
	    if(head.next==null)
	    {
	        return null;
	    }
	    E temp;
	    temp=head.getElement();
	    head.setElement(null);
	    head=head.next;
	    sz--;
	    return temp;
	}
	
	public int countInteger(E e)
	{
		Node temp;
		int count=0;
		for(temp=head;temp.next!=null;temp=temp.next)
		{
		    if(temp.getElement()==e)
		    {
		        count++;
		    }
		}
		if(temp.getElement()==e)
		    return count+1;
		return count;
	}
	
 
	public void printList(){
		if(head==null) { System.out.println("EmptyList"); return;}
		Node<E> temp=head;
		while(temp!=null) {
			System.out.print( temp.getElement()+" ");
			temp=temp.next;
		}
		System.out.println("");
		
	}
}