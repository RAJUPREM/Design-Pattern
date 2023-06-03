package Creational_Abstract;

public class FactoryOfFactory {
	
	public AbstractFactory getFactory(String factoryName)
	{
		if(factoryName.equalsIgnoreCase("Bank"))
		{
			return new BankFactory();
		}
		
		if(factoryName.equalsIgnoreCase("Loan"))
		{
			return new LoanFactory();
		}
		
		return null;
	}

}
