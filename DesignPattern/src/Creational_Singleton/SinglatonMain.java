package Creational_Singleton;

public class SinglatonMain {
	
	public static void main(String [] args)
	{
		
		System.out.println("Please wait I am calling the singlaton object 3 times");
		
		System.out.println("first obj : "+Singlaton.getSinglatonObj());
		System.out.println("Second obj : "+Singlaton.getSinglatonObj());
		System.out.println("Third obj : "+Singlaton.getSinglatonObj());
	}

}
