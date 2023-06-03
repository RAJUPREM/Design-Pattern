package Creational_Singleton;

public final class Singlaton {
	
	private static Singlaton singl=null;
	
	private Singlaton()
	{
		
	}
	
	public static Singlaton getSinglatonObj()
	{
		if(singl==null)
		{
			singl=new Singlaton();
			return singl;
		}
		return singl;
	}

}
