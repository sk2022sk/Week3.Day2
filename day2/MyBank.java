package week3.day2;

public class MyBank {

	public static void main(String[] args) {
		
		System.out.println("Implemented Class Method");
		
SBI object = new SBI();
object.OpenAcc();
object.providedebitcard();
object.provideCreditCard();

System.out.println("output for Interface method");

RBI Object1 = new SBI();
Object1.OpenAcc();
Object1.providedebitcard();
	}

}
