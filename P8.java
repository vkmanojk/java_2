package lab4;

public class P8 {
	 private static String str = "BeginnersBook";

	   //Static class
	   static class MyNestedClass{
		//non-static method
		public void disp() {
			//Nested static class cant access non static members of the outer class
		   System.out.println(str); 
		}

	   }
	   public static void main(String args[])
	   {
	      
		P8.MyNestedClass obj = new P8.MyNestedClass();
		obj.disp();
	   }
}
