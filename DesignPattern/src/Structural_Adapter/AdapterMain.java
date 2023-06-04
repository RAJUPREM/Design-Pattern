package Structural_Adapter;

public class AdapterMain {
	
	public static void main(String [] args)
	{
		System.out.println("Please go through the steps");
		
		Chef chef=new Chef();
		chef.nonVeg();
		chef.veg();
		chef.eating();
	}

}
