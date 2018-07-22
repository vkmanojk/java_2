package lab4;

public class P5 {

	//public static void main(String[] args) {
		 //Static integer variable
		   static int var1=77; 
		   //non-static string variable
		   String var2;

		   public static void main(String args[])
		   {
			P5 ob1 = new P5();
			P5 ob2 = new P5();
			
		        //Assigning the value to static variable using object ob1
			ob1.var1=88;
			ob1.var2="I'm Object1";
		        /* This will overwrite the value of var1 because var1 has a single 
		         * copy shared among both the objects.
		         */
		        ob2.var1=99;
			ob2.var2="I'm Object2";
			System.out.println("ob1 integer:"+ob1.var1);
			System.out.println("ob1 String:"+ob1.var2);
			System.out.println("ob2 integer:"+ob2.var1);
			System.out.println("ob2 STring:"+ob2.var2);
		   }

	//}

}
