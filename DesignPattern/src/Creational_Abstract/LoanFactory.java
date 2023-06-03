package Creational_Abstract;

public class LoanFactory extends AbstractFactory{

	@Override
	public Bank getBankClass(String bankName) {
		
		return null;
	}

	@Override
	public Loan getLoanClass(String loanName) {
		
		if(loanName.equalsIgnoreCase("Personal"))
		{
			return new Personal();
		}
		
		if(loanName.equalsIgnoreCase("Gold"))
		{
			return new Gold();
		}
		
		if(loanName.equalsIgnoreCase("Home"))
		{
			return new Home();
		}
		
		return null;
	}

}
