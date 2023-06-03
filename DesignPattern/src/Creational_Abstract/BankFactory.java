package Creational_Abstract;

public class BankFactory extends AbstractFactory{

	@Override
	public Bank getBankClass(String bankName) {
		
		
		if(bankName.equalsIgnoreCase("SBI"))
		{
			return new SBI();
		}
		
		if(bankName.equalsIgnoreCase("HDFC"))
		{
			return new HDFC();
		}
		
		if(bankName.equalsIgnoreCase("ICICI"))
		{
			return new ICICI();
		}
		
		
		
		return null;
	}

	@Override
	public Loan getLoanClass(String loanName) {
		
		return null;
	}

}
