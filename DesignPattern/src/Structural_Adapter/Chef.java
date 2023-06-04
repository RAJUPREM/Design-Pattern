package Structural_Adapter;

public class Chef extends Consumer implements Cooking{

	@Override
	public void veg() {
		System.out.println("Please eat vegetables");
		
	}

	@Override
	public void nonVeg() {
		System.out.println("Please avoid to eat animals");
		
	}

	

}
