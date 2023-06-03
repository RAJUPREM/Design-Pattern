package Creational_Factory;

public class WebsiteFactoryMiddleClass {
	
	public WebsiteFactory chooseWebType(String choice)
	{
		if(choice.equalsIgnoreCase("front"))
		{
			return new forntEnd();
		}
		
		if(choice.equalsIgnoreCase("back"))
		{
			return new backEnd();
		}
		
		if(choice.equalsIgnoreCase("db"))
		{
			return new databaseEnd();
		}
		
		return null;
	}

}
