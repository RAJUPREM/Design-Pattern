package Creational_Abstract;

public abstract class AbstractFactory {
	
	public abstract Bank getBankClass(String bankName);
	public abstract Loan getLoanClass(String loanName);

}
