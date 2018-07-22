package lab4;

public class P9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddAmount a = new AddAmount();
		AddAmount b= new AddAmount(100.0f);
		System.out.println(a.amount);
		System.out.println(b.amount);

	}

}

class AddAmount {
	float amount=50f;
	AddAmount()
	{
		amount=50f;
	}
	AddAmount(float f)
	{
		amount+=f;
	}
	
}