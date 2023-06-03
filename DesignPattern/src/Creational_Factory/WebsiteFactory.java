package Creational_Factory;

public abstract class WebsiteFactory {
	
	public int rate;
	public abstract void rating();
	
	public int showRating()
	{
		return rate;
	}

}

class forntEnd extends WebsiteFactory
{
	@Override
	public void rating() {
		
		rate=3;	
	}
	
}

class backEnd extends WebsiteFactory
{
	public void rating()
	{
		rate=4;
	}
}

class databaseEnd extends WebsiteFactory
{
	public void rating()
	{
		rate=4;
	}
}
